package Chapter7.Exception;

public class CardGameException extends RuntimeException{
    public CardGameException(String message){
        super(message);
    }
}
