package Chapter7.Exception;

public class StackOverflowException extends RuntimeException {
    public StackOverflowException(String message) {
        super(message);
    }
}