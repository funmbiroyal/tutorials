import java.util.Scanner;
public class GuessGame{
    public static void main(String[] args){
     int guessNumber = 80;

     Scanner input= new Scanner (System.in);
     System.out.println("Guess your Number");
     int userGuess = input.nextInt();

     if(userGuess == guessNumber)
     System.out.println("You are correct!");

     if(userGuess > guessNumber)
     System.out.println("Too Much");

      if (userGuess < guessNumber)
      System.out.println("Too Less");
 


}



}