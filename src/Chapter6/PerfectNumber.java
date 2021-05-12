package Chapter6;

import java.util.Scanner;

public class PerfectNumber {
    public static void isPerfect (int number ){
        int store = 0;
        String conclusion = "not a perfect Number";
        for (int i = 1; i <number ; i++) {
            store += i;
            //System.out.println(i);
           if(store == number) {
               conclusion = "is a perfect Number";
               // System.out.println(conclusion);
           }
           }
        System.out.println(conclusion);
        }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int userNumber = scanner.nextInt();
        isPerfect(userNumber);
    }
    }

