package cz.tul.prk.validator;

import cz.tul.prk.context.ProgramContext;
import cz.tul.prk.context.TuringContext;
import cz.tul.prk.exception.ValidationException;
import lombok.extern.log4j.Log4j;

@Log4j
public class IdentificatorValidator implements Validator{

    @Override
    public ErrorHolder validate(ProgramContext programContext) throws ValidationException {
        ErrorHolder errorHolder = new ErrorHolder();
        for (TuringContext turingContext : programContext.getTuringContextList()) {
            String acceptIdent = turingContext.getAcceptIdent();
            if (!programContext.getAcceptStates().keySet().contains(acceptIdent)) {
                log.error("Identificator '" + acceptIdent + "' does not exist.");
                errorHolder.add(ValidationError.IDENTIFICATOR_NOT_FOUND);
            }

            String rejectIdent = turingContext.getRejectIdent();
            if (rejectIdent != null && !programContext.getRejectStates().keySet().contains(rejectIdent)) {
                log.error("Identificator '" + rejectIdent + "' does not exist.");
                errorHolder.add(ValidationError.IDENTIFICATOR_NOT_FOUND);
            }

        }
        return errorHolder;
    }
}
