package cz.tul.prk.turing;

import cz.tul.prk.ProgramConfiguration;
import cz.tul.prk.context.ProgramContext;
import cz.tul.prk.context.StateContext;
import cz.tul.prk.context.TuringContext;
import cz.tul.prk.context.TuringMove;
import lombok.extern.log4j.Log4j;

import java.util.*;

import static cz.tul.prk.TuringNicePrinter.TAPE_SIZE;
import static cz.tul.prk.TuringNicePrinter.logNextStep;

@Log4j
public class SimpleTuringMachine implements TuringMachine {

    private static final Character EMPTY_CHARACTER = ' ';

    private Deque<Character> leftSide = new ArrayDeque<>();
    private Deque<Character> rightSide = new ArrayDeque<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void run(ProgramContext programContext, ProgramConfiguration programConfiguration) {
        for(TuringContext turingContext : programContext.getTuringContextList()) {
            String lastState = runTuring(turingContext, programContext, programConfiguration);
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

    private String runTuring(TuringContext turingContext, ProgramContext programContext, ProgramConfiguration programConfiguration) {
        String currentState = turingContext.getStartState();
        List<StateContext> stateContextList = programContext.getStateContext().get(currentState);
        String tapeInput = programContext.getTapeContext().get(turingContext.getInputIdent()).getValue();
        Character readingPointerValue = tapeInput.charAt(0);
        initTape(tapeInput);
        StateContext nextMove;
        while((nextMove = prepareNextMove(stateContextList, readingPointerValue)) != null) {
            if(!programConfiguration.isSilenceMode()) {
                printCurrentState(currentState, nextMove, readingPointerValue, stateContextList);
                if(programConfiguration.isStepable()) {
                    scanner.nextLine();
                }
            }
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

    private void printCurrentState(String currentState, StateContext nextMove, Character readingPointerValue, List<StateContext> stateContextList) {
        String ruleDescription = String.format("'%s' -> '%s', %s, %s", nextMove.getIdentificator(), nextMove.getWriteValue(), nextMove.getTuringMove(), nextMove.getNextState());
        List<Character> tape = new ArrayList<>();
        int size = Math.round(TAPE_SIZE / 2);
        for (Character character : leftSide) {
            tape.add(character);
            if(tape.size() >= size)
                break;
        }

        while (tape.size() < size) {
            tape.add(EMPTY_CHARACTER);
        }

        Collections.reverse(tape);
        tape.add(readingPointerValue);
        for (Character character : rightSide) {
            tape.add(character);
            if(tape.size() >= (size * 2 +1))
                break;
        }

        while (tape.size() < (size * 2 +1)) {
            tape.add(EMPTY_CHARACTER);
        }

        logNextStep(currentState, ruleDescription, tape);
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
