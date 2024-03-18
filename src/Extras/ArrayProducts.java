package Extras;

import java.util.Arrays;

public class ArrayProducts {
    public static int []  fillProductsIntoArray(int [] array){
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length ; i++) {
            int product = 1;
            for (int j = 0; j < array.length; j++) {
                if (array[i]==array[j]){
                    continue;
                }
                product *= array[j];
            }
            newArray[i] = product;
        }

   return newArray;
    }

    public static void main(String[] args) {
        int [] myArray = {1,2,3,4,5};
        System.out.println(Arrays.toString(fillProductsIntoArray(myArray)));
    }
}
