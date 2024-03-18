package Chapter7;

import java.util.Scanner;

public class FibonacciSeries {
    public static int findFibonacci(int n){
        if(n <= 1)
            return n;
        else
            return findFibonacci(n-1) + findFibonacci(n-2);
    }

    public static double findFibonacci(double n){
        if(n <= 1)
            return n;
        else
            return findFibonacci(n-1) + findFibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your nth value in integer: ");
        int input = scanner.nextInt();
        for (int i = 0; i <= input; i++) {
       System.out.print( input <= 10 ? findFibonacci(i) + " ": "");
        }

        System.out.println();

        System.out.println("Enter your nth value in double: ");
        double input2 = scanner.nextInt();
        for (double i = 0; i <= input2; i++) {
            System.out.print( input2 <= 10 ? findFibonacci(i) + " ": "");
        }
    }
}
