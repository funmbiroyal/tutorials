package Tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TimeTest {
    Time time;

    @BeforeEach
    void startAllTestWith() {
        time = new Time(12,45,30);
    }

    @Test
    void TimeCanBeCreated() {
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
        time.setHour(34);
        time.validateHour(34);
        assertEquals(34, time.getHour());
    }

    @Test
    void MinutesCanNotBeLessThanZeroOrGreaterSixty() {
        time.validateMinutes(10);
        time.setMinutes(10);
        assertEquals(10, time.getMinutes());
    }

    @Test
    void SecondsCanNotBeLessThanZeroOrGreaterSixty() {
        time.setSeconds(45);
        time.validateSeconds(45);
        assertEquals(45, time.getSeconds());
    }
    @Test
    void TimeCanBeSet(){
        time.validateMinutes(34);
        time.setMinutes(34);
        assertEquals(34,time.getMinutes());
        time.validateHour(12);
        time.setHour(12);
        assertEquals(12,time.getHour());
        time.validateSeconds(40);
        time.setSeconds(40);
        assertEquals(40,time.getSeconds());

    }

    }

