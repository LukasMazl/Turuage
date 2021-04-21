package cz.tul.prk;

import cz.tul.prk.antlr4.TuringBaseListener;
import cz.tul.prk.antlr4.TuringLexer;
import cz.tul.prk.antlr4.TuringParser;
import cz.tul.prk.context.ProgramContext;
import cz.tul.prk.context.TuringContext;
import cz.tul.prk.listener.GrammarListener;
import cz.tul.prk.turing.SimpleTuringMachine;
import cz.tul.prk.turing.TuringMachine;
import cz.tul.prk.validator.ErrorHolder;
import cz.tul.prk.validator.MasterValidator;
import cz.tul.prk.validator.Validator;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.log4j.BasicConfigurator;

import java.io.File;


public class Application extends TuringBaseListener {

    static  {
        BasicConfigurator.configure();
    }

    public static void runProgram(String path) throws Exception {
        ProgramContext programContext = ProgramContextParser.parse(new File(path));
        Validator validator = new MasterValidator();
        ErrorHolder errorHolder = validator.validate(programContext);
        if(!errorHolder.hasError()) {
            TuringMachine turingMachine = new SimpleTuringMachine();
            turingMachine.run(programContext);
        } else {
            System.err.println("Grammar is not valid.");
        }
    }

    public static void main(String[] args) throws Exception {
       runProgram("./turing/palindrom.tur");
    }

}
