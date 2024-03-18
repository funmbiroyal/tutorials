package sMsys;

public class StudentAlreadyExistException extends RuntimeException {
    public StudentAlreadyExistException(){
        super();
    }
    public StudentAlreadyExistException(String message){
        super(message);
    }
    public StudentAlreadyExistException(Throwable throwable){
        super(throwable);
    }
    public StudentAlreadyExistException(String message,Throwable throwable){
        super(message, throwable);
    }
}
