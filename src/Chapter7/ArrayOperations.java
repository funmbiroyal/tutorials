package Chapter7;

import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {

        int [] array = new int[10];
        System.out.println(Arrays.toString(array));

        int [] secondArray = {2,3,6,8,9,5,3,4,1,12,7,11,6,10,13};
        System.out.println("Values before adding one each " + Arrays.toString(secondArray));
        for (int i = 0; i < secondArray.length ; i++) {

             ++ secondArray[i];
        }
        System.out.println("Values after adding one each " + Arrays.toString(secondArray));
        System.out.print("Top 5 scores ----");
        System.out.print(secondArray[14] + " ");
        System.out.print(secondArray[9] + " ");
        System.out.print(secondArray[11] + " ");
        System.out.print(secondArray[13] + " ");
        System.out.print(secondArray[4] + " ");

    }
}
