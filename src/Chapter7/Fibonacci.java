package Chapter7;

import java.util.Scanner;

public class Fibonacci {
    public static int findFibonacci(int n){
        if (n <= 1)
            return n;
        return findFibonacci(n-1) + findFibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your nth value: ");
        int n = scanner.nextInt();
       for (int i = 0; i <= n; i++) {
           System.out.print(findFibonacci(i) + " ");
        }

    }
}
