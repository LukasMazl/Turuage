package cz.tul.prk.context;

public class TapeContext extends AbstractContext {
    private String ident;
    private String value;

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "ident='" + ident + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
