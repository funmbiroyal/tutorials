package Chapter7.tortoise;

public class Hare extends Player{
    public int bigHop(){
        int position = Hare.getPosition();
        position+=9;
        return position;
    }
    public int smallHop(){
        int position = Hare.getPosition();
        position+=1;
        return position;
    }
    public int bigSlip(){
        int position = 0;
       if (Hare.getPosition() >12){
           position -=12;
       }else{
           position =1;
       }
       return position;
       }

    public int smallSlip(){
        int position = 0;
        if (Hare.getPosition() >2){
            position -=2;
        }else{
            position =1;
        }
        return position;
    }
    public void fallAsSleep(){
       int position = Hare.getPosition();
    }
    }
