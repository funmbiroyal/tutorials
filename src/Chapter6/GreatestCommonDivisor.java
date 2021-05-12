package Chapter6;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void findGCD(int number1,int number2){
        int GCD =0;
        for (int i = 1; i <= number1 && i <= number2 ;i++) {
            if(number1 % i == 0 && number2 % i == 0){

                GCD = i;
            }


        }
        System.out.println("The Greatest common divisor of " + " " + number1+ " and " +number2 + " is " + GCD);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number 1");
        int number1 = scanner.nextInt();
        System.out.println("Enter your number 2");
        int number2 = scanner.nextInt();
       findGCD(number1,number2);

    }
}
