// Generated from C:/Work/antlr/src/main/antlr4\Turing.g4 by ANTLR 4.9
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TuringParser}.
 */
public interface TuringListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TuringParser#root_rule}.
	 * @param ctx the parse tree
	 */
	void enterRoot_rule(TuringParser.Root_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringParser#root_rule}.
	 * @param ctx the parse tree
	 */
	void exitRoot_rule(TuringParser.Root_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringParser#paska_statement}.
	 * @param ctx the parse tree
	 */
	void enterPaska_statement(TuringParser.Paska_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringParser#paska_statement}.
	 * @param ctx the parse tree
	 */
	void exitPaska_statement(TuringParser.Paska_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringParser#accept_statement}.
	 * @param ctx the parse tree
	 */
	void enterAccept_statement(TuringParser.Accept_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringParser#accept_statement}.
	 * @param ctx the parse tree
	 */
	void exitAccept_statement(TuringParser.Accept_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringParser#reject_statement}.
	 * @param ctx the parse tree
	 */
	void enterReject_statement(TuringParser.Reject_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringParser#reject_statement}.
	 * @param ctx the parse tree
	 */
	void exitReject_statement(TuringParser.Reject_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(TuringParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(TuringParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringParser#state_statement}.
	 * @param ctx the parse tree
	 */
	void enterState_statement(TuringParser.State_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringParser#state_statement}.
	 * @param ctx the parse tree
	 */
	void exitState_statement(TuringParser.State_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringParser#state_array}.
	 * @param ctx the parse tree
	 */
	void enterState_array(TuringParser.State_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringParser#state_array}.
	 * @param ctx the parse tree
	 */
	void exitState_array(TuringParser.State_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringParser#state}.
	 * @param ctx the parse tree
	 */
	void enterState(TuringParser.StateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringParser#state}.
	 * @param ctx the parse tree
	 */
	void exitState(TuringParser.StateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringParser#turing_function}.
	 * @param ctx the parse tree
	 */
	void enterTuring_function(TuringParser.Turing_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringParser#turing_function}.
	 * @param ctx the parse tree
	 */
	void exitTuring_function(TuringParser.Turing_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TuringParser#transition_operator}.
	 * @param ctx the parse tree
	 */
	void enterTransition_operator(TuringParser.Transition_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TuringParser#transition_operator}.
	 * @param ctx the parse tree
	 */
	void exitTransition_operator(TuringParser.Transition_operatorContext ctx);
}