package Chapter14Test;

import java.util.Scanner;

public class StringPalindrome {
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    for (int i = 1; i <= 2; i++) {

        System.out.println("Enter a String Value:");
        String userInput = scanner.next();
        StringBuilder sb = new StringBuilder(userInput);

        StringBuilder reversedUserInput = sb.reverse();

        if (userInput.equals(String.valueOf(reversedUserInput))) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not a palindrome");
        }
    }

}

}