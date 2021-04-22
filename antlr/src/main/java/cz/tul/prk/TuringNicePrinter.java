package cz.tul.prk;

import java.util.List;

public class TuringNicePrinter {

    private static final String CURRENT_STATE = "{current_state}";
    private static final String RULE_DESCRIPTION = "{rule_description}";
    public static final int TAPE_SIZE = 7;

    private static final String FRAGMENT_SPLITTER =
            "___________________________________________";

    private static final String TURING_TEMPLETE = "     \n" +
            "Current state: " + CURRENT_STATE +"        \n" +
            "                                           \n" +
            "-------------------------------------------\n" +
            "| {0} | {1} | {2} | {3} | {4} | {5} | {6} |\n" +
            "-------------------------------------------\n" +
            "                     ^                     \n" +
            "                     |                     \n" +
            "        " + RULE_DESCRIPTION;


    public static void logNextStep(String currentStep, String ruleDescription, List<Character> tape) {
        String preparedLog = TURING_TEMPLETE.replace(CURRENT_STATE, currentStep).replace(RULE_DESCRIPTION, ruleDescription);
        for(int index = 0; index < TAPE_SIZE; index++) {
            String placeholder = "{" + index + "}";
            preparedLog = preparedLog.replace(placeholder, "'" + tape.get(index) + "'");
        }
        System.out.println(preparedLog);
        System.out.println(FRAGMENT_SPLITTER);
    }
}
