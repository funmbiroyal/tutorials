package Extras;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class ProductsOfArray {
//    private static final int[] array = {2, 3, 4, 5, 6};
//    private static final int[] newArray = new int[5];
//
//    public static void fillArrayWithProducts() {
//        int product;
//        for (int i = 0; i < array.length; i++) {
//            product = array[1] * array[2] * array[3] * array[4];
//            newArray[0] = product;
//            if (i == 1) {
//                product = array[0] * array[2] * array[3] * array[4];
//                newArray[1] = product;
//            } else if (i == 2) {
//                product = array[0] * array[1] * array[3] * array[4];
//                newArray[2] = product;
//            } else if (i == 3) {
//                product = array[0] * array[1] * array[2] * array[4];
//                newArray[3] = product;
//            }else if (i == 4) {
//                product = array[0] * array[1] * array[2] * array[3];
//                newArray[4] = product;
//            }
//
//        }
//        System.out.println("Initial Array: " + Arrays.toString(array));
//
//    System.out.println("New Array : " + Arrays.toString(newArray));



    public static int[]  fillArrayWithProducts(int []array){
        int [] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++){
            int product = 1;

            for (int j = 0; j < array.length ; j++) {

           if (i == j){
               continue;
           }
            product *= array[j];
            }
            newArray[i] = product;

        }
        return newArray;
    }




public static void main(String[] args) {
    int[] array = {2, 3, 4, 5, 6, 4};
    System.out.println(Arrays.toString(fillArrayWithProducts(array)));
 }

}


