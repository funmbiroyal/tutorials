package Extras;

import java.util.Arrays;

public class SortAndFindIndex {

    public static void sortArray(int [] numbers){
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = i; j < numbers.length ; j++) {
                int temp = numbers[i];
                if (numbers[i] > numbers[j]){
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(numbers));
    }

    public static void findIndexOfFirstAndLastDuplicateNumber(int [] numbers, int number){

        int store1 = -1;
        int store2 = -1;
        int [] newArray = {store1, store2};
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < newArray.length; j++ ){
            if (numbers[i] == number && store1 == -1 ){
                store1 = i;
                newArray[0] = store1;
                break;
            }
            if (numbers[i] == number && store1 != -1) {
                store2 = i;
                newArray[1] = store2;
            }
            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static void main(String[] args) {
        //int[] array  = {2,4,-3,0,0,0,0,5};
        int[] array  = {2,4,-3,0,5, 9,9};
        sortArray(array);
        findIndexOfFirstAndLastDuplicateNumber(array,9);
    }
}
