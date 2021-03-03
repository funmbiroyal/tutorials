import java.util.Scanner;
public class Multiple{
public static void main(String[] args) {

         Scanner input = new Scanner(System.in); 

         System.out.printf("Enter first integer: "); 
         int number1 = input.nextInt(); 

         System.out.printf("Enter second integer: "); 
         int number2 = input.nextInt(); 
         
             if (number1 % number2 == 0) {
                 System.out.print("true"); 
}
             if (number1 % number2 != 0) {
                 System.out.print("false"); 
         }

     } 
}
