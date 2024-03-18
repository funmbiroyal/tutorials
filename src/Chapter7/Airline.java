package Chapter7;

public class Airline {
    private boolean[] firstClass;
    private boolean[] economy;
    private int firstClassSeatCounter;
    private int economyClassSeatCounter = 5;
    private int occupiedSeat;

    public Airline() {
        economy = new boolean[]{false, false, false, false, false};
        firstClass = new boolean[]{false, false, false, false, false};
    }

    public int assignSeat(boolean isFirstClass) {
       int seatNumber;
        if (isFirstClass) {
          firstClass[firstClassSeatCounter] = true;
          seatNumber = ++firstClassSeatCounter;
            System.out.println("You have successfully booked a seat, Thank you for choosing First Class!");
            System.out.println("Your seat number is " + seatNumber);
            System.out.println();

        }else if(firstClass[0] && firstClass[1] && firstClass[2] && firstClass[3] && firstClass[4]){
         economy[economyClassSeatCounter - 5] = true;
         seatNumber = ++economyClassSeatCounter;
            System.out.println("You have successfully booked a seat, Thanks for Changing to Economy Class!");
            System.out.println("Your seat number is " + seatNumber);
            System.out.println();

      }else if(economy[0] && economy[1] && economy[2] && economy[3] && economy[4]){
        firstClass[firstClassSeatCounter] = true;
        seatNumber = ++firstClassSeatCounter;
            System.out.println("You have successfully booked a seat, Thanks for Changing to First Class!");
            System.out.println("Your seat number is " + seatNumber);
            System.out.println();


        }else {
            economy[economyClassSeatCounter - 5] = true;
            seatNumber = ++economyClassSeatCounter;
            System.out.println("You have successfully book a seat, Thank you for choosing Economy Class!");
            System.out.println("Your seat number is " + seatNumber);
            System.out.println();
        }
        return seatNumber;
    }
//    private void validateSeatNumber(){
//        for (int seatCounter = 0; seatCounter < 5 ; seatCounter++) {
//            if (seatCounter == occupiedSeat  ){
//
//
//            }

        }







