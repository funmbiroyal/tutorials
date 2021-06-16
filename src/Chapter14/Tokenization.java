package Chapter14;

import java.util.Scanner;

public class Tokenization {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String sentence = scanner.nextLine();
        String[] tokens = sentence.split(" ");
        System.out.printf("Number of element: %d%nThe tokens are:%n",tokens.length);

        for(String token: tokens){
            System.out.println(token);
        }
    }
}
