package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ModifiedGuessTheNumber {
    private static int numberOfGuess;

    public static void countNumberOfGuess() {
        for (int i = 1; i <= 1000; i++) {
            numberOfGuess++;
        }
    }

    public static int getNumberOfGuess() {
        return numberOfGuess;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom secureRandom = new SecureRandom();
        int guessNumber = 0;
        int userGuess;
        
        String userResponse = " ";
        do {
            guessNumber =1 + secureRandom.nextInt(1000);
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
            System.out.println("Your number of guess is " + getNumberOfGuess());
        }while (userResponse.equalsIgnoreCase(("yes")));
      //  System.out.println("Game Ended, See you Next Time!");

    }
}
