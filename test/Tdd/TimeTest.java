package Tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TimeTest {
    Time time;

    @BeforeEach
    void startAllTestWith() {
        time = new Time();
    }

    @Test
    void TimeCanBeCreated() {
        Time time = new Time();
        assertNotNull(time);
    }

    @Test
    void HoursCanBeSet() {
        time.setHour(10);
        assertEquals(10, time.getHour());
    }

    @Test
    void MinutesCanBeSet() {
        time.setMinutes(45);
        assertEquals(45, time.getMinutes());
    }

    @Test
    void SecondsCanBeSet() {
        time.setSeconds(60);
        assertEquals(60, time.getSeconds());
    }

    @Test
    void HoursCanNotBeLessThanZeroOrGreaterTwentyFour() {
        //time.setHour(-1);
        time.setHour(34);
        assertEquals(0, time.getHour());
    }

    @Test
    void MinutesCanNotBeLessThanZeroOrGreaterSixty() {
        time.setMinutes(-1);
        assertEquals(0, time.getMinutes());
    }

    @Test
    void SecondsCanNotBeLessThanZeroOrGreaterSixty() {
        time.setSeconds(65);
        assertEquals(0, time.getSeconds());
    }

}