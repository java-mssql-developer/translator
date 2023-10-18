// Generated from C:/Users/student/Documents/Projects/XML2JSON/src/main/java/org/example\GQ.g4 by ANTLR 4.12.0
package org.example;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GQ}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GQVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GQ#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(GQ.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GQ#left}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft(GQ.LeftContext ctx);
	/**
	 * Visit a parse tree produced by {@link GQ#right}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight(GQ.RightContext ctx);
}