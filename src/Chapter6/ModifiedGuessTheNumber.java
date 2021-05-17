package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ModifiedGuessTheNumber {
    private static int numberOfGuess;

    public static void countNumberOfGuess() {
        numberOfGuess++;

    }

    public static int getNumberOfGuess() {
        return numberOfGuess;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        int guessNumber = 0;
        int userGuess;
        int guessCount;

        String userResponse = " ";
        do {
            guessNumber = 1 + secureRandom.nextInt(1000);
            System.out.println("Guess the Number: ");
            userGuess = scanner.nextInt();
            while (userGuess != guessNumber) {
                if (userGuess > guessNumber) {
                    System.out.println("Too High, Try Again!");
                } else {
                    System.out.println("Too Low, Try Again!");
                }
                userGuess = scanner.nextInt();
            }
            System.out.println("Congratulations, You just Guessed the number!");
            countNumberOfGuess();
            guessCount = getNumberOfGuess();

            System.out.println("Your number of guess is " + getNumberOfGuess());
            if (guessCount < 10) {
                System.out.println("You got lucky");
            } else if (guessCount == 10) {
                System.out.println("Hahaah , you know the secret");
            } else  {
                System.out.println("You should be able to do better!");

            }
            System.out.println("Do you want to play again?");
            userResponse = scanner.next();
        } while (userResponse.equalsIgnoreCase(("yes")));
        System.out.println("Game Ended, See you Next Time!");

    }
}
