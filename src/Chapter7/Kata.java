package Chapter7;

import java.security.SecureRandom;
import java.util.Arrays;

public class Kata {
    SecureRandom randomGenerator = new SecureRandom();

    public void shuffle(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int generatedRandomNumber = randomGenerator.nextInt(array.length);
            int store = array[generatedRandomNumber];
            array[generatedRandomNumber] = array[i];
            array[i] = store;

        }
        System.out.println(Arrays.toString(array));

    }

    public void sortInAscendingOrder(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int store = array[i];
                if (array[i] > array[j]) {
                    array[i] = array[j];
                    array[j] = store;

                }
            }


        }
        System.out.println(Arrays.toString(array));
    }


    public void sortInDescendingOrder(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                int store = arr[i];
                if(arr[i] < arr[j]){
                    arr[i] = arr[j];
                    arr[j] = store;
                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

}