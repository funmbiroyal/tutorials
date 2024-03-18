package Extras;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessingGameOOp {
    private static int userAnswer;
    private static int firstGeneratedNumber;
    private static int secondGeneratedNumber;
    private static final Scanner scanner = new Scanner(System.in);
    private static GameStatus statusOfGame;
    private static int addedGeneratedNumber;


    public static void showGame() {
        generateGuessingGame();

    }

    private static int generateGuessingGame() {
        System.out.println("welcome to guessing game!");
        SecureRandom generator = new SecureRandom();
         firstGeneratedNumber = 1 + generator.nextInt(20);
        secondGeneratedNumber = 1 + generator.nextInt(20);
        System.out.println(firstGeneratedNumber + "+" + secondGeneratedNumber + "= ?");
        userAnswer = scanner.nextInt();

        addedGeneratedNumber = firstGeneratedNumber + secondGeneratedNumber;
        return addedGeneratedNumber;
    }

    public static GameStatus judgeGame() {
        int guessGame = generateGuessingGame();
        if (userAnswer == addedGeneratedNumber )
            return statusOfGame = GameStatus.WON;

            return statusOfGame = GameStatus.FAILED;

//        if (statusOfGame == GameStatus.FAILED) {
////            System.out.println(guessGame);
//        }

    }
}
