package Cohort11;

import java.util.Arrays;

public class C11Exercise {
    public static int [] returnTwoArraysAsOne(int[]num1, int []num2){
        int [] mergedArray=new int[num1.length + num2.length];
        for (int i = 0; i < mergedArray.length ; i++) {
            for (int j = 0; j < num1.length ; j++) {
                 mergedArray[i] = num1[j];
//                for (int k = 0; k < num2.length ; k++) {
//                    mergedArray[i] = num1[k];
//            }



            }

        }

        return mergedArray;
    }

    public static void main(String[] args) {
        int [] num1 = {1,2};
        int [] num2 = {1,8};
        System.out.println(Arrays.toString(returnTwoArraysAsOne(num1,num2)));
    }
}
