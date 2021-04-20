package cz.tul.prk;

import cz.tul.prk.antlr4.TuringLexer;
import cz.tul.prk.antlr4.TuringParser;
import cz.tul.prk.context.ProgramContext;
import cz.tul.prk.listener.GrammarListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class ProgramContextParser {

    public static ProgramContext parse(String code) {
        TuringLexer turingLexer = new TuringLexer(CharStreams.fromString(code));
        return parse(turingLexer);
    }

    public static ProgramContext parse(File file) throws IOException {
        TuringLexer turingLexer = new TuringLexer(CharStreams.fromFileName(file.getPath()));
        return parse(turingLexer);
    }

    public static ProgramContext parse(Path path) throws IOException {
        TuringLexer turingLexer = new TuringLexer(CharStreams.fromPath(path));
        return parse(turingLexer);
    }

    private static ProgramContext parse(TuringLexer turingLexer) {
        CommonTokenStream tokens = new CommonTokenStream(turingLexer);
        TuringParser parser = new TuringParser(tokens);
        ParseTree tree = parser.root_rule();
        ParseTreeWalker walker = new ParseTreeWalker();

        GrammarListener listener = new GrammarListener();
        walker.walk(listener, tree);
        return listener.getProgramContext();
    }

}
