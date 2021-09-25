package Chapter7.tortoise;

public class Tortoise extends Player{
    private int position;

    public void fastPlod(){
        position += 3;
    }

    public void slowPod(){
        position += 1;
    }
    public void slip(){
        if(position > 6){
            position -= 6;
        }else{
            position = 1;
        }

    }

}
