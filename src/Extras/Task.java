package Extras;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void mergeArrayInIncreasingOrder(int[] classA,int []classB){
        List<Number> myList = new ArrayList<>();
        for (int i = 0; i < classA.length; i++) {
            myList.add(classA[i]);
        }
            for (int j = 0; j < classB.length; j++) {
                myList.add(classB[j]);

            }

        System.out.println(myList);
    }

    public static void main(String[] args) {
        int[] classA = {4,2,9};
        int []classB = {6,7,8};

        mergeArrayInIncreasingOrder(classA,classB);
    }
}
