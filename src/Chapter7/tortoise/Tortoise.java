package Chapter7.tortoise;

public class Tortoise extends Player{

    public static   int fastPlod(){
      int position = Tortoise.getPosition();
      position += 3;
      return position;
    }

    public static int  slowPod(){
        int position = Tortoise.getPosition();
        position += 1;
        return position;

    }
    public static int slip(){
        int position = Tortoise.getPosition();
        if (position > 6){
            position -=6;
        }else{
            position =1;
        }
        return position;
    }

}
