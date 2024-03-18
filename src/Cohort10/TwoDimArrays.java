package Cohort10;

import java.util.Arrays;

public class TwoDimArrays {
    public static void main(String[] args) {
        int [][] numbers = new int [4][4];

        numbers[0][0] = 6;
        numbers[0][1] = 4;
        numbers[0][2] = 4;
        numbers[0][3] = 4;
        numbers[1][0] = 5;
        numbers[1][1] = 1;
        numbers[1][2] = 1;
        numbers[1][3] = 1;


        for (int row = 0; row < numbers.length ; row++) {
            for (int column = 0; column < numbers[row].length ; column++) {
                System.out.println(Arrays.toString(numbers[row]));
            }


        }
    }
}
