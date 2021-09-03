package Chapter19;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchExample {
    public static int linearSearch(int [] data, int searchKey){
        for (int i = 0; i < data.length; i++) {
            if (data[i] == searchKey){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();
        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = 1 + generator.nextInt(50);
        }
        System.out.printf("%s%n%n", Arrays.toString(data));

        System.out.println("Please enter your integer value you want to search or -1 to quit");
        int searchInt = scanner.nextInt();
        while (searchInt != -1) {
            int indexOfSearchedKey = linearSearch(data, searchInt);
            if (indexOfSearchedKey == -1) {
                System.out.printf("%d was not found%n%n", searchInt);
                break;
            } else {
                System.out.printf("%d was found in position %d%n%n", searchInt, indexOfSearchedKey);

                System.out.println("Please enter your integer value you want to search or -1 to quit");
                 searchInt = scanner.nextInt();
            }
        }
    }
}

