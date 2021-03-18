package Tdd;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class RandomloopTest {
    @Test
    void CanCreateArrayTest() {
        int[] array = {2, 4, 7, 8, 23, 6};
        assertNotEquals(array[1], array[2], RandomLoopArray.generateNumbers(array));

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












