import java.util.Scanner;

public class RootOfQuadraticEquation{
	public static void main(String[] args){
	double firstRoot = 0 , secondRoot = 0;
	double a;
	double b;
	double c; 
	Scanner space = new Scanner (System.in);
	System.out.println("Enter your first integer...");
	 a = space.nextInt();

	System.out.println("Enter your second integer...");
	 b = space.nextInt();

	System.out.println("Enter your third integer...");
	 c = space.nextInt();

	firstRoot = -b + Math.sqrt(Math.pow(b,2)) - (4 * a * c) / (2 * a);
	System.out.printf("the answer of first root: " + firstRoot +"\n");

	
	secondRoot = -b - Math.sqrt(Math.pow(b,2)) - (4 * a * c) / (2 * a);
	System.out.printf("the answer of second root: " + secondRoot +"\n");



	




}



}









