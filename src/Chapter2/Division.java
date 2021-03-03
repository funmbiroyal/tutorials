import java.util.Scanner;
public class Division{
public static void main(String[] args){
  int firstNumber;
  int secondNumber;
  int thirdNumber;
  int total;
Scanner space = new Scanner(System.in);
System.out.print("Enter first integer ");
firstNumber= space.nextInt();

System.out.print("Enter second integer ");
secondNumber= space.nextInt();

System.out.print("Enter second integer ");
thirdNumber= space.nextInt();

total = firstNumber / secondNumber / thirdNumber;

System.out.printf("The total is %d%n", total );



}

}