package Chapter6;

import java.util.Scanner;

public class Points {
    private static int point;


    public static int qualifyPoint(int average) {
        if (average >= 90 && average <= 100) {
            point = 4;
        } else if (average >= 80 && average <= 89) {
            point = 3;
        } else if (average >= 70 && average <= 79) {
            point = 2;
        } else {
            point = 0;
        }
        return point;


    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your average: ");
        int userInput = scanner.nextInt();
        System.out.println("Your point is " + " "+ qualifyPoint(userInput));
    }
}