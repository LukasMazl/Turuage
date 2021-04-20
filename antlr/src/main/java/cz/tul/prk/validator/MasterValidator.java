package cz.tul.prk.validator;

import cz.tul.prk.context.ProgramContext;
import cz.tul.prk.exception.ValidationException;

import java.util.List;

public class MasterValidator implements Validator {

    private List<Validator> validators;

    public MasterValidator() {
        this.validators = ChainValidatorBuilder.getValidators();
    }

    public MasterValidator(List<Validator> validators) {
        this.validators = validators;
    }

    @Override
    public ErrorHolder validate(ProgramContext programContext) throws ValidationException {
        ErrorHolder errorHolder = new ErrorHolder();

        for(Validator validator : validators) {
            ErrorHolder validatedErrors = validator.validate(programContext);
            if(validatedErrors.hasError()) {
                errorHolder.addAll(validatedErrors);
            }
        }
        return errorHolder;
    }
}
