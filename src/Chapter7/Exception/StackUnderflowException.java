package Chapter7.Exception;

public class StackUnderflowException extends RuntimeException{
    public StackUnderflowException(String message) {
        super(message);
    }
}
