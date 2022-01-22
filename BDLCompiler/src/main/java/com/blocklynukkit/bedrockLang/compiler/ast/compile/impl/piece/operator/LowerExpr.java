package com.blocklynukkit.bedrockLang.compiler.ast.compile.impl.piece.operator;

import com.blocklynukkit.bedrockLang.compiler.ast.compile.*;
import com.blocklynukkit.bedrockLang.compiler.ast.compile.gen.operator.LowerExprGenerator;
import com.blocklynukkit.bedrockLang.compiler.ast.compile.impl.type.BasicValueType;
import com.blocklynukkit.bedrockLang.compiler.ast.util.SourcePos;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public final class LowerExpr extends ExprBase {
    private Expr left;
    private Expr right;

    public LowerExpr(@NonNull SourcePos sourcePos, @NonNull Piece parent) {
        super(sourcePos, parent);
    }

    @Override
    public ValueType getReturnType() {
        return BasicValueType.BOOLEAN;
    }

    @Override
    public ExprCodeGenerator getCodeGenerator() {
        return new LowerExprGenerator(this);
    }
}
