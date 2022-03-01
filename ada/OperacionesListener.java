// Generated from Operaciones.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OperacionesParser}.
 */
public interface OperacionesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OperacionesParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(OperacionesParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperacionesParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(OperacionesParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperacionesParser#operacion}.
	 * @param ctx the parse tree
	 */
	void enterOperacion(OperacionesParser.OperacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperacionesParser#operacion}.
	 * @param ctx the parse tree
	 */
	void exitOperacion(OperacionesParser.OperacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperacionesParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(OperacionesParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperacionesParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(OperacionesParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link OperacionesParser#num}.
	 * @param ctx the parse tree
	 */
	void enterNum(OperacionesParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by {@link OperacionesParser#num}.
	 * @param ctx the parse tree
	 */
	void exitNum(OperacionesParser.NumContext ctx);
}