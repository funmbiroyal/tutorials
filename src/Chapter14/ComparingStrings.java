package Chapter14;

import java.util.Objects;
import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first string:");
        String userString1 = scanner.next();
        System.out.println("Enter your second string:");
        String userString2 = scanner.next();
        System.out.println(userString1.compareTo(userString2));
       if(userString1.compareTo(userString2) == 0) {
           System.out.println(userString1 +" is equal to " + userString2);
       }
       else if (userString1.compareTo(userString2)> 0){
           System.out.println(userString1 +" is greater than " + userString2);
       }
       else
           System.out.println(userString1 +" is lesser than " + userString2);
    }
}