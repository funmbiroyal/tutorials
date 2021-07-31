package Chapter7;

import java.util.Arrays;

public class CodeWarTask {
    public static int [] findIndicesOfTwoAddedNumber(int [] numbers,int value) {
        int [] newArray = new int[2];
        for(int i = 0; i <numbers.length; i++) {
            for(int j = 0; j <numbers.length; j++) {
                if (value == numbers[i] + numbers[j]){
                    newArray[0] = i;
                    newArray[1] = j;
                }
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int numbers [] ={1,2,3,5};
        int value = 3;
        System.out.println(Arrays.toString(findIndicesOfTwoAddedNumber(numbers, value)));
    }
}
