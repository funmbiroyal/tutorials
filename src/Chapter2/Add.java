import java.util.Scanner;
public class Add{
public static void main(String[] args){
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