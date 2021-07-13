package Chapter7;

public class Airline {
    private boolean[] firstClass;
    private boolean[] economy;
    private int firstClassSeatCounter;
    private int economyClassSeatCounter = 5;

    public Airline() {
        economy = new boolean[]{false, false, false, false, false};
        firstClass = new boolean[]{false, false, false, false, false};
    }

    public int assignSeat(boolean isFirstClass) {
        int seatNumber;
        if (isFirstClass) {
            firstClass[firstClassSeatCounter] = true;
            seatNumber = ++firstClassSeatCounter;
        }else if(firstClass[0] && firstClass[1] && firstClass[2] && firstClass[3] && firstClass[4]){
            economy[economyClassSeatCounter - 5] = true;
            seatNumber = ++economyClassSeatCounter;

      }else if(economy[0] && economy[1] && economy[2] && economy[3] && economy[4]){
        firstClass[firstClassSeatCounter] = true;
        seatNumber = ++firstClassSeatCounter;


        }else {
            economy[economyClassSeatCounter - 5] = true;
            seatNumber = ++economyClassSeatCounter;
        }
        return seatNumber;
    }

}




