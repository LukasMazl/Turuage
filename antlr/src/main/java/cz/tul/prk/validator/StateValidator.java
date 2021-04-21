package cz.tul.prk.validator;

import cz.tul.prk.context.ProgramContext;
import cz.tul.prk.context.StateContext;
import cz.tul.prk.context.TuringContext;
import cz.tul.prk.exception.ValidationException;
import lombok.extern.log4j.Log4j;


import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Log4j
public class StateValidator implements Validator {

    @Override
    public ErrorHolder validate(ProgramContext programContext) throws ValidationException {
        ErrorHolder errorHolder = new ErrorHolder();
        Set<String> stateDefined = programContext.getStateContext().keySet();
        Set<String> diffWithAcceptStates = findDifferences(programContext.getAcceptStates(), stateDefined);
        if (!diffWithAcceptStates.isEmpty()) {
            log.error("These states are not defined {" + diffWithAcceptStates + "}, therefore could not be used as Accept state");
            errorHolder.add(ValidationError.UNDEFINED_ACCEPT_STATE);
        }

        Set<String> diffWithRejectStates = findDifferences(programContext.getRejectStates(), stateDefined);
        if (!diffWithRejectStates.isEmpty()) {
            log.error("These states are not defined {" + diffWithRejectStates + "}, therefore could not be used as Reject state");
            errorHolder.add(ValidationError.UNDEFINED_REJECT_STATE);
        }

        for (Map.Entry<String, List<StateContext>> stateContextEntry : programContext.getStateContext().entrySet()) {
            for (StateContext stateContext : stateContextEntry.getValue()) {
                if (stateContext != null && !stateDefined.contains(stateContext.getNextState())) {
                    log.error("Stage \'" + stateContext.getNextState() + "\' is not defined!");
                    errorHolder.add(ValidationError.STAGE_NOT_DEFINED);
                }
            }
        }

        Set<String> diffWithTuringStates = findDifferencesWithTuring(programContext, stateDefined);
        if (!diffWithTuringStates.isEmpty()) {
            log.error("These states are not defined {" + diffWithTuringStates + "}, therefore could not be used as Turing state");
            errorHolder.add(ValidationError.UNDEFINED_TURING_STATE);
        }

        log.info("Validation of States ended with '" + errorHolder + "'");
        return errorHolder;
    }

    private Set<String> findDifferencesWithTuring(ProgramContext programContext, Set<String> stateDefined) {
        Set<String> diffs = new HashSet<>();
        for(TuringContext turingContext : programContext.getTuringContextList()) {
            for(String state : turingContext.getStatesIdent()) {
                if (!stateDefined.contains(state)) {
                    diffs.add(state);
                }
            }
        }
        return diffs;
    }

    private Set<String> findDifferences(Map<String, Set<String>> stateMap, Set<String> stateDefined) {
        Set<String> diff = new HashSet<>();
        for(Map.Entry<String, Set<String>> entry : stateMap.entrySet()) {
            for (String status : entry.getValue()) {
                if(!stateDefined.contains(status)) {
                    diff.add(status);
                }
            }
        }
        return diff;
    }
}
