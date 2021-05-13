package Chapter6;

import java.security.SecureRandom;

public class Craps {
    private enum Status {CONTINUE, WON, LOST};

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static int rollDice() {
        SecureRandom secureRandom = new SecureRandom();
        int die1 = 1 + secureRandom.nextInt(6);
        int die2 = 1 + secureRandom.nextInt(6);
        int sum = die1 + die2;
        System.out.printf("Player rolled %d + %d = %d%n", die1, die2, sum);
        return sum;
    }

    public static void main(String[] args) {
        int points = 0;
        Status gameStatus;

        int sumOfDie = rollDice();
        switch (sumOfDie) {
            case SEVEN:
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                points = sumOfDie;
                System.out.println("Your Points:");
                System.out.printf("%d%n", points);
        }
        while (gameStatus == Status.CONTINUE) {
            sumOfDie = rollDice();
            if (sumOfDie == points) {
                gameStatus = Status.WON;
            } else if (sumOfDie == SEVEN || sumOfDie == YO_LEVEN) {
                gameStatus = Status.LOST;
            }
        }
        if(gameStatus == Status.WON){
        System.out.println("You WON!");
    }
    else{
            System.out.println("you LOST!");
        }

    }
}


