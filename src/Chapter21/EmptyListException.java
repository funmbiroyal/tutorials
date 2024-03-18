package Chapter21;

public class EmptyListException extends RuntimeException{
    public EmptyListException() {
        this("list");
    }

    public EmptyListException(String message) {
        super(message + " is empty");
    }
}
