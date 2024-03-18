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
//Tortoise Fast plod 50% 3 squares to the right
//Slip 20% 6 squares to the left
//Slow plod 30% 1 square to the right
//Hare Sleep 20% No move at all
//Big hop 20% 9 squares to the right
//Big slip 10% 12 squares to the left
//Small hop 30% 1 square to the right
//Small slip 20% 2 squares to the left