package Chapter19;

import java.security.SecureRandom;
import java.util.Arrays;

public class SelectionSortExample {
    public static void selectionSort(int [] data ){
        for (int i = 0; i < data.length ; i++) {
            int smallest = i;
            for (int j = i+1; j < data.length; j++) {
                if (data[j] < data[smallest]){
                    smallest = j;
                }
            }
            swap(data,i,smallest);
            printPass(data,i,smallest);
        }
    }
    public static void swap(int [] data , int first, int second){
        int temporary = data[first];
        data[first] = data[second];
        data[second] = temporary;
    }
    public static void printPass(int [] data, int pass, int index){
        System.out.printf("after pass %2d",pass);
        for (int i = 0; i < index; i++) {
            System.out.printf("%d ",data[i]);
            System.out.printf("%d* ", data[index]);

        }
        for (int i = index + 1; i < data.length ; i++)
            System.out.printf("%d",data[i]);
            System.out.println("           ");

        for (int j = 0; j < pass ; j++) {
            System.out.print("--  ");
            System.out.println();

        }
    }

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();
        int []data = new int [15];
        for (int i = 0; i < data.length ; i++)
            data[i] =1 + generator.nextInt(50);

        System.out.printf("unsorted array%n%s%n", Arrays.toString(data));
        selectionSort(data);
        System.out.printf("sorted array %n%s%n%n",Arrays.toString(data));
    }
}
