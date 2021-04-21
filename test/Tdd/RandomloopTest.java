package Tdd;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class RandomloopTest {
    @Test
    void CanCreateArrayTest() {
        int[] array = new int[6];
        for (int i = 0; i < 100; i++) {


            int firstRandom = RandomLoopArray.generateNumbers(array);
            System.out.println(firstRandom);
            int secondRandom = RandomLoopArray.generateNumbers(array);
            System.out.println(secondRandom);
            assertNotEquals(firstRandom==-1, secondRandom==-1);
        }

    }

    @Test
    void canGenerateGenerateRandomNumbers() {
        int[] array = {2, 4, 7, 8, 23, 6};
        assertTrue(array.length != RandomLoopArray.generateNumbers(array));

    }

    @Test
    void canPrintRandomNumbers() {
        int[] array = {2, 4, 7, 8, 23, 6};
        assertEquals(0, RandomLoopArray.generateNumbers(array));


    }
}












