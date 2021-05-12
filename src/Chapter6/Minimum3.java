package Chapter6;

import java.util.Scanner;

public class Minimum3 {
    public static int calculateMinimum(int a, int b, int c){
        return Math.min(Math.min(a,b),c);
    }

    public static int calculateMaximum(int a,int b,int c){
        return Math.max(Math.max(a,b),c);
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your first number");
        int userFirstNumber = scanner.nextInt();
        System.out.println("Enter your second Number");
        int userSecondNumber = scanner.nextInt();
        System.out.println("Enter your third Number");
        int userThirdNumber = scanner.nextInt();

        System.out.println("The minimum number is "+ " "+ calculateMinimum(userFirstNumber,userSecondNumber,userThirdNumber));

        System.out.println("The maximum number is "+ " "+ calculateMaximum(userFirstNumber,userSecondNumber,userThirdNumber));
    }
}
