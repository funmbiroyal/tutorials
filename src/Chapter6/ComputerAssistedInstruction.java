package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {

    //SecureRandom secureRandom
    private static SecureRandom secureRandom = new SecureRandom();;
    private static int firstGeneratedNumber;
    private static int secondGeneratedNumber;

    public static void generateQuestion(){
        firstGeneratedNumber = 1 + secureRandom.nextInt(10);
        secondGeneratedNumber = 1 + secureRandom.nextInt(10);
        System.out.println("How much is " + firstGeneratedNumber + " times " + secondGeneratedNumber);
    }

    public static void answer(int answer){
        if(answer == firstGeneratedNumber * secondGeneratedNumber){
            System.out.println("Very good!");
        }else {
            System.out.println("No. Please try again.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userAnswer;
        do {
            generateQuestion();
            userAnswer = scanner.nextInt();
            answer(userAnswer);
        }while (userAnswer == firstGeneratedNumber * secondGeneratedNumber);
        while (userAnswer!=firstGeneratedNumber * secondGeneratedNumber);
        generateQuestion();
        userAnswer = scanner.nextInt();
        answer(userAnswer);


    }
}
