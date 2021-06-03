package Chapter8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);
        boolean gameOver = false;
        while (!gameOver) {
            try {
                player.display();
                System.out.println("Enter a position to play:");
                int playerGridPosition = scanner.nextInt();
                player.play(playerGridPosition);
            } catch (GameOverException e) {
                if (player.lastValuePlayedWasX) {
                    System.out.println("O WON!");
                } else {
                    System.out.println("X WON");
                }
                gameOver = true;
            } catch (BoardFullException e) {
                System.out.println("Its a draw!");
                gameOver = true;
            }catch(AlreadyOccupiedException e){
                System.out.println("Space has been Occupied!");
            }

        }
    }
}




