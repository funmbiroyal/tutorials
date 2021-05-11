package Chapter6;

import java.util.Scanner;

public class SeparatingDigit {

    public static int getQuotient(int a, int b) {
        int answer = a / b;
        return answer;
    }

    public static int getRemainder(int a, int b) {
        int answer = a % b;
        return answer;
    }


    public static void displayDigit(int userDigit) {
        String result = "";

        while (userDigit > 0) {
            int unit = getRemainder(userDigit, 10);
            result = unit + " " + result;
            userDigit = getQuotient(userDigit, 10);

        }
        System.out.println(result);


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Digit ");
        int userDigit = scanner.nextInt();
        if (userDigit >= 1 && userDigit <= 99999) {
            displayDigit(userDigit);
        }else
            System.out.println("Numbers out of range!");
    }
}