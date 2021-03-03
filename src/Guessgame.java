import java.util.Scanner;

public class Guessgame {
    public static void main(String[] args) {
        int userGuess=1;
        int guessNumber = 50;
        Scanner space = new Scanner(System.in);

               while (userGuess != guessNumber) {
                   System.out.println("Enter your number: ");
                   userGuess = space.nextInt();
                   if (userGuess == guessNumber)
                       System.out.println("you won!");
                    /*else if (userGuess < guessNumber)
                        System.out.println("Too Less");
                    else
                        System.out.println ("Too High");
               }*/


               }

        }

            }



