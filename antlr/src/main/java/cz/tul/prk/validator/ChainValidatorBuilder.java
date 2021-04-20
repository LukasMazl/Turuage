package cz.tul.prk.validator;

import java.util.ArrayList;
import java.util.List;

public class ChainValidatorBuilder {

    private static final List<Validator> VALIDATORS;

    static {
        VALIDATORS = new ArrayList<>();
        VALIDATORS.add(new StateValidator());
    }

    public static List<Validator> getValidators() {
        return VALIDATORS;
    }
}
