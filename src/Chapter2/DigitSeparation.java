package Chapter2;

import java.util.Scanner;

public class DigitSeparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your four Digit number");
        int userInput = scanner.nextInt();

        int firstDigit = userInput/1000;
        int userInput2 = userInput%1000;
        int secondDigit = userInput2/100;
        int userInput3 = userInput2%100;
        int thirdDigit = userInput3/10;
        int userInput4 = userInput3%10;
        int fourthDigit = userInput4/1;

        System.out.println(firstDigit + " " + secondDigit+ " " + thirdDigit+ " " + fourthDigit);

    }
    }

