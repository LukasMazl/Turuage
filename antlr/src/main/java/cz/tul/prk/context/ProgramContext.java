package cz.tul.prk.context;

import java.util.*;

public class ProgramContext {

    private Map<String, List<StateContext>> stateContext;
    private Map<String, Set<String>> acceptStates;
    private Map<String, Set<String>> rejectStates;
    private Map<String, TapeContext> tapeContext;
    private List<TuringContext> turingContextList;

    public ProgramContext() {
        this.stateContext = new HashMap<>();
        this.acceptStates = new HashMap<>();
        this.rejectStates = new HashMap<>();
        this.tapeContext = new HashMap<>();
        this.turingContextList = new ArrayList<>();
    }

    public Map<String, List<StateContext>> getStateContext() {
        return stateContext;
    }

    public void setStateContext(Map<String, List<StateContext>> stateContext) {
        this.stateContext = stateContext;
    }

    public Map<String, Set<String>> getAcceptStates() {
        return acceptStates;
    }

    public void setAcceptStates(Map<String, Set<String>> acceptStates) {
        this.acceptStates = acceptStates;
    }

    public Map<String, Set<String>> getRejectStates() {
        return rejectStates;
    }

    public void setRejectStates(Map<String, Set<String>> rejectStates) {
        this.rejectStates = rejectStates;
    }

    public Map<String, TapeContext> getTapeContext() {
        return tapeContext;
    }

    public void setTapeContext(Map<String, TapeContext> tapeContext) {
        this.tapeContext = tapeContext;
    }

    public List<TuringContext> getTuringContextList() {
        return turingContextList;
    }

    public void setTuringContextList(List<TuringContext> turingContextList) {
        this.turingContextList = turingContextList;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "stateContext=" + stateContext +
                ", acceptStates=" + acceptStates +
                ", rejectStates=" + rejectStates +
                ", tapeContext=" + tapeContext +
                ", turingContextList=" + turingContextList +
                '}';
    }
}
