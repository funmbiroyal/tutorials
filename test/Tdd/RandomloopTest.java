package Tdd;

import org.junit.jupiter.api.Test;

import java.util.Random;

public class RandomloopTest {
    @Test
    void canLoopRandomNumberTest(){
        Random random = new Random();
        int [] array= {2,3,4,5,6,7,2};
       int number = 1+random.nextInt(5);
        assertEquals(0)

    }
}
