package cz.tul.prk.validator;

import java.util.HashSet;
import java.util.Set;

public class ErrorHolder {

    public Set<ValidationError> validationErrorSet;

    public ErrorHolder() {
        this.validationErrorSet = new HashSet<>();
    }

    public void add(ValidationError error) {
        validationErrorSet.add(error);
    }

    public Set<ValidationError> getValidationErrorSet() {
        return validationErrorSet;
    }

    public boolean contain(ValidationError validationError) {
        return validationErrorSet.contains(validationError);
    }

    public boolean hasError() {
        return !validationErrorSet.isEmpty();
    }

    public void addAll(ErrorHolder validatedErrors) {
        validationErrorSet.addAll(validatedErrors.validationErrorSet);
    }

    @Override
    public String toString() {
        return validationErrorSet.toString();
    }
}
