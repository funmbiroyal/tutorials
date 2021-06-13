package Chapter14;

import java.util.Scanner;

public class StringBuilderPractise {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello world!");
          System.out.printf("The first Character is %s%n",s.charAt(0));
               s.setCharAt(0,'Y');
               System.out.printf("The first Character has now been changed to Y == %s%n",s.toString());
        char [] characters = new char[s.length()];
        s.getChars(0,s.length(),characters,0);
        System.out.println("The characters are :");
         for (char character: characters){
             System.out.print(character);
         }
        System.out.println();
         s.reverse();
        System.out.printf("Reversed: %s%n ",s.toString());
        System.out.println("==========Radix=============");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a radix: ");
        int radix = scanner.nextInt();
        System.out.printf("Please choose one:%n1 --- %s%n2 --- %s%n","convert digit to character","convert character to digit");
        int choice = scanner.nextInt();
         switch (choice){
             case 1:
                 System.out.println("Enter digit to convert to character: ");
                 int digit = scanner.nextInt();
                 System.out.printf("Converted digit to character is: %s%n",Character.forDigit(digit,radix));
                 break;
             case 2:
                 System.out.println("Enter character to convert to Digit: ");
                 char character = scanner.next().charAt(0);
                 System.out.printf("Converted character to digit is: %s%n",Character.digit(character,radix));
                 break;
             default:
                 break;

         }



    }
}
