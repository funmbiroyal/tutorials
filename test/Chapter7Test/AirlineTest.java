package Chapter7Test;

import Chapter7.Airline;
import Chapter7.Passenger;
import Chapter7.CannotBookTwoSeatException;
import Chapter7.SeatAlreadyOccupiedException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

public class AirlineTest {
    Airline airline;
    Passenger passenger;
    @BeforeEach
    void startEachTestWith(){
        airline = new Airline();
        passenger = new Passenger(012,"lilly","smart");
    }
    @Test
    void airlineCanBeCreatedTest(){
        Airline airline = new Airline();
        assertNotNull(airline);

    }
    @Test
    void passengerCanBeCreatedTest(){
       Passenger passenger = new Passenger(012,"lilly","smart");
       assertNotNull(passenger);
    }
    @Test
    void seatIsAvailableInFirstClassTest(){
        boolean[] seat = new boolean[5];
        Arrays.fill(seat,false);
        assertFalse(airline.getFirstClassSeat());
    }
    @Test
    void seatIsAvailableInEconomyClassTest(){
        boolean[] seat = new boolean[5];
        Arrays.fill(seat,false);
        assertFalse(airline.getEconomyClassSeat());
    }
    @Test
    void passengerCanBookSeatInEconomyClassTest() throws CannotBookTwoSeatException, SeatAlreadyOccupiedException {
        boolean[] seat = new boolean[5];
        Arrays.fill(seat,false);
        assertFalse(airline.getFirstClassSeat());
        passenger.bookSeat(1);
        boolean [] newArrangement ={true,false,false,false,false};
        airline.setEconomyClassArrangement(newArrangement);
        assertEquals(newArrangement,airline.getEconomyClassArrangement());
        System.out.println(Arrays.toString(newArrangement));
    }
    @Test
    void passengerCannotBookASeatTwiceInEconomyClassTest() throws CannotBookTwoSeatException, SeatAlreadyOccupiedException {
        boolean[] seat = new boolean[5];
        Arrays.fill(seat,false);
        assertFalse(airline.getFirstClassSeat());
        passenger.bookSeat(1);
        boolean [] newArrangement ={true,false,false,false,false};
        airline.setEconomyClassArrangement(newArrangement);
        assertEquals(newArrangement,airline.getEconomyClassArrangement());
        assertThrows(SeatAlreadyOccupiedException.class,()->passenger.bookSeat(1));
        assertEquals(newArrangement,airline.getEconomyClassArrangement());
        System.out.println(Arrays.toString(newArrangement));
    }
    @Test
    void passengerCannotBookTwoSeatInEconomyClassTest() throws CannotBookTwoSeatException, SeatAlreadyOccupiedException {
        boolean[] seat = new boolean[5];
        Arrays.fill(seat,false);
        assertFalse(airline.getFirstClassSeat());
        boolean [] newArrangement ={true,false,false,false,false};
        airline.setEconomyClassArrangement(newArrangement);
        assertEquals(newArrangement,airline.getEconomyClassArrangement());
        passenger.bookSeat(1);
        assertThrows(CannotBookTwoSeatException.class,()-> passenger.bookSeat(2));
        assertEquals(newArrangement,airline.getEconomyClassArrangement());
        System.out.println(Arrays.toString(newArrangement));
    }
    @Test
    void passengerCannotBookSeatInEconomyClassWhenFull_butChangeToFirstClassTest(){
        boolean [] seat = new boolean[5];
        Arrays.fill(seat,true);
        boolean [] newArrangementOfEconomyClass = {true,true,true,true,true};
        airline.setEconomyClassArrangement(newArrangementOfEconomyClass);
        assertEquals(newArrangementOfEconomyClass,airline.getEconomyClassArrangement());
        passenger.wantFirstClass(true);
        boolean [] newArrangementOfFirstClass ={false,false,false,false,true};
        airline.setFirstClassArrangement(newArrangementOfFirstClass);
        assertEquals(newArrangementOfFirstClass,airline.getFirstClassArrangement());
    }
    @Test
    void throwsAllExceptions() throws CannotBookTwoSeatException, SeatAlreadyOccupiedException {
        boolean [] seat = new boolean[5];
        assertFalse(airline.getFirstClassSeat());
        passenger.bookSeat(1);
        assertThrows(SeatAlreadyOccupiedException.class,()->passenger.bookSeat(1));
        assertThrows(CannotBookTwoSeatException.class,()->passenger.bookSeat(5));
        boolean [] newArrangement ={true,false,false,false,false};
        airline.setEconomyClassArrangement(newArrangement);
        assertEquals(newArrangement,airline.getEconomyClassArrangement());
    }

}
