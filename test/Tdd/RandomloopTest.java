package Tdd;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class RandomloopTest {
    @Test
    void CanCreateArrayTest() {
        int[] array = {2, 4, 7, 8, 23, 6};
        int firstRandom = RandomLoopArray.generateNumbers(array);
        System.out.println(firstRandom);
        int secondRandom = RandomLoopArray.generateNumbers(array);
        System.out.println(secondRandom);
        assertNotEquals(firstRandom, secondRandom);

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












