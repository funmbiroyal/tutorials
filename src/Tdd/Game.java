package Tdd;

import java.security.SecureRandom;

public class Game {
    private  static final SecureRandom randomNumbers = new SecureRandom();

    public static int rollDice() {
       int roll1 = 1 + randomNumbers.nextInt(6);
        int roll2 = 1 + randomNumbers.nextInt(6);
        int sum = roll1 + roll2;
        System.out.printf("you rolled %d+%d = %d%n", roll1,roll2,sum);
        return sum;
    }

}
