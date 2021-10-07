package Chapter7.tortoise;

public class Hare extends Player{
    public static int bigHop(){
        int position = Hare.getPosition();
        position+=9;
        return position;
    }
    public static int smallHop(){
        int position = Hare.getPosition();
        position+=1;
        return position;
    }
    public static int bigSlip(){
        int position = Hare.getPosition();
       if ( position >12){
           position -=12;
       }else{
           position =1;
       }
       return position;
       }

    public static int smallSlip(){
        int position = Hare.getPosition();
        if ( position > 2){
            position -=2;
        }else{
            position =1;
        }
        return position;
    }
    public static void fallAsSleep(){
       int position = Hare.getPosition();
    }
    }
