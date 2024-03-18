package Chapter6;

import java.security.SecureRandom;
import java.util.Scanner;

public class CaiStudentPerformance {
    private static final SecureRandom secureRandom = new SecureRandom();
    private static int numberOfCorrectResponses = 0;
    private static int numberOfIncorrectResponses = 0;
    private static int firstGeneratedNumber;
    private static int secondGeneratedNumber;
    private static int thirdGeneratedNumber;
    private static int fourthGeneratedNumber;
    private static  int totalScore;

    public static void setTotalNumberOfQuestion(int totalNumberOfQuestion) {
        CaiStudentPerformance.totalNumberOfQuestion = totalNumberOfQuestion;
    }

    private static int totalNumberOfQuestion;
    private static int percentage;

    public static int getNumberOfCorrectResponses() {

        return numberOfCorrectResponses;
    }

    public static int getNumberOfIncorrectResponses() {
        return numberOfIncorrectResponses;
    }

    public static  void randomize(){
            firstGeneratedNumber = 1 + secureRandom.nextInt(10);
            secondGeneratedNumber = 1 + secureRandom.nextInt(10);
            thirdGeneratedNumber = 1 + secureRandom.nextInt(10);
            fourthGeneratedNumber = 1 + secureRandom.nextInt(10);
    }

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

    public static void generateQuestion() {
        System.out.println("How much is " + firstGeneratedNumber + " times " + secondGeneratedNumber);
    }
    public static void answerLevel2(int answer) {
        if (answer == firstGeneratedNumber * secondGeneratedNumber || answer == thirdGeneratedNumber * fourthGeneratedNumber) {
            positiveResponse();
            numberOfCorrectResponses++;
        } else {
            negativeResponse();
            numberOfIncorrectResponses++;
        }
    }


    public static void generateQuestionTwo() {
        System.out.println("How much is " + thirdGeneratedNumber + " times " + fourthGeneratedNumber);
    }

    public static void answer(int answer){


        if(answer == firstGeneratedNumber * secondGeneratedNumber || answer == thirdGeneratedNumber * fourthGeneratedNumber){
            positiveResponse();
            numberOfCorrectResponses++;
        }else {
            negativeResponse();
            numberOfIncorrectResponses++;
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
    public static double calculatePercentageOfCorrectResponses(int numberOfCorrectResponses){
        double percentage = (double)( getNumberOfCorrectResponses()/totalNumberOfQuestion) * 100;

        return percentage;

    }
    public static boolean showGrade(){
        if (percentage < 75){
            System.out.println("Please contact your teacher for help");
        }else {
            System.out.println("Congratulations!, You had more than 75 percent.");
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
               int userAnswer,userLevel;
        System.out.println("Enter Difficulty level (1 or 2):");
        userLevel = scanner.nextInt();
         if(userLevel == 1) {
             randomize();
             do {
                 generateQuestion();
                 userAnswer = scanner.nextInt();
                 answer(userAnswer);
             } while (userAnswer != firstGeneratedNumber * secondGeneratedNumber);
             do {
                 generateQuestion();
                 userAnswer = scanner.nextInt();
                 answer(userAnswer);
             } while (userAnswer != thirdGeneratedNumber * fourthGeneratedNumber);
         }

            if (userLevel == 2) {
                randomizeLevel2();
                do {
                    askLevel2Question();
                    userAnswer = scanner.nextInt();
                    answerLevel2(userAnswer);
                } while (userAnswer != firstGeneratedNumber * secondGeneratedNumber);

                do {
                    askLevel2Question2();
                    userAnswer = scanner.nextInt();
                    answerLevel2(userAnswer);
                } while (userAnswer != thirdGeneratedNumber * fourthGeneratedNumber);

            }

         }
    }

