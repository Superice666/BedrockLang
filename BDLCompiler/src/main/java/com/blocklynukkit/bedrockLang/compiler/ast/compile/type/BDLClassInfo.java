package com.blocklynukkit.bedrockLang.compiler.ast.compile.type;

import com.blocklynukkit.bedrockLang.compiler.ast.compile.CmdArg;
import com.blocklynukkit.bedrockLang.compiler.ast.compile.impl.unit.BDLUnit;
import com.blocklynukkit.bedrockLang.compiler.ast.compile.impl.variable.UnitGlobalVariable;
import com.blocklynukkit.bedrockLang.compiler.ast.util.ArrayUtils;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.objectweb.asm.Type;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;

@RequiredArgsConstructor
public final class BDLClassInfo extends ClassInfo {
    private final BDLUnit bdlUnit;

    @Override
    public String getQualifiedName() {
        return bdlUnit.getName().replace(".", "/");
    }

    @Override
    public String getSimpleName() {
        return bdlUnit.getName().substring(bdlUnit.getName().indexOf(".") + 1);
    }

    @Override
    public String getFullName() {
        return bdlUnit.getName();
    }

    @Override
    public String getPackage() {
        return bdlUnit.getName().substring(0, bdlUnit.getName().indexOf("."));
    }

    @Override
    public MethodInfo[] getMethods() {
        val list = new ArrayList<MethodInfo>();
        for (val each : bdlUnit.getUnitCommands().values()) {
            for (val cmd : each) {
                list.add(new BDLMethodInfo(cmd, bdlUnit.getTypeLookup()));
            }
        }
        return list.toArray(new MethodInfo[0]);
    }

    @Override
    public FieldInfo[] getFields() {
        return bdlUnit.getUnitVariables().values().stream()
                .map(variable -> new BDLFieldInfo((UnitGlobalVariable) variable, bdlUnit.getTypeLookup()))
                .toArray(FieldInfo[]::new);
    }

    @Override
    public MethodInfo[] getMethodFuzzy(String methodName) {
        val list = new ArrayList<MethodInfo>();
        for (val each : bdlUnit.getUnitCommands().entrySet()) {
            if (before$(each.getKey()).equals(methodName)) {
                for (val cmd : each.getValue()) {
                    list.add(new BDLMethodInfo(cmd, bdlUnit.getTypeLookup()));
                }
            }
        }
        return list.toArray(new MethodInfo[0]);
    }

    @Override
    public MethodInfo[] getMethodFuzzy(String methodName, Type... argTypes) {
        val list = new ArrayList<MethodInfo>();
        for (val each : bdlUnit.getUnitCommands().entrySet()) {
            if (before$(each.getKey()).equals(methodName)) {
                for (val cmd : each.getValue()) {
                    if(ArrayUtils.equals(Arrays.stream(cmd.getArgs()).filter(CmdArg::hasValueType)
                            .map(CmdArg::getValueType)
                            .map(vt -> bdlUnit.getTypeLookup().lookup(vt))
                            .toArray(Type[]::new), argTypes)){
                        list.add(new BDLMethodInfo(cmd, bdlUnit.getTypeLookup()));
                    }
                }
            }
        }
        return list.toArray(new MethodInfo[0]);
    }

    @Override
    public MethodInfo[] getMethod(String methodName) {
        val list = new ArrayList<MethodInfo>();
        if (bdlUnit.getUnitCommands().containsKey(methodName)) {
            for (val cmd : bdlUnit.getUnitCommands().get(methodName)) {
                list.add(new BDLMethodInfo(cmd, bdlUnit.getTypeLookup()));
            }
        }
        return list.toArray(new MethodInfo[0]);
    }

    @Override
    public MethodInfo getMethod(String methodName, Type... argTypes) {
        if (bdlUnit.getUnitCommands().containsKey(methodName)) {
            for (val cmd : bdlUnit.getUnitCommands().get(methodName)) {
                if (ArrayUtils.equals(Arrays.stream(cmd.getArgs()).filter(CmdArg::hasValueType)
                        .map(CmdArg::getValueType)
                        .map(vt -> bdlUnit.getTypeLookup().lookup(vt))
                        .toArray(Type[]::new), argTypes)) {
                    return new BDLMethodInfo(cmd, bdlUnit.getTypeLookup());
                }
            }
        }
        return null;
    }

    @Override
    public FieldInfo getField(String name) {
        return new BDLFieldInfo((UnitGlobalVariable) bdlUnit.getUnitVariables().get(name), bdlUnit.getTypeLookup());
    }

    @Override
    public Type toASMType() {
        return Type.getType("L" + getQualifiedName() + ";");
    }

    @Override
    public int getModifier() {
        return Modifier.PUBLIC;
    }

    private static String before$(@NonNull String str) {
        return str.contains("$") ? str.substring(0, str.indexOf('$')) : str;
    }
}