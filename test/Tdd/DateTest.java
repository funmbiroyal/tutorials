package Tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DateTest {

    @Test
    void DateClassCanBeCreatedTest(){
        Date date = new Date(29,03,2021);
        assertNotNull(date);
    }
    @Test
    void DateClassCanTakeDayTest(){
        Date date = new Date(29,03,2021);
        assertEquals(29,date.getDay());
    }
    @Test
    void DateClassCanTakeMonthTest(){
        Date date = new Date(29,03,2021);
        assertEquals(03,date.getMonth());
    }
    @Test
    void DateClassCanTakeYearTest(){
        Date date = new Date(29,03,2021);
        assertEquals(2021,date.getYear());
    }
    @Test
    void DateClassCanDisplayDateTest(){
        Date date = new Date(29,03,2021);
        assertEquals(29/32/2021,date.displayDate());

    }
}
