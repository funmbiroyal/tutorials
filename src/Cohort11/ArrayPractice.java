package Cohort11;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        int [] numbers = new int[5];
        try {
            numbers[0] = 2;
            numbers[1] = 8;
            numbers[2] = 4;
            numbers[3] = 7;
            numbers[4] = 3;
            numbers[5] = 9;
        }catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }


        for(int number : numbers){
            System.out.println(number);
        }
    }
}
