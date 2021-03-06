package com.blocklynukkit.bedrockLang.compiler.ast.compile.type;

import org.objectweb.asm.Type;

import java.util.Arrays;

public final class InternalJavaClassInfo extends ClassInfo implements ToJavaClass {
    private final Class<?> clazz;

    public InternalJavaClassInfo(Class<?> clazz) {
        this.clazz = clazz;
    }

    @Override
    public String getQualifiedName() {
        return clazz.getName().replace('.', '/');
    }

    @Override
    public String getSimpleName() {
        return clazz.getSimpleName();
    }

    @Override
    public String getFullName() {
        return clazz.getName();
    }

    @Override
    public String getPackage() {
        return clazz.getPackage().getName();
    }

    @Override
    public MethodInfo[] getMethods() {
        return Arrays.stream(clazz.getMethods()).map(InternalJavaMethodInfo::new).toArray(MethodInfo[]::new);
    }

    @Override
    public FieldInfo[] getFields() {
        return Arrays.stream(clazz.getFields()).map(InternalJavaFieldInfo::new).toArray(FieldInfo[]::new);
    }

    @Override
    public MethodInfo[] getMethodFuzzy(String methodName) {
        return Arrays.stream(clazz.getMethods()).filter(method -> before$(method.getName()).equals(methodName))
                .map(InternalJavaMethodInfo::new).toArray(MethodInfo[]::new);
    }

    @Override
    public MethodInfo[] getMethodFuzzy(String methodName, ClassInfo... argTypes) {
        return Arrays.stream(getMethodFuzzy(methodName)).filter(methodInfo -> {
            final ClassInfo[] args = methodInfo.getArgumentClassTypes();
            if (argTypes.length != args.length) {
                return false;
            }
            for (int i = 0; i < args.length; i++) {
                if (!argTypes[i].canCastTo(args[i])) {
                    return false;
                }
            }
            return true;
        }).toArray(MethodInfo[]::new);
    }

    @Override
    public MethodInfo[] getMethod(String methodName) {
        return Arrays.stream(clazz.getMethods()).filter(method -> method.getName().equals(methodName))
                .map(InternalJavaMethodInfo::new).toArray(MethodInfo[]::new);
    }

    @Override
    public MethodInfo getMethod(String methodName, ClassInfo... argTypes) {
        return Arrays.stream(getMethod(methodName)).filter(methodInfo -> {
            final ClassInfo[] args = methodInfo.getArgumentClassTypes();
            if (argTypes.length != args.length) {
                return false;
            }
            for (int i = 0; i < args.length; i++) {
                if (!argTypes[i].canCastTo(args[i])) {
                    return false;
                }
            }
            return true;
        }).findFirst().orElse(null);
    }

    @Override
    public MethodInfo[] getConstructor() {
        return Arrays.stream(clazz.getConstructors()).map(InternalJavaConstructorInfo::new).toArray(MethodInfo[]::new);
    }

    @Override
    public MethodInfo getConstructor(ClassInfo... argTypes) {
        return Arrays.stream(getConstructor()).filter(methodInfo -> {
            final ClassInfo[] args = methodInfo.getArgumentClassTypes();
            if (argTypes.length != args.length) {
                return false;
            }
            for (int i = 0; i < args.length; i++) {
                if (!argTypes[i].canCastTo(args[i])) {
                    return false;
                }
            }
            return true;
        }).findFirst().orElse(null);
    }

    @Override
    public FieldInfo getField(String name) {
        try {
            return new InternalJavaFieldInfo(clazz.getField(name));
        } catch (NoSuchFieldException e) {
            return null;
        }
    }

    @Override
    public Type toASMType() {
        return Type.getType(clazz);
    }

    @Override
    public int getModifier() {
        return clazz.getModifiers();
    }

    @Override
    public boolean hasImplementInterface(ClassInfo interfaceClass) {
        if (this.getFullName().equals(interfaceClass.getFullName())) {
            return true;
        }
        if (interfaceClass.isInterface()) {
            Class<?> superClass = clazz;
            while (superClass != null) {
                for (final Class<?> each : superClass.getInterfaces()) {
                    if (each.getName().equals(interfaceClass.getFullName())) {
                        return true;
                    }
                }
                superClass = superClass.getSuperclass();
            }
        }
        return false;
    }

    @Override
    public ClassInfo matchClassImplementedInterface(ClassInfo interfaceClass) {
        if (this.getFullName().equals(interfaceClass.getFullName())) {
            return this;
        }
        if (interfaceClass.isInterface()) {
            Class<?> superClass = clazz;
            while (superClass != null) {
                for (final Class<?> each : superClass.getInterfaces()) {
                    if (each.getName().equals(interfaceClass.getFullName())) {
                        return new InternalJavaClassInfo(superClass);
                    }
                }
                superClass = superClass.getSuperclass();
            }
        }
        return null;
    }

    @Override
    public boolean canCastTo(ClassInfo classInfo) {
        if (classInfo instanceof ToJavaClass) {
            return ((ToJavaClass) classInfo).getJavaClass().isAssignableFrom(clazz);
        }
        Class<?> superClass = clazz;
        while (superClass != null) {
            if (superClass.getName().equals(classInfo.getFullName())) {
                return true;
            }
            for (final Class<?> each : superClass.getInterfaces()) {
                if (each.getName().equals(classInfo.getFullName())) {
                    return true;
                }
            }
            superClass = superClass.getSuperclass();
        }
        return false;
    }

    private static String before$(String str) {
        return str.contains("$") ? str.substring(0, str.indexOf('$')) : str;
    }

    @Override
    public Class<?> getJavaClass() {
        return clazz;
    }
}
