// Generated from C:/Users/student/Documents/Projects/XML2JSON/src/main/java/org/example\GQ.g4 by ANTLR 4.12.0
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GQ}.
 */
public interface GQListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GQ#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(GQ.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GQ#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(GQ.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GQ#left}.
	 * @param ctx the parse tree
	 */
	void enterLeft(GQ.LeftContext ctx);
	/**
	 * Exit a parse tree produced by {@link GQ#left}.
	 * @param ctx the parse tree
	 */
	void exitLeft(GQ.LeftContext ctx);
	/**
	 * Enter a parse tree produced by {@link GQ#right}.
	 * @param ctx the parse tree
	 */
	void enterRight(GQ.RightContext ctx);
	/**
	 * Exit a parse tree produced by {@link GQ#right}.
	 * @param ctx the parse tree
	 */
	void exitRight(GQ.RightContext ctx);
}