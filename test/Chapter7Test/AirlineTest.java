package Chapter7Test;

import Chapter7.Airline;
import Chapter7.Passenger;
import Chapter7.FirstClassIsFullException;
import Chapter7.SeatAlreadyOccupiedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class AirlineTest {
    Airline airline;
    Passenger passenger;
    Passenger grace;
    Passenger pass;
    Passenger bessie;
    Passenger joy;
    Passenger fineBoy;

    @BeforeEach
    void startEachTestWith() {
        airline = new Airline();
        passenger = new Passenger(01, "lilly", "smart");
        grace = new Passenger(02, "lilly", "smart");
        pass = new Passenger(03, "lilly", "smart");
        bessie = new Passenger(04, "lilly", "smart");
        joy = new Passenger(05, "lilly", "smart");
        fineBoy = new Passenger(06, "lilly", "smart");
    }

    @Test
    void airlineCanBeCreatedTest() {
        Airline airline = new Airline();
        assertNotNull(airline);

    }

    @Test
    void passengerCanBeCreatedTest() {
        Passenger passenger = new Passenger(012, "lilly", "smart");
        assertNotNull(passenger);
    }

    @Test
    void passengerCanBookSeatTest() throws FirstClassIsFullException, SeatAlreadyOccupiedException {
        passenger.bookSeat(true,airline);
        assertEquals(1, passenger.getSeatNumber());

        grace.bookSeat(true,airline);
        assertEquals(2,grace.getSeatNumber());

        pass.bookSeat(true,airline);
        assertEquals(3, pass.getSeatNumber());

    }
    @Test
    void passengerCanChooseOtherClassIfOneIsFull() throws ArrayIndexOutOfBoundsException {
        passenger.bookSeat(true,airline);
        assertEquals(1, passenger.getSeatNumber());

        grace.bookSeat(true,airline);
        assertEquals(2,grace.getSeatNumber());

        pass.bookSeat(true,airline);
        assertEquals(3, pass.getSeatNumber());

        bessie.bookSeat(true,airline);
        assertEquals(4,bessie.getSeatNumber());

        joy.bookSeat(true,airline);
        assertEquals(5,joy.getSeatNumber());


        assertThrows(ArrayIndexOutOfBoundsException.class,()-> fineBoy.bookSeat(true, airline));

        fineBoy.bookSeat(false,airline);
        assertEquals(6,fineBoy.getSeatNumber());

        grace.bookSeat(false,airline);
        assertEquals(7,grace.getSeatNumber());

        pass.bookSeat(false,airline);
        assertEquals(8, pass.getSeatNumber());

        bessie.bookSeat(false,airline);
        assertEquals(9,bessie.getSeatNumber());

        passenger.bookSeat(false,airline);
        assertEquals(10, passenger.getSeatNumber());

    }
}