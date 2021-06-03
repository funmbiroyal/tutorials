package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAIModification {
    private static SecureRandom secureRandom = new SecureRandom();
    private static int firstGeneratedNumber; //= 1 + secureRandom.nextInt(10);
    private static int secondGeneratedNumber; //= 1 + secureRandom.nextInt(10);
    private static int thirdGeneratedNumber; //= 1 + secureRandom.nextInt(10);
    private static int fourthGeneratedNumber; //= 1 + secureRandom.nextInt(10);


    public static  void randomize(){
        int count = 0;
        while(count < 5){
            firstGeneratedNumber = 1 + secureRandom.nextInt(10);
            secondGeneratedNumber = 1 + secureRandom.nextInt(10);
            thirdGeneratedNumber = 1 + secureRandom.nextInt(10);
            fourthGeneratedNumber = 1 + secureRandom.nextInt(10);
            count++;
        }
    }


    public static void generateQuestion() {
        System.out.println("How much is " + firstGeneratedNumber + " times " + secondGeneratedNumber);
    }

    public static void generateQuestionTwo() {
        System.out.println("How much is " + thirdGeneratedNumber + " times " + fourthGeneratedNumber);
    }

    public static void answer(int answer){
        if(answer == firstGeneratedNumber * secondGeneratedNumber || answer == thirdGeneratedNumber * fourthGeneratedNumber){
            positiveResponse();
        }else {
            negativeResponse();
        }
    }
    public static void positiveResponse(){
        int response = 1 + secureRandom.nextInt(3);
        if(response == 1){
            System.out.println("Very good!");
        }else if(response== 2){
            System.out.println("Excellent!");
        }else if (response == 3){
            System.out.println("Nice work!");
        }else
            System.out.println("Keep up the good work!");

    }
    public static void negativeResponse(){
        int response = 1 + secureRandom.nextInt(3);
        if(response == 1 ){
            System.out.println("No. Please try again.");
        }else if(response== 2){
            System.out.println("Wrong. Try once more."
                    );
        }else if (response == 3){
            System.out.println("Don't give up!");
        }else
            System.out.println("No. Keep trying");
        }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userAnswer;

        for (int i = 1; i <=3 ; i++) {
            randomize();
        do {
            generateQuestion();
            userAnswer = scanner.nextInt();
            answer(userAnswer);

        }while (userAnswer != firstGeneratedNumber * secondGeneratedNumber);
        do{
            generateQuestionTwo();
            userAnswer = scanner.nextInt();
            answer(userAnswer);
        } while(userAnswer != thirdGeneratedNumber * fourthGeneratedNumber);

    }
    }
}