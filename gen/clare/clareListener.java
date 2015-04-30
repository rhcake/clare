// Generated from C:/Users/Otto/Desktop/clare/clare.g4 by ANTLR 4.2

package clare;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link clareParser}.
 */
public interface clareListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link clareParser#stmVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterStmVarDecl(@NotNull clareParser.StmVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link clareParser#stmVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitStmVarDecl(@NotNull clareParser.StmVarDeclContext ctx);

	/**
	 * Enter a parse tree produced by {@link clareParser#exId}.
	 * @param ctx the parse tree
	 */
	void enterExId(@NotNull clareParser.ExIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link clareParser#exId}.
	 * @param ctx the parse tree
	 */
	void exitExId(@NotNull clareParser.ExIdContext ctx);

	/**
	 * Enter a parse tree produced by {@link clareParser#exField}.
	 * @param ctx the parse tree
	 */
	void enterExField(@NotNull clareParser.ExFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link clareParser#exField}.
	 * @param ctx the parse tree
	 */
	void exitExField(@NotNull clareParser.ExFieldContext ctx);

	/**
	 * Enter a parse tree produced by {@link clareParser#mod}.
	 * @param ctx the parse tree
	 */
	void enterMod(@NotNull clareParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by {@link clareParser#mod}.
	 * @param ctx the parse tree
	 */
	void exitMod(@NotNull clareParser.ModContext ctx);

	/**
	 * Enter a parse tree produced by {@link clareParser#stmIf}.
	 * @param ctx the parse tree
	 */
	void enterStmIf(@NotNull clareParser.StmIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link clareParser#stmIf}.
	 * @param ctx the parse tree
	 */
	void exitStmIf(@NotNull clareParser.StmIfContext ctx);

	/**
	 * Enter a parse tree produced by {@link clareParser#exCall}.
	 * @param ctx the parse tree
	 */
	void enterExCall(@NotNull clareParser.ExCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link clareParser#exCall}.
	 * @param ctx the parse tree
	 */
	void exitExCall(@NotNull clareParser.ExCallContext ctx);

	/**
	 * Enter a parse tree produced by {@link clareParser#stmRet}.
	 * @param ctx the parse tree
	 */
	void enterStmRet(@NotNull clareParser.StmRetContext ctx);
	/**
	 * Exit a parse tree produced by {@link clareParser#stmRet}.
	 * @param ctx the parse tree
	 */
	void exitStmRet(@NotNull clareParser.StmRetContext ctx);

	/**
	 * Enter a parse tree produced by {@link clareParser#exParen}.
	 * @param ctx the parse tree
	 */
	void enterExParen(@NotNull clareParser.ExParenContext ctx);
	/**
	 * Exit a parse tree produced by {@link clareParser#exParen}.
	 * @param ctx the parse tree
	 */
	void exitExParen(@NotNull clareParser.ExParenContext ctx);

	/**
	 * Enter a parse tree produced by {@link clareParser#exMulDiv}.
	 * @param ctx the parse tree
	 */
	void enterExMulDiv(@NotNull clareParser.ExMulDivContext ctx);
	/**
	 * Exit a parse tree produced by {@link clareParser#exMulDiv}.
	 * @param ctx the parse tree
	 */
	void exitExMulDiv(@NotNull clareParser.ExMulDivContext ctx);

	/**
	 * Enter a parse tree produced by {@link clareParser#topClassDef}.
	 * @param ctx the parse tree
	 */
	void enterTopClassDef(@NotNull clareParser.TopClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link clareParser#topClassDef}.
	 * @param ctx the parse tree
	 */
	void exitTopClassDef(@NotNull clareParser.TopClassDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link clareParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(@NotNull clareParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link clareParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(@NotNull clareParser.ParamsContext ctx);

	/**
	 * Enter a parse tree produced by {@link clareParser#topFunDef}.
	 * @param ctx the parse tree
	 */
	void enterTopFunDef(@NotNull clareParser.TopFunDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link clareParser#topFunDef}.
	 * @param ctx the parse tree
	 */
	void exitTopFunDef(@NotNull clareParser.TopFunDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link clareParser#exAddSub}.
	 * @param ctx the parse tree
	 */
	void enterExAddSub(@NotNull clareParser.ExAddSubContext ctx);
	/**
	 * Exit a parse tree produced by {@link clareParser#exAddSub}.
	 * @param ctx the parse tree
	 */
	void exitExAddSub(@NotNull clareParser.ExAddSubContext ctx);

	/**
	 * Enter a parse tree produced by {@link clareParser#stmVarDef}.
	 * @param ctx the parse tree
	 */
	void enterStmVarDef(@NotNull clareParser.StmVarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link clareParser#stmVarDef}.
	 * @param ctx the parse tree
	 */
	void exitStmVarDef(@NotNull clareParser.StmVarDefContext ctx);

	/**
	 * Enter a parse tree produced by {@link clareParser#exInt}.
	 * @param ctx the parse tree
	 */
	void enterExInt(@NotNull clareParser.ExIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link clareParser#exInt}.
	 * @param ctx the parse tree
	 */
	void exitExInt(@NotNull clareParser.ExIntContext ctx);

	/**
	 * Enter a parse tree produced by {@link clareParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(@NotNull clareParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link clareParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(@NotNull clareParser.FieldsContext ctx);

	/**
	 * Enter a parse tree produced by {@link clareParser#stmMove}.
	 * @param ctx the parse tree
	 */
	void enterStmMove(@NotNull clareParser.StmMoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link clareParser#stmMove}.
	 * @param ctx the parse tree
	 */
	void exitStmMove(@NotNull clareParser.StmMoveContext ctx);

	/**
	 * Enter a parse tree produced by {@link clareParser#argdecls}.
	 * @param ctx the parse tree
	 */
	void enterArgdecls(@NotNull clareParser.ArgdeclsContext ctx);
	/**
	 * Exit a parse tree produced by {@link clareParser#argdecls}.
	 * @param ctx the parse tree
	 */
	void exitArgdecls(@NotNull clareParser.ArgdeclsContext ctx);
}