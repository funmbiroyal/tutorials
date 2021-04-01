package Tdd;

import java.util.Random;

public class RandomLoopArray {

    public static int generateNumbers(int [] array ) {
        Random random = new Random();
        for (int num = 0; num <6 ; num++) {
            ++array [1+ random.nextInt(5)];
        }
       int randomNumbersGenerated = 0;
        int firstRandomNumber=0;
        int secondRandomNumber = 0;
        if(firstRandomNumber != secondRandomNumber){

        }
        return randomNumbersGenerated;
    }




















    //    public static int generateNumbers(int [] array) {
//        Random random = new Random ();
//        for (int num = 0; num < 6; num++) {
//            ++array [1 + random.nextInt(4)];
//        }
//        return 0;
    }

