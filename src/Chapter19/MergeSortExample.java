package Chapter19;

import java.security.SecureRandom;
import java.util.Arrays;

public class MergeSortExample {
    private static void mergeSort(int [] data){
        sortArray(data,0,data.length-1);
    }

    public static void sortArray(int []data, int low, int high){
        if ((high-low) >= 1){
            int firstHalf = low + high/2;
            int secondHalf = firstHalf + 1;

            System.out.println("Splitting step");
            System.out.printf("split: %s%n",subArrayString(data, low, high));
            System.out.printf("      %s%n",subArrayString(data,low,firstHalf));
            System.out.printf("      %s%n",subArrayString(data,secondHalf,high));

            sortArray(data,low,firstHalf);
            sortArray(data,secondHalf,high);
          merge(data,low,firstHalf,secondHalf,high);
        }
    }
    private static void merge(int data [], int  left, int firstHalf, int secondHalf,int right ){
      int leftIndex = left;
      int rightIndex = secondHalf;
      int combinedIndex = left;
      int [] combined = new int[data.length];

        System.out.printf("merge: %s%n", subArrayString(data,left,firstHalf));
        System.out.printf("        %s%n", subArrayString(data,secondHalf,right));

        while (leftIndex <= firstHalf && rightIndex <= secondHalf){
            if (data[leftIndex] <= data[rightIndex])
                combined[combinedIndex++] = data[leftIndex++];
            else
                combined[combinedIndex++] = data[rightIndex++];
             }
        if (leftIndex == secondHalf)
            while (rightIndex <= right)
                combined[combinedIndex++] = data[rightIndex++];
        else
            while (leftIndex <= firstHalf)
                combined[combinedIndex++] = data[leftIndex++];
        for (int i = left; i <= right ; i++)
            data[i] = combined[i];
        System.out.printf("       %s%n%n",subArrayString(data,left,right));


        }

    private static String subArrayString(int data [], int low, int high){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < low ; i++)
            sb.append(" ");

        for (int i = low; i <= high; i++)
            sb.append(" " + data[i]);

        return sb.toString();

    }

    public static void main(String[] args) {
        SecureRandom generator = new SecureRandom();
        int [] data = new int[10];

        for (int i = 0; i < data.length ; i++)
            data[i] = 10 + generator.nextInt(30);
            System.out.printf("Unsorted array: %n%s%n%n", Arrays.toString(data));
            mergeSort(data);

            System.out.printf("Sorted Array:%n%s%n%n",Arrays.toString(data));

    }
}
