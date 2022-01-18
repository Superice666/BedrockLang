package com.blocklynukkit.bedrockLang.compiler.ast.compile.gen;

import com.blocklynukkit.bedrockLang.compiler.ast.compile.ExprCodeGenerator;
import com.blocklynukkit.bedrockLang.compiler.ast.compile.Unit;
import com.blocklynukkit.bedrockLang.compiler.ast.compile.ValueType;
import com.blocklynukkit.bedrockLang.compiler.ast.compile.impl.piece.MethodInvokeExpr;
import com.blocklynukkit.bedrockLang.compiler.ast.compile.impl.piece.ReadVariableExpr;
import lombok.RequiredArgsConstructor;
import lombok.val;
import lombok.var;

import static com.blocklynukkit.bedrockLang.compiler.ast.util.RequireUtils.requireASM;

@RequiredArgsConstructor
public final class MethodInvokeExprGenerator implements ExprCodeGenerator {
    private final MethodInvokeExpr methodInvokeExpr;

    @Override
    public ValueType generate(Unit unit) {
        val asmUnit = requireASM(unit);
        val mv = asmUnit.getCurrentMethodVisitor();
        // 生成函数调用
        var previousClass = "java/lang/Object";
        MethodInvokeExpr.ChainAction[] chainActions = methodInvokeExpr.getChainActions();
        for (int i = 0, chainActionsLength = chainActions.length; i < chainActionsLength; i++) {
            if (i == chainActionsLength - 1) {
                // 生成所有参数的字节码
                for (val each : methodInvokeExpr.getArgs()) {
                    each.getCodeGenerator().generate(unit);
                }
            }
            val each = chainActions[i];
            switch (each.getActionType()) {
                case Class:
                    //无需操作，L25完成了任务
                    break;
                case Var:
                    new ReadVariableExpr(methodInvokeExpr.getSourcePos(), methodInvokeExpr, each.getContent()).getCodeGenerator().generate(unit);
                    break;
                case StaticField:
                    mv.visitFieldInsn(GETSTATIC, previousClass, each.getContent(), each.getClassInfo().toASMType().getDescriptor());
                    break;
                case VirtualField:
                    mv.visitFieldInsn(GETFIELD, previousClass, each.getContent(), each.getClassInfo().toASMType().getDescriptor());
                    break;
                case StaticMethod:
                    mv.visitMethodInsn(INVOKESTATIC, previousClass, each.getContent(), each.getMethodDescriptor(), false);
                    break;
                case VirtualMethod:
                    mv.visitMethodInsn(INVOKEVIRTUAL, previousClass, each.getContent(), each.getMethodDescriptor(), false);
                    break;
            }
            previousClass = each.getClassInfo().getQualifiedName();
        }
        return methodInvokeExpr.getReturnType();
    }
}