package Extras;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ShuffleClass {
    private static int [] shuffle(int [] array,int number) {
        int [] newArray = new int [array.length];


        if (number >  0) {
            array[2] = newArray[0];
            array[3]= newArray[1];

        }else if( number < 0){
            array[0] = newArray[2];
            array[1]= newArray[3];
        }else {
            System.out.println("Invalid");

        }
        return newArray;
    }

    public static void main(String[] args) {
        int [] array = {8,5,3,7};
          int number = -3;
        System.out.println(Arrays.toString(shuffle(array, number)));
    }
}

//