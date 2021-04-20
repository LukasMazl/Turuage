package cz.tul.prk;

import cz.tul.prk.antlr4.TuringBaseListener;
import cz.tul.prk.antlr4.TuringLexer;
import cz.tul.prk.antlr4.TuringParser;
import cz.tul.prk.listener.GrammarListener;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Application extends TuringBaseListener {

    public static void main(String[] args) {
        String javaClassContent = "" +
                "Tape tape = \"10\"\n" +
                "Accept acp = [q0, q1]\n" +
                "Reject rej = [q2]\n" +
                "\n" +
                "State q0 = {\n" +
                "    '1' -> '1', L, q0|\n" +
                "    '0' -> '0', L, q1\n" +
                "}\n" +
                "\n" +
                "State q1 = {'1' -> '1', R, q0|'0' -> '0', R, q2\n}\n" +
                "\n" +
                "State q2 = {\n" +
                "    '1' -> '1', R, q2|\n" +
                "    '0' -> '0', L, q0\n" +
                "}\n" +
                "\n" +
                "Turing(acp, rej, tape, [q0, q1, q2])\n" +
                "Turing(acp, rej, tape, [q0, q1, q2]) //This is working example\n";


        System.out.println(ProgramContextParser.parse(javaClassContent));
    }

}
