package BeansBusinessException;

public class LackOfMoneyException extends BeansNotFoundException {
    public LackOfMoneyException(String message){
        super(message);
    }
}
