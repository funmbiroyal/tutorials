package Chapter2;

import java.util.Scanner;
public class Add{
public static void main(String[] args){
  System.out.print("hello");  System.out.println(" there");
  int firstNumber;
  int secondNumber;
  int sum;
Scanner space = new Scanner(System.in);
System.out.print("Enter first integer ");
firstNumber= space.nextInt();

System.out.print("Enter second integer ");
secondNumber= space.nextInt();

sum= firstNumber + secondNumber;

System.out.printf("The sum is %d%n",sum);



}

}