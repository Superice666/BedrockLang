package com.blocklynukkit.bedrockLang.compiler.ast.compile.impl.command;

import com.blocklynukkit.bedrockLang.compiler.ast.compile.*;
import com.blocklynukkit.bedrockLang.compiler.ast.compile.impl.variable.CmdArgVariable;
import com.blocklynukkit.bedrockLang.compiler.ast.util.SourcePos;

public final class VariableCmdArg implements CmdArg, Declaration<Variable> {
    private final String name;
    private final ValueType valueType;
    private final SourcePos sourcePos;

    public VariableCmdArg(String name, ValueType valueType, SourcePos sourcePos) {
        this.name = name;
        this.valueType = valueType;
        this.sourcePos = sourcePos;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public ArgTrait getTrait() {
        return ArgTrait.Variable;
    }

    @Override
    public boolean hasValueType() {
        return true;
    }

    @Override
    public ValueType getValueType() {
        return valueType;
    }

    @Override
    public SourcePos getSourcePos() {
        return sourcePos;
    }

    @Override
    public Variable declare() {
        return new CmdArgVariable(name, valueType, sourcePos);
    }
}
