package Chapter7.myTurtle.entities;

public class Pen {
    private boolean penPosition;

    public void setPenUp(boolean isUp){
        penPosition = isUp;
    }
 public boolean isUp(){
        return penPosition;
    }
    public void setPenDown(boolean isDown){
        penPosition = isDown;
    }

}
