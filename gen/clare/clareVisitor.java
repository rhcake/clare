// Generated from C:/Users/Otto/Desktop/clare/clare.g4 by ANTLR 4.2

package clare;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link clareParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface clareVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link clareParser#stmVarDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmVarDecl(@NotNull clareParser.StmVarDeclContext ctx);

	/**
	 * Visit a parse tree produced by {@link clareParser#exId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExId(@NotNull clareParser.ExIdContext ctx);

	/**
	 * Visit a parse tree produced by {@link clareParser#exField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExField(@NotNull clareParser.ExFieldContext ctx);

	/**
	 * Visit a parse tree produced by {@link clareParser#mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(@NotNull clareParser.ModContext ctx);

	/**
	 * Visit a parse tree produced by {@link clareParser#stmIf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmIf(@NotNull clareParser.StmIfContext ctx);

	/**
	 * Visit a parse tree produced by {@link clareParser#exCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExCall(@NotNull clareParser.ExCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link clareParser#stmRet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmRet(@NotNull clareParser.StmRetContext ctx);

	/**
	 * Visit a parse tree produced by {@link clareParser#exParen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExParen(@NotNull clareParser.ExParenContext ctx);

	/**
	 * Visit a parse tree produced by {@link clareParser#exMulDiv}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExMulDiv(@NotNull clareParser.ExMulDivContext ctx);

	/**
	 * Visit a parse tree produced by {@link clareParser#topClassDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopClassDef(@NotNull clareParser.TopClassDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link clareParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(@NotNull clareParser.ParamsContext ctx);

	/**
	 * Visit a parse tree produced by {@link clareParser#topFunDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTopFunDef(@NotNull clareParser.TopFunDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link clareParser#exAddSub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExAddSub(@NotNull clareParser.ExAddSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link clareParser#stmVarDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmVarDef(@NotNull clareParser.StmVarDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link clareParser#exInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExInt(@NotNull clareParser.ExIntContext ctx);

	/**
	 * Visit a parse tree produced by {@link clareParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(@NotNull clareParser.FieldsContext ctx);

	/**
	 * Visit a parse tree produced by {@link clareParser#stmMove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmMove(@NotNull clareParser.StmMoveContext ctx);

	/**
	 * Visit a parse tree produced by {@link clareParser#argdecls}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgdecls(@NotNull clareParser.ArgdeclsContext ctx);
}