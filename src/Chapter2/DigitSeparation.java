package Chapter2;

public class DigitSeparation {
    public static void main(String[] args) {
        int userInput = 3456;
        int firstDigit = userInput/1000;
        int userInput2 = userInput%1000;
        int secondDigit = userInput2/100;
        int userInput3 = userInput2%100;
        int thirdDigit = userInput3/10;
        int userInput4 = userInput3%10;
        int fourthDigit = userInput4/1;

        System.out.println(firstDigit + " " + secondDigit+ " " + thirdDigit+ " " + fourthDigit);
    }
    }

