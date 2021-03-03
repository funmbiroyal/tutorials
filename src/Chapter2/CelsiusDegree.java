import java.util.Scanner;
public class CelsiusDegree{

public static void main (String[]args){
   	Scanner input = new Scanner (System.in);
	System.out.println("Enter your number: ");

	double celsius = input.nextInt();

   double farenheit = ((9.0/5) * celsius) + 32;
   System.out.println(celsius + " degrees in farenheit is " + farenheit);
}








}