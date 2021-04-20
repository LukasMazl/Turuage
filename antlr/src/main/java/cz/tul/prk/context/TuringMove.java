package cz.tul.prk.context;

public enum TuringMove {
    LEFT('L'), RIGHT('R');

    private char mark;

    TuringMove(char mark) {
        this.mark = mark;
    }

    public static TuringMove getValue(char mark) {
        for(TuringMove turingMove: values()) {
            if (turingMove.mark == mark)
                return turingMove;
        }

        throw new IllegalArgumentException("Mark '" + mark + "' was not found!");
    }
}
