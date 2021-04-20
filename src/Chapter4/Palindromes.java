package Chapter4;

import java.util.Scanner;

public class Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a five digit number");
        int userInput = scanner.nextInt();
        int firstNumber = userInput/10000;
        int firstDigit = userInput%10000;
        int secondNumber = firstDigit/1000;
        int secondDigit = firstDigit%1000;
        int thirdNumber = secondDigit/100;
        int thirdDigit = secondDigit%100;
        int fourthNumber = thirdDigit/10;
        int fifthNumber = thirdDigit%10;
     if (firstNumber==fifthNumber && secondNumber==fourthNumber ) System.out.println("This is a palindrome!");
     else
         System.out.println("Not a palindrome!");


        //System.out.println(firstNumber +" " +secondNumber +" "+ thirdNumber + " "+ fourthNumber+ " "+ fifthNumber);
    }
}
