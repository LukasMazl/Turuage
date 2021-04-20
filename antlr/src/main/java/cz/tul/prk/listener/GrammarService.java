package cz.tul.prk.listener;

import cz.tul.prk.context.ProgramContext;
import cz.tul.prk.context.StateContext;
import cz.tul.prk.context.TapeContext;
import cz.tul.prk.context.TuringContext;
import cz.tul.prk.exception.IdentifireAllreadyExistsException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GrammarService {

    private ProgramContext programContext;

    public GrammarService(ProgramContext programContext) {
        this.programContext = programContext;
    }


    public void addTapeContext(TapeContext tapeContext) {
        Map<String, TapeContext> tapeContextMap = programContext.getTapeContext();
        String identificator = tapeContext.getIdent();

        if (tapeContextMap.keySet().contains(identificator)) {
            throw new IdentifireAllreadyExistsException();
        }

        tapeContextMap.put(identificator, tapeContext);
    }

    public void addAcceptStates(String indetifire, Set<String> acceptStates) {
        Map<String, Set<String>> acceptStatesMap = programContext.getAcceptStates();

        if (acceptStatesMap.keySet().contains(indetifire)) {
            throw new IdentifireAllreadyExistsException();
        }

        acceptStatesMap.put(indetifire, acceptStates);
    }

    public void addRejectStates(String indetifire, Set<String> rejectStates) {
        Map<String, Set<String>> rejectStatesMap = programContext.getRejectStates();

        if (rejectStatesMap.keySet().contains(indetifire)) {
            throw new IdentifireAllreadyExistsException();
        }

        rejectStatesMap.put(indetifire, rejectStates);
    }

    public void addState(String identificator, StateContext stateContext) {
        Map<String, List<StateContext>> stateContextMap = programContext.getStateContext();

        List<StateContext> stateContextsList = stateContextMap.get(identificator);
        if (stateContextsList == null) {
            stateContextsList = new ArrayList<>();
            stateContextMap.put(identificator, stateContextsList);
        }

        stateContextsList.add(stateContext);
    }

    public void addTuringFunction(TuringContext turingContext) {
        programContext.getTuringContextList().add(turingContext);
    }
}
