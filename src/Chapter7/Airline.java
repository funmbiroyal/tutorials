package Chapter7;

public class Airline {
    private boolean[] firstClass;
    private boolean[] economy;
    private boolean[] economyClassArrangement;
    private static int numberOfSeat;


    private boolean[] firstClassArrangement;
    private boolean hasBooked = false;

    public Airline() {
        economy = new boolean[]{false, false, false, false, false};
        firstClass = new boolean[]{false, false, false, false, false};
    }

    public boolean getFirstClassSeat() {

        return false;
    }

    public boolean getEconomyClassSeat() {

        return false;
    }

    public void bookSeat(int numberOfSeat) throws CannotBookASeatTwiceException, SeatAlreadyOccupiedException {
        validateEconomySeat(numberOfSeat);
        Airline.numberOfSeat = numberOfSeat;

    }

    public void setEconomyClassArrangement(boolean[] arrangement) {

        economyClassArrangement = arrangement;
    }

    public boolean[] getEconomyClassArrangement() {

        return economyClassArrangement;
    }

    public void setFirstClassArrangement(boolean[] arrangement) {

        firstClassArrangement = arrangement;
    }

    public boolean[] getFirstClassArrangement() {

        return firstClassArrangement;
    }

    private void validateEconomySeat(int seatNumber) throws CannotBookASeatTwiceException, SeatAlreadyOccupiedException {
        if (seatNumber == numberOfSeat) {
           throw new CannotBookASeatTwiceException("You Cannot book more than a seat!");
        } else if (seatNumber > 1) {
            throw new SeatAlreadyOccupiedException("Sorry,seat has been occupied!");
        } else {
            System.out.println("You have successfully booked a seat!");
        }

    }

    public void changeToFirstClass(int numberOfSeat, boolean hasBooked) {
        validateFirstClassSeat(hasBooked);
        Airline.numberOfSeat = numberOfSeat;

    }

    private void validateFirstClassSeat(boolean hasBooked) {
        for (boolean seat : firstClass) {
            if (!seat) {
                firstClass[0] = hasBooked;
                System.out.println("Thanks for changing to first class,you have booked a seat!");
                break;
            }
        }

    }

    public boolean wantFirstClass(boolean response) {

        if (response) {
            changeToFirstClass(numberOfSeat, hasBooked);
        }else {
            System.out.println("Next flight leaves in 3 hours.....");
        }
          return true;
    }
}











