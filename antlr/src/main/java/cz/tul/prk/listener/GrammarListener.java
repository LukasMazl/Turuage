package cz.tul.prk.listener;

import cz.tul.prk.antlr4.TuringBaseListener;
import cz.tul.prk.antlr4.TuringParser;
import cz.tul.prk.context.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashSet;
import java.util.Set;

public class GrammarListener extends TuringBaseListener {

    private ProgramContext programContext;
    private GrammarService grammerServise;

    public GrammarListener() {
        this.programContext = new ProgramContext();
        this.grammerServise = new GrammarService(programContext);
    }

    @Override
    public void enterTape_statement(TuringParser.Tape_statementContext ctx) {
        String identificator = ctx.Identifier().getText();
        String value = ctx.STRING().getText();
        value = value.replace("\"", "");

        TapeContext tapeContext = new TapeContext();
        tapeContext.setParserRuleContext(ctx);
        tapeContext.setIdent(identificator);
        tapeContext.setValue(value);

        grammerServise.addTapeContext(tapeContext);
    }

    @Override
    public void enterAccept_statement(TuringParser.Accept_statementContext ctx) {
        Set<String> acceptStates = new HashSet<>();
        String indetifire = ctx.Identifier().getText();
        for (TerminalNode terminalNode : ctx.array().Identifier()) {
            acceptStates.add(terminalNode.getText());
        }

        grammerServise.addAcceptStates(indetifire, acceptStates);
    }

    @Override
    public void enterReject_statement(TuringParser.Reject_statementContext ctx) {
        Set<String> rejectStates = new HashSet<>();
        String indetifire = ctx.Identifier().getText();
        for (TerminalNode terminalNode : ctx.array().Identifier()) {
            rejectStates.add(terminalNode.getText());
        }

        grammerServise.addRejectStates(indetifire, rejectStates);
    }

    @Override
    public void enterState_statement(TuringParser.State_statementContext ctx) {
        String identif = ctx.Identifier().getText();

        TuringParser.State_arrayContext state_arrayContext = ctx.state_array();
        for (TuringParser.StateContext stateContext : state_arrayContext.state()) {
            String tapeMove = stateContext.tape_move().getText();
            String readingValue = stateContext.TapeValue().get(0).getText().replace("'", "");
            String writingValue = stateContext.TapeValue().get(1).getText().replace("'", "");
            String newState = stateContext.Identifier().getText();
            TuringMove turingMove = TuringMove.getValue((char) tapeMove.getBytes()[0]);

            StateContext stateContextValue = new StateContext();
            stateContextValue.setParserRuleContext(ctx);
            stateContextValue.setTuringMove(turingMove);
            stateContextValue.setIdentificator((char) readingValue.getBytes()[0]);
            stateContextValue.setWriteValue((char) writingValue.getBytes()[0]);
            stateContextValue.setNextState(newState);

            grammerServise.addState(identif, stateContextValue);
        }


    }

    @Override
    public void enterTuring_function(TuringParser.Turing_functionContext ctx) {
        String accept = ctx.Identifier().get(0).getText();
        String reject = null;
        String input;
        if(ctx.Identifier().size() > 2) {
            reject = ctx.Identifier().get(1).getText();
            input = ctx.Identifier().get(2).getText();
        } else {
            input = ctx.Identifier().get(1).getText();
        }
        Set<String> states = new HashSet<>();

        TuringParser.ArrayContext arrayContext = ctx.array();
        for (TerminalNode node : arrayContext.Identifier()) {
            states.add(node.getText());
        }

        TuringContext turingContext = new TuringContext();
        turingContext.setParserRuleContext(ctx);
        turingContext.setAcceptIdent(accept);
        turingContext.setRejectIdent(reject);
        turingContext.setInputIdent(input);
        turingContext.setStatesIdent(states);

        grammerServise.addTuringFunction(turingContext);
    }

    public ProgramContext getProgramContext() {
        return programContext;
    }
}
