import cz.tul.prk.ProgramContextParser;
import cz.tul.prk.context.ProgramContext;
import cz.tul.prk.exception.ValidationException;
import cz.tul.prk.validator.ErrorHolder;
import cz.tul.prk.validator.MasterValidator;
import cz.tul.prk.validator.ValidationError;
import cz.tul.prk.validator.Validator;
import org.apache.log4j.BasicConfigurator;
import org.junit.Test;

import java.io.File;
import java.io.IOException;


public class TuringValidationTest {

    private static final Validator validator;

    static {
        validator = new MasterValidator();
        BasicConfigurator.configure();
    }

    @Test
    public void test_working_example() throws IOException, ValidationException {
        ProgramContext programContext = ProgramContextParser.parse(new File("./turing/working_example.tur"));
        ErrorHolder errorHolder = validator.validate(programContext);
        assert !errorHolder.hasError();
    }

    @Test
    public void test_no_reject() throws IOException, ValidationException {
        ProgramContext programContext = ProgramContextParser.parse(new File("./turing/no_reject.tur"));
        ErrorHolder errorHolder = validator.validate(programContext);
        assert !errorHolder.hasError();
    }

    @Test
    public void test_no_state_definition() throws IOException, ValidationException {
        ProgramContext programContext = ProgramContextParser.parse(new File("./turing/no_state_definition.tur"));
        ErrorHolder errorHolder = validator.validate(programContext);
        assert errorHolder.contain(ValidationError.STAGE_NOT_DEFINED);
        assert errorHolder.contain(ValidationError.UNDEFINED_ACCEPT_STATE);
        assert errorHolder.contain(ValidationError.UNDEFINED_REJECT_STATE);
        assert errorHolder.contain(ValidationError.UNDEFINED_TURING_STATE);
    }

    @Test
    public void test_no_accept_state_definition() throws IOException, ValidationException {
        ProgramContext programContext = ProgramContextParser.parse(new File("./turing/no_accept_state_definition.tur"));
        ErrorHolder errorHolder = validator.validate(programContext);
        assert !errorHolder.contain(ValidationError.STAGE_NOT_DEFINED);
        assert errorHolder.contain(ValidationError.UNDEFINED_ACCEPT_STATE);
        assert !errorHolder.contain(ValidationError.UNDEFINED_REJECT_STATE);
        assert !errorHolder.contain(ValidationError.UNDEFINED_TURING_STATE);
    }

    @Test
    public void test_identificator_not_found() throws IOException, ValidationException {
        ProgramContext programContext = ProgramContextParser.parse(new File("./turing/identificator_not_found.tur"));
        ErrorHolder errorHolder = validator.validate(programContext);
        assert errorHolder.contain(ValidationError.IDENTIFICATOR_NOT_FOUND);
    }
}
