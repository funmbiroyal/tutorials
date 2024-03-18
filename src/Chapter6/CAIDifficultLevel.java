package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

import static Chapter6.CaiStudentPerformance.*;

public class CAIDifficultLevel {
    private static SecureRandom secureRandom = new SecureRandom();
    private static int firstGeneratedNumber;
    private static int secondGeneratedNumber;
    private static int thirdGeneratedNumber;
    private static int fourthGeneratedNumber;
    private static int numberOfCorrectResponse;
    private static int numberOfIncorrectResponse;

    public static void randomizeLevel2() {
        firstGeneratedNumber = 1 + secureRandom.nextInt(100);
        secondGeneratedNumber = 1 + secureRandom.nextInt(100);
        thirdGeneratedNumber = 1 + secureRandom.nextInt(100);
        fourthGeneratedNumber = 1 + secureRandom.nextInt(100);

    }

    public static void askLevel2Question() {
        System.out.println("How much is " + firstGeneratedNumber + " times " + secondGeneratedNumber);

    }

    public static void askLevel2Question2() {
        System.out.println("How  much is " + thirdGeneratedNumber + " times " + fourthGeneratedNumber);
    }

    public static void answerLevel2(int answer) {
        if (answer == firstGeneratedNumber * secondGeneratedNumber || answer == thirdGeneratedNumber * fourthGeneratedNumber) {
            positiveResponse();
            numberOfCorrectResponse++;
        } else {
            negativeResponse();
            numberOfIncorrectResponse++;
        }
    }

    private static void answerLevel1(int userAnswer) {
        answer(userAnswer);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userAnswer = 0, userLevel;
        System.out.println("Enter Difficulty level (1 or 2):");
        userLevel = scanner.nextInt();

        if (userLevel == 1) {
            for (int i = 0; i < 10; i++) {


               randomize();
            do {
                //randomize();
                generateQuestion();
                userAnswer = scanner.nextInt();
                answer(userAnswer);
            } while (userAnswer != firstGeneratedNumber * secondGeneratedNumber);
//            do {
//                generateQuestionTwo();
//                userAnswer = scanner.nextInt();
//                answer(userAnswer);
//            }while (userAnswer != firstGeneratedNumber * secondGeneratedNumber);
//                    randomize();
//                    generateQuestionTwo();
//                }
//            }

//        while (userLevel != 1 || userLevel !=2){
//            System.out.println("Enter either level 1 or 2");
//

//            } else if (userLevel == 1) {
//                randomize();
//                do {
//                    generateQuestion();
//                    userAnswer = scanner.nextInt();
//                    answer(userAnswer);
//                } while (userAnswer != firstGeneratedNumber * secondGeneratedNumber);
//                do {
//                    generateQuestionTwo();
//                    userAnswer = scanner.nextInt();
//                    answer(userAnswer);
//                } while (userAnswer != thirdGeneratedNumber * fourthGeneratedNumber);
//            }
//        }

        }

    } }
}

