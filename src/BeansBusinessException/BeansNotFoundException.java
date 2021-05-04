package BeansBusinessException;

public class BeansNotFoundException extends Exception{
    public BeansNotFoundException(){
        super();
    }

    public  BeansNotFoundException(String message){
        super(message);
    }

    public BeansNotFoundException(Throwable ex){
        super(ex);
    }

    public BeansNotFoundException(String message,Throwable ex){
        super(message, ex);
    }
}
