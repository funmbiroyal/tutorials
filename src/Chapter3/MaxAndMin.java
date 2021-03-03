import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        int inputCounter = 1;
        int userInput;
        int largestNumber = 0;
        int smallestNumber = 0;
        Scanner inputCollector = new Scanner(System.in);

        while (inputCounter <= 3) {
            System.out.println("Enter your number");
            userInput = inputCollector.nextInt();


            if (inputCounter == 1) {
                largestNumber = userInput;
                smallestNumber = userInput;
            }
            if (userInput > largestNumber) largestNumber = userInput;

            if (userInput < smallestNumber) smallestNumber = userInput;

            inputCounter++;

        }
        System.out.println("the maximum number is: " + largestNumber +"\nthe minimum number is " + smallestNumber);


    }

}





//            boolean isFirstUserInput = inputCounter == 1;
//            if (isFirstUserInput) {
//                largestNumber = userInput;
//                smallestNumber = userInput;
//            }


//            boolean userInputIsLarger = userInput > largestNumber;
//            if (userInputIsLarger) largestNumber = userInput;

//            boolean userInputIsSmaller = userInput < smallestNumber;
//            if (userInputIsSmaller) smallestNumber = userInput;