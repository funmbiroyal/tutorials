package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class ComputerAssistedInstruction {

    //SecureRandom secureRandom
    private static SecureRandom secureRandom = new SecureRandom();;
    private static int firstGeneratedNumber;
    private static int secondGeneratedNumber;
    private static  String temp;

    public static void generateQuestion(){
        firstGeneratedNumber = 1 + secureRandom.nextInt(5);
        secondGeneratedNumber = 1 + secureRandom.nextInt(5);
        System.out.println("How much is " + firstGeneratedNumber + " times " + secondGeneratedNumber);



    }

    public static void rightAnswer(int answer) {

        if (answer == firstGeneratedNumber * secondGeneratedNumber) {
            System.out.println("Very good!");
        }
   }
        public static  void question(){
        temp = firstGeneratedNumber + " times " + secondGeneratedNumber;
   }
        public static  void wrongAnswer(int answer) {
           if (answer != firstGeneratedNumber * secondGeneratedNumber) {
                System.out.println("No. Please try again.");
                question();
                //System.out.println("How much is " + temp);


            }
       }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userAnswer = 0;


//        do {
//            generateQuestion();
//            userAnswer = scanner.nextInt();
//            answer(userAnswer);
//        }while (userAnswer == firstGeneratedNumber * secondGeneratedNumber);
//       // generateQuestion();
//        userAnswer = scanner.nextInt();
//        answer(userAnswer);
        for (int i = 0; i < 10 ; i++) {
            generateQuestion();
            userAnswer = scanner.nextInt();
              if (userAnswer == firstGeneratedNumber * secondGeneratedNumber) {
                  rightAnswer(userAnswer);
              }else
            wrongAnswer(userAnswer);
        }

    }
}
