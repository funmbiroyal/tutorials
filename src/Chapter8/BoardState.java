package Chapter8;

public enum
BoardState {
    O,X,EMPTY;

    @Override
    public String toString(){
        String value = "";
        switch (this){
            case X -> value = "X";
            case O -> value = "O";
            case EMPTY -> value = " ";
        }
        return value;
    }
}
