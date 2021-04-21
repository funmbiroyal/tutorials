import java.security.SecureRandom;
import java.util.Scanner;

public class GuessTheNumberMainMethod {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();

        Scanner scanner = new Scanner(System.in);
        int prompt = 0;
        while (prompt != -1) {
        for (int i = 0; i <= 5 ; i++) {
            int random = 1 + secureRandom.nextInt(1000);

            System.out.println("Enter your guess number: ");
            int userInput = scanner.nextInt();
            if (userInput == random)
                System.out.println("Congratulations, You guessed the number");
            else if (userInput > random)
                System.out.println("Too high,Kindly try again");
            else if (userInput < random)
                System.out.println("Too Low, Kindly try more");
            System.out.println("The Guess Number is " + random);
        }
        prompt++ ;

    }
}
}