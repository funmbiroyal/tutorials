package Chapter8Test;

import Chapter8.Time2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TimeTest {
    Time2 time;
    @BeforeEach
    void startEachTestWith(){
        time = new Time2();
    }
    @Test
    void timeCanBeCreatedTest(){
        Time2 time = new Time2(0,0,0);
        assertNotNull(time);
    }
    @Test
    void canSetTimeTest(){
        time.setTime(5,5,7);
        assertEquals(5,time.getHour());
    }
}
