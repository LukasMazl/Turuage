package cz.tul.prk.validator;

import cz.tul.prk.context.ProgramContext;
import cz.tul.prk.exception.ValidationException;
import lombok.extern.log4j.Log4j;


import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Log4j
public class StateValidator implements Validator {

    @Override
    public ErrorHolder validate(ProgramContext programContext) throws ValidationException {
        ErrorHolder errorHolder = new ErrorHolder();
        Set<String> stateDefined = programContext.getStateContext().keySet();
        Set<String> diffWithAcceptStates = findDifferences(programContext.getAcceptStates(), stateDefined);
        if(!diffWithAcceptStates.isEmpty()) {
            log.error("These states are not defined {" + diffWithAcceptStates + "}, therefore could not be used as Accept state");
            errorHolder.add(ValidationError.UNDEFINED_ACCEPT_STATE);
        }

        Set<String> diffWithRejectStates = findDifferences(programContext.getRejectStates(), stateDefined);
        if(!diffWithRejectStates.isEmpty()) {
            log.error("These states are not defined {" + diffWithRejectStates + "}, therefore could not be used as Reject state");
            errorHolder.add(ValidationError.UNDEFINED_REJECT_STATE);
        }

        log.info("Validation of States ended with '" + errorHolder + "'");
        return errorHolder;
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
