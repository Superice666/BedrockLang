package com.blocklynukkit.bedrockLang.compiler.ast.compile.gen;

import com.blocklynukkit.bedrockLang.compiler.ast.compile.*;
import com.blocklynukkit.bedrockLang.compiler.ast.compile.impl.piece.ReadVariableExpr;
import com.blocklynukkit.bedrockLang.compiler.ast.compile.type.TypeLookup;
import org.objectweb.asm.MethodVisitor;

import static com.blocklynukkit.bedrockLang.compiler.ast.util.RequireUtils.requireASM;

public final class ReadVariableExprGenerator implements ExprCodeGenerator {
    private final ReadVariableExpr expr;

    public ReadVariableExprGenerator(ReadVariableExpr expr) {
        this.expr = expr;
    }

    @Override
    public ValueType generate(Unit unit) {
        final GenerateWithASM asmUnit = requireASM(unit);
        final MethodVisitor mv = asmUnit.getCurrentMethodVisitor();
        final TypeLookup lookup = asmUnit.getTypeLookup();
        final VariableRecord variable = expr.getVariable();
        if(variable.getType() == VariableRecord.VariableType.LOCAL){
            mv.visitVarInsn(lookup.lookup(variable.getVariable().getType()).getOpcode(ILOAD), variable.getIndex());
        }else if(variable.getType() == VariableRecord.VariableType.UNIT_GLOBAL){
            mv.visitFieldInsn(GETSTATIC, asmUnit.getTypeLookup().lookup(unit).getInternalName(), variable.getVariable().getName()
                    , asmUnit.getTypeLookup().lookup(variable.getVariable().getType()).getDescriptor());
        }else {
            // TODO: 2022/1/3 完成外部域导入
        }
        return variable.getVariable().getType();
    }
}
