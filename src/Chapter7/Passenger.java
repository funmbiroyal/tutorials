package Chapter7;

public class Passenger {
    private final int passengerFlightId;
    private String passengerFirstName;
    private String passengerLastName;
    private boolean[] firstClass;
    private boolean[] economy;
    private static int numberOfSeat;
    private boolean hasBooked = false;


    public Passenger(int passengerFlightId, String passengerFirstName, String lastName) {
        this.passengerFlightId = passengerFlightId;
        this.passengerFirstName = passengerFirstName;
        passengerLastName = lastName;
    }
    public int getPassengerFlightId() {
        return passengerFlightId;
    }

    public String getPassengerFirstName() {
        return passengerFirstName;
    }

    public String passengerLastName() {
        return passengerLastName;
    }

    public void bookSeat(int numberOfSeat) throws CannotBookTwoSeatException, SeatAlreadyOccupiedException {
        validateEconomySeat(numberOfSeat);
        Passenger.numberOfSeat = numberOfSeat;

    }
    private void validateEconomySeat(int seatNumber) throws CannotBookTwoSeatException, SeatAlreadyOccupiedException {
        if (seatNumber == numberOfSeat) {
            throw new SeatAlreadyOccupiedException("You Cannot book more than a seat!");
        } else if (seatNumber > 1) {
            throw new CannotBookTwoSeatException("Sorry,seat has been occupied!");
        } else {
            System.out.println("You have successfully booked a seat!");
        }

    }

    public void changeToFirstClass(int numberOfSeat, boolean hasBooked) {
        validateFirstClassSeat(hasBooked);
        Passenger.numberOfSeat = numberOfSeat;

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
        } else {
            System.out.println("Next flight leaves in 3 hours.....");
        }
        return true;


    }


}
