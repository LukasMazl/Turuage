package cz.tul.prk;

public class ArgumetParseHelper {

    public static final String FILE_PLACEHOLDER = "-file=";
    public static final String IS_STEPABLE = "-stepable";
    public static final String SILENCE_MODE = "-silence";


    public static boolean showHelp(String[] args) {
        for (String argument: args) {
            if (argument.toUpperCase().compareTo("--HELP") == 0
                    || argument.toUpperCase().compareTo("-H") == 0) {
                return true;
            }
        }
        return false;
    }

    public static ProgramConfiguration prepareConfiguration(String[] args) {
        ProgramConfiguration configuration = new ProgramConfiguration();

        for (String argument: args) {
            if (argument.startsWith(FILE_PLACEHOLDER)) {
                String filePath = argument.replace(FILE_PLACEHOLDER, "");
                configuration.setPath(filePath);
            }

            if (argument.startsWith(IS_STEPABLE)) {
                configuration.setStepable(true);
            }

            if (argument.startsWith(SILENCE_MODE)) {
                configuration.setSilenceMode(true);
            }

        }
        return configuration;
    }
}
