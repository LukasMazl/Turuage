package cz.tul.prk.turing;

import cz.tul.prk.context.ProgramContext;
import cz.tul.prk.context.StateContext;
import cz.tul.prk.context.TuringContext;
import cz.tul.prk.context.TuringMove;
import lombok.extern.log4j.Log4j;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

@Log4j
public class SimpleTuringMachine implements TuringMachine {

    private static final Character EMPTY_CHARACTER = ' ';

    private Deque<Character> leftSide = new ArrayDeque<>();
    private Deque<Character> rightSide = new ArrayDeque<>();

    @Override
    public void run(ProgramContext programContext) {
        for(TuringContext turingContext : programContext.getTuringContextList()) {
            String lastState = runTuring(turingContext, programContext);
            if (programContext.getAcceptStates().get(turingContext.getAcceptIdent()).contains(lastState)) {
                System.out.println("True");
            } else if(programContext.getRejectStates().get(turingContext.getRejectIdent()).contains(lastState)) {
                System.out.println("False");
            } else {
                System.out.println("Undefined");
            }
            cleanWorkspace();
        }
    }

    private String runTuring(TuringContext turingContext, ProgramContext programContext) {
        String currentState = turingContext.getStartState();
        List<StateContext> stateContextList = programContext.getStateContext().get(currentState);
        String tapeInput = programContext.getTapeContext().get(turingContext.getInputIdent()).getValue();
        Character readingPointerValue = tapeInput.charAt(0);
        initTape(tapeInput);
        StateContext nextMove;
        while((nextMove = prepareNextMove(stateContextList, readingPointerValue)) != null) {
            readingPointerValue = makeMove(nextMove.getTuringMove(), nextMove.getWriteValue());
            currentState = nextMove.getNextState();

            if (turingContext.getStatesIdent().contains(currentState)) {
                stateContextList = programContext.getStateContext().get(currentState);
            } else {
                return currentState;
            }
        }
        return currentState;
    }

    private StateContext prepareNextMove(List<StateContext> stateContextList, Character readingPointerValue) {
        for(StateContext stateContext : stateContextList) {
            if(stateContext.getIdentificator() == readingPointerValue) {
                return stateContext;
            }
        }
        return null;
    }

    private void initTape(String tapeInput) {
        for(int index = 1; index < tapeInput.length(); index++) {
            rightSide.push(tapeInput.charAt(tapeInput.length() - index));
        }
    }

    private Character makeMove(TuringMove turingMove, Character writeValue) {
        Character newPointer;
        if (turingMove == TuringMove.LEFT) {
            rightSide.addFirst(writeValue);
            if(!leftSide.isEmpty()) {
                newPointer = leftSide.getFirst();
                leftSide.removeFirst();
            } else {
                newPointer = EMPTY_CHARACTER;
            }
        } else {
            leftSide.addFirst(writeValue);
            if(!rightSide.isEmpty()) {
                newPointer = rightSide.getFirst();
                rightSide.removeFirst();
            } else {
                newPointer = EMPTY_CHARACTER;
            }
        }
        return newPointer;
    }

    private void cleanWorkspace() {
        this.rightSide = new ArrayDeque<>();
        this.leftSide = new ArrayDeque<>();
    }
}
