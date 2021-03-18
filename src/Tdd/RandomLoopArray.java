package Tdd;

import java.util.Random;

public class RandomLoopArray {
    public static int generateNumbers(int [] array ) {
        Random random = new Random();
        for (int num = 0; num <6 ; num++) {
            ++array [1+ random.nextInt(5)];
        }
        return 0;
    }





















    //    public static int generateNumbers(int [] array) {
//        Random random = new Random ();
//        for (int num = 0; num < 6; num++) {
//            ++array [1 + random.nextInt(4)];
//        }
//        return 0;
    }

