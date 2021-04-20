package cz.tul.prk.validator;

import cz.tul.prk.context.ProgramContext;
import cz.tul.prk.exception.ValidationException;

public interface Validator {

    ErrorHolder validate(ProgramContext programContext) throws ValidationException;
}
