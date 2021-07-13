package Chapter7;

public class Passenger {
    private final int passengerFlightId;
    private String passengerFirstName;
    private String passengerLastName;
    private boolean[] firstClass;
    private boolean[] economy;
    private static int numberOfSeat;
    private boolean hasBooked = false;
    private int seatNumber;


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

    public  void bookSeat(boolean isFirstClass, Airline airline) throws ArrayIndexOutOfBoundsException {
        if (isFirstClass) {
            seatNumber = airline.assignSeat(true);
        } else {
           seatNumber =  airline.assignSeat(false);
        }

    }

    public int getSeatNumber(){
        return seatNumber;
    }

}
