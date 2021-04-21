package Tdd;

import java.security.SecureRandom;
import java.util.Random;

public class RandomLoopArray {

    public static int generateNumbers(int[] array ) {
        SecureRandom random = new SecureRandom();
        int num = 0;
        for (; num < 6; num++) {
            ++array[random.nextInt(5) + 1];
        }
        return array[num-1];
    }
}

