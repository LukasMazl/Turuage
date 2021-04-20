package cz.tul.prk.context;

public class StateContext extends AbstractContext {

    private char identificator;
    private char writeValue;
    private TuringMove turingMove;
    private String nextState;

    public char getIdentificator() {
        return identificator;
    }

    public void setIdentificator(char identificator) {
        this.identificator = identificator;
    }

    public char getWriteValue() {
        return writeValue;
    }

    public void setWriteValue(char writeValue) {
        this.writeValue = writeValue;
    }

    public TuringMove getTuringMove() {
        return turingMove;
    }

    public void setTuringMove(TuringMove turingMove) {
        this.turingMove = turingMove;
    }

    public String getNextState() {
        return nextState;
    }

    public void setNextState(String nextState) {
        this.nextState = nextState;
    }


    @Override
    public String toString() {
        return  getClass().getSimpleName() + "{" +
                "identificator=" + identificator +
                ", writeValue=" + writeValue +
                ", turingMove=" + turingMove +
                ", nextState='" + nextState + '\'' +
                '}';
    }
}
