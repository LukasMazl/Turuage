package cz.tul.prk;

import cz.tul.prk.antlr4.TuringBaseListener;
import cz.tul.prk.context.ProgramContext;
import cz.tul.prk.turing.SimpleTuringMachine;
import cz.tul.prk.turing.TuringMachine;
import cz.tul.prk.validator.ErrorHolder;
import cz.tul.prk.validator.MasterValidator;
import cz.tul.prk.validator.Validator;
import lombok.extern.log4j.Log4j;
import org.apache.log4j.BasicConfigurator;

import java.io.File;

@Log4j
public class Application extends TuringBaseListener {

    public static final String HELP = "";

    static  {
        BasicConfigurator.configure();
    }

    public static void runProgram(ProgramConfiguration programConfiguration) throws Exception {
        if (programConfiguration.getPath() == null) {
            System.err.println(String.format("No file found in program's arguments, please use parameter -file=${FILE_PATH} :)"));
            return;
        }

        File program = new File(programConfiguration.getPath());
        if(!program.exists()) {
            System.err.println(String.format("Bububu!! Program in '%s' does not exist!!"));
        }

        ProgramContext programContext = ProgramContextParser.parse(program);
        Validator validator = new MasterValidator();
        ErrorHolder errorHolder = validator.validate(programContext);

        if(!errorHolder.hasError()) {
            TuringMachine turingMachine = new SimpleTuringMachine();
            turingMachine.run(programContext, programConfiguration);
        } else {
            System.err.println("Grammar is not valid.");
        }
    }

    public static void main(String[] args) throws Exception {
        boolean showHelp = ArgumetParseHelper.showHelp(args);
        if (showHelp) {
            System.out.println(HELP);
        }

        ProgramConfiguration programConfiguration = ArgumetParseHelper.prepareConfiguration(args);
        runProgram(programConfiguration);
    }

}
