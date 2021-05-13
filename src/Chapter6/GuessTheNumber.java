package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;


public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        int numberToBeGuessed;
        int userGuess = 0;

        String userResponse;

        do {
            numberToBeGuessed = secureRandom.nextInt(1000);
            System.out.println("Guess the number");
            userGuess = scanner.nextInt();

            while (userGuess != numberToBeGuessed) {
                if (userGuess > numberToBeGuessed) {
                    System.out.println("Too High!,try again. ");
                } else {
                    System.out.println("Too low!, try again");
                }
                userGuess = scanner.nextInt();
            }

            System.out.println("Congratulation, You just guessed the number!");

            System.out.println("Do you still want to play again?");
            userResponse = scanner.next();
            while (!(userResponse.equalsIgnoreCase("yes") || userResponse.equalsIgnoreCase("no"))) {
                System.out.println("Enter yes or no");
                userResponse = scanner.next();
            }
        }while(userResponse.equalsIgnoreCase(("yes")));
        System.out.println("Game ended, see you next time!");

    }
}