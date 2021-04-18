package Chapter4;

import java.util.Scanner;

public class LargestNumberMainMethod {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int largestNumber = 0;
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Enter the number of units sold :");
            int userInput = scanner.nextInt();
            if(userInput > largestNumber)  largestNumber = userInput;


        }
        System.out.println("The largest number is "+ largestNumber);
    }
}
