package cz.tul.prk.turing;

import cz.tul.prk.ProgramConfiguration;
import cz.tul.prk.context.ProgramContext;

public interface TuringMachine {

    void run(ProgramContext programContext, ProgramConfiguration programConfiguration);
}
