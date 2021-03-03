import java.util.Scanner;
public class Product{
public static void main(String[] args){
  int firstNumber;
  int secondNumber;
  int thirdNumber;
  int product;
Scanner space = new Scanner(System.in);
System.out.print("Enter first integer ");
firstNumber= space.nextInt();

System.out.print("Enter second integer ");
secondNumber= space.nextInt();

System.out.print("Enter second integer ");
thirdNumber= space.nextInt();

product = firstNumber * secondNumber * thirdNumber;

System.out.printf("The sum is %d%n", product );



}

}