package Extras;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Task {
    public static Integer [] mergeArrayInAscendingOrder(int[] classA,int []classB) {
        //merge two Arrays
        List<Integer> myList = new ArrayList<>();
        for (int i : classA) {
            myList.add(i);
        }
        for (int j : classB) {
            myList.add(j);

        }
        Integer [] newArray = new Integer[myList.size()];
        myList.toArray(newArray);

        //sort them in ascending order
        for (int i = 0; i < newArray.length; i++) {

            for (int j = i; j < newArray.length; j++) {
                Integer temp = newArray[i];
                if (newArray[i] > newArray[j]){
                    newArray[i] = newArray[j];
                    newArray[j] = temp;
                }
            }
        }
 System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static void main(String[] args) {
        int[] classA = {4,5,6};
        int []classB = {1,2,3};
//        int[] classA = {4,2,9};
//        int []classB = {6,7,8};

        mergeArrayInAscendingOrder(classA,classB);
    }

    @Test
    void testThatCanMergeArrayInAscendingOrder(){
        int[] classA = {3,5,9};
        int []classB = {6,7,8};
       Integer [] mergedAndSortedClass ={ 3,5,6,7,8,9};
        assertArrayEquals(mergedAndSortedClass,mergeArrayInAscendingOrder(classA,classB));
    }
}