package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ModifiedCrapsGame {

    private static int bankBalance = 1000;
    private static final SecureRandom randomGenerator = new SecureRandom();
    private static GameStatus status = GameStatus.START;

    public static int rollDice() {
        int die1 = 1 + randomGenerator.nextInt(6);
        int die2 = 1 + randomGenerator.nextInt(6);
        int sum = die1 + die2;
        System.out.println("player rolled "+ die1 + " and " + die2+ " = " + sum);
        return sum;
    }

    public static void playCrap() {
        int points = 0;
        int sumOfDie;
        int result = rollDice();
        if (status == GameStatus.START) {
            if (result == 7 || result == 11) {
                status = GameStatus.WON;
            } else if (result == 2 || result == 3|| result == 12){
                status = GameStatus.LOST;
            }else{
                status = GameStatus.CONTINUE;
                sumOfDie = points;
            }
            if (status == GameStatus.CONTINUE){
                sumOfDie = rollDice();
                if (sumOfDie == points){
                    status = GameStatus.WON;
                }
            }
            if (status == GameStatus.WON){
                System.out.println("YOU WON");
            }else
                System.out.println("YOU LOST");
        }

    }

    public static void validateWager(int wager) {
       // playCrap();

        if (wager <= bankBalance && status == GameStatus.WON) {
            bankBalance += wager;

        } else if (wager <= bankBalance && status == GameStatus.LOST) {
            bankBalance -= wager;

        } else if (wager <= bankBalance && status == GameStatus.CONTINUE) {
                bankBalance+=wager;
        }else{
            System.out.println("Ooops,insufficient bank balance");
        }


    }

    public static int getBankBalance() {
        return bankBalance;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to game of Craps");
        System.out.println("Enter your wager");
        int userWager = scanner.nextInt();
        playCrap();
        validateWager(userWager);


        System.out.println("Your balance " +getBankBalance());





    }

}