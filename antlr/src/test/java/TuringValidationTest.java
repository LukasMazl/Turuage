import cz.tul.prk.ProgramContextParser;
import cz.tul.prk.context.ProgramContext;
import cz.tul.prk.exception.ValidationException;
import cz.tul.prk.validator.MasterValidator;
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
        validator.validate(programContext);
    }

    @Test
    public void test_no_reject() throws IOException, ValidationException {
        ProgramContext programContext = ProgramContextParser.parse(new File("./turing/no_reject.tur"));
        validator.validate(programContext);
        System.out.println("asdfasdf");
    }
}
