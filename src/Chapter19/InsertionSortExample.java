package Chapter19;

import java.security.SecureRandom;
import java.util.Arrays;

public class InsertionSortExample {
    public static void insertionSort(int [] data){
        for (int i = 1; i < data.length ; i++) {
            int insertValue = data[i];
            int moveItem = i;

            while (moveItem > 0 && data[moveItem - 1] > insertValue) {
                //index of location moveItem is greater than zero and the element there
                // is greater than the value to be inserted.
                data[moveItem] = data[moveItem - 1];
                moveItem --;
            }
            data[moveItem] = insertValue;
            printPass(data, i,moveItem);
        }
    }
    public static void printPass(int [] data, int counter, int indexTakingInValue){
        System.out.printf("after count %2d",counter);
        for (int i = 0; i < indexTakingInValue ; i++)
            System.out.printf("%d  ", data[i]);
        System.out.printf("%d* " ,data[indexTakingInValue]);
        for (int i = indexTakingInValue + 1; i < data.length ; i++)
            System.out.printf("%d ", data[i]);

        System.out.printf("%n               ");
        for(int i = 0; i <= counter; i++)
            System.out.print("-- ");
            System.out.println();

    }

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();
        int [] data = new int[10];
        for (int i = 0; i < data.length ; i++) {
            data[i] = 1 + generator.nextInt(50);
        }
        System.out.printf("Unsorted Array:%n%s%n%n", Arrays.toString(data));
        insertionSort(data);

        System.out.printf("Sorted Array:%n%s%n%n",
        Arrays.toString(data));
    }

}
