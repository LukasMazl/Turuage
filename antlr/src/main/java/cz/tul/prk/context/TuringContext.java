package cz.tul.prk.context;

import java.util.Set;

public class TuringContext extends AbstractContext {

    private String acceptIdent;
    private String rejectIdent;
    private String inputIdent;
    private Set<String> statesIdent;

    public String getAcceptIdent() {
        return acceptIdent;
    }

    public void setAcceptIdent(String acceptIdent) {
        this.acceptIdent = acceptIdent;
    }

    public String getRejectIdent() {
        return rejectIdent;
    }

    public void setRejectIdent(String rejectIdent) {
        this.rejectIdent = rejectIdent;
    }

    public String getInputIdent() {
        return inputIdent;
    }

    public void setInputIdent(String inputIdent) {
        this.inputIdent = inputIdent;
    }

    public Set<String> getStatesIdent() {
        return statesIdent;
    }

    public void setStatesIdent(Set<String> statesIdent) {
        this.statesIdent = statesIdent;
    }

    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "acceptIdent='" + acceptIdent + '\'' +
                ", rejectIdent='" + rejectIdent + '\'' +
                ", inputIdent='" + inputIdent + '\'' +
                ", statesIdent=" + statesIdent +
                '}';
    }
}
