package cz.tul.prk;

public class ProgramConfiguration {

    private boolean stepable = false;
    private String path;
    private boolean silenceMode = false;

    public boolean isStepable() {
        return stepable;
    }

    public void setStepable(boolean stepable) {
        this.stepable = stepable;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public boolean isSilenceMode() {
        return silenceMode;
    }

    public void setSilenceMode(boolean silenceMode) {
        this.silenceMode = silenceMode;
    }

}
