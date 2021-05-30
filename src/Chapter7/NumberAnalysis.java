package Chapter7;

import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        System.out.println("Enter the length of numbers ");
        int userLength = scanner.nextInt();
        double[] numbers = new double[userLength];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < userLength ; i++) {
            numbers[i] = scanner.nextDouble();
           sum += numbers[i];

        }
        double average = sum / userLength;

               int count = 0;
        for(int i = 0; i < userLength; i++){
            if (numbers[i] > average){
                count ++;
            }
        }
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
        System.out.println("The element above average is " + count);

    }
}
