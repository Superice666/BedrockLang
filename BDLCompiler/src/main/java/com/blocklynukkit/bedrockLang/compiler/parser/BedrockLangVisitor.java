// Generated from D:/ideaProject/BedrockLang/BDLCompiler/src/main/antlr\BedrockLang.g4 by ANTLR 4.9.1
package com.blocklynukkit.bedrockLang.compiler.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BedrockLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BedrockLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BedrockLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(BedrockLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link BedrockLangParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(BedrockLangParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commandExpr}
	 * labeled alternative in {@link BedrockLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommandExpr(BedrockLangParser.CommandExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varExpr}
	 * labeled alternative in {@link BedrockLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarExpr(BedrockLangParser.VarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setVarExpr}
	 * labeled alternative in {@link BedrockLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVarExpr(BedrockLangParser.SetVarExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code devideExpr}
	 * labeled alternative in {@link BedrockLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDevideExpr(BedrockLangParser.DevideExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bracketExpr}
	 * labeled alternative in {@link BedrockLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExpr(BedrockLangParser.BracketExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link BedrockLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(BedrockLangParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negativeExpr}
	 * labeled alternative in {@link BedrockLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeExpr(BedrockLangParser.NegativeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code positiveExpr}
	 * labeled alternative in {@link BedrockLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositiveExpr(BedrockLangParser.PositiveExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplyExpr}
	 * labeled alternative in {@link BedrockLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpr(BedrockLangParser.MultiplyExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusExpr}
	 * labeled alternative in {@link BedrockLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpr(BedrockLangParser.MinusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code remainExpr}
	 * labeled alternative in {@link BedrockLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemainExpr(BedrockLangParser.RemainExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusExpr}
	 * labeled alternative in {@link BedrockLangParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpr(BedrockLangParser.PlusExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importSingleStatic}
	 * labeled alternative in {@link BedrockLangParser#importStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportSingleStatic(BedrockLangParser.ImportSingleStaticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importAllStatic}
	 * labeled alternative in {@link BedrockLangParser#importStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportAllStatic(BedrockLangParser.ImportAllStaticContext ctx);
	/**
	 * Visit a parse tree produced by the {@code importClass}
	 * labeled alternative in {@link BedrockLangParser#importStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportClass(BedrockLangParser.ImportClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link BedrockLangParser#whenStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenStat(BedrockLangParser.WhenStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link BedrockLangParser#defineCmdStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineCmdStat(BedrockLangParser.DefineCmdStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link BedrockLangParser#defineSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineSignature(BedrockLangParser.DefineSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link BedrockLangParser#defineSignatureWordSingle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineSignatureWordSingle(BedrockLangParser.DefineSignatureWordSingleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BedrockLangParser#defineSignatureWordMultiple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineSignatureWordMultiple(BedrockLangParser.DefineSignatureWordMultipleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BedrockLangParser#defineSignatureVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefineSignatureVariable(BedrockLangParser.DefineSignatureVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hasTypeVarDeclare}
	 * labeled alternative in {@link BedrockLangParser#declareVarStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHasTypeVarDeclare(BedrockLangParser.HasTypeVarDeclareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inferTypeVarDeclare}
	 * labeled alternative in {@link BedrockLangParser#declareVarStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInferTypeVarDeclare(BedrockLangParser.InferTypeVarDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link BedrockLangParser#returnStat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStat(BedrockLangParser.ReturnStatContext ctx);
	/**
	 * Visit a parse tree produced by {@link BedrockLangParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(BedrockLangParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link BedrockLangParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(BedrockLangParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link BedrockLangParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(BedrockLangParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link BedrockLangParser#varid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarid(BedrockLangParser.VaridContext ctx);
}