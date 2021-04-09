import Tdd.Game;

import static Tdd.Game.rollDice;

public class GameMain {
    private enum Status {CONTINUE, WON, LOST}

    private static final int FIRST_SIDE = 2;
    private static final int SECOND_SIDE = 3;
    private static final int THIRD_SIDE = 7;
    private static final int FOURTH_SIDE = 11;
    private static final int FIFTH_SIDE = 12;


    public static void main(String[] args) {
        //Game game = new Game();
        int myPoint = 0;
        Status gameStatus;
        int sumOfRoll = rollDice();
        switch (sumOfRoll) {
            case FIRST_SIDE:
            case SECOND_SIDE:
                gameStatus = Status.WON;
                break;
            case THIRD_SIDE:
            case FOURTH_SIDE:
            case FIFTH_SIDE:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                myPoint = sumOfRoll;
                System.out.printf("Your Point is %d%n", myPoint);
                break;
        }
            while (gameStatus == Status.CONTINUE) {
                sumOfRoll = rollDice();
                if (sumOfRoll == myPoint) gameStatus = Status.WON;

                else if (sumOfRoll == THIRD_SIDE)
                    gameStatus = Status.LOST;
            }
if (gameStatus == Status.WON)
        System.out.println("Congratulations, You won");
        else
        System.out.println("Oh Sorry, You can win next time");

            }


    }

