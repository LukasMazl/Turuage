// Generated from C:/Work/antlr/src/main/antlr4\Turing.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TuringParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TuringVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TuringParser#root_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot_rule(TuringParser.Root_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringParser#paska_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPaska_statement(TuringParser.Paska_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringParser#accept_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAccept_statement(TuringParser.Accept_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringParser#reject_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReject_statement(TuringParser.Reject_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(TuringParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringParser#state_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_statement(TuringParser.State_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringParser#state_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState_array(TuringParser.State_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringParser#state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitState(TuringParser.StateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringParser#turing_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuring_function(TuringParser.Turing_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TuringParser#transition_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransition_operator(TuringParser.Transition_operatorContext ctx);
}