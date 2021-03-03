import java.util.Scanner;
public class Cylinder{

  public static void main (String[] args){
   double area;
   double volume;
  Scanner input = new Scanner (System.in);

      System.out.println("Enter your radius: ");
 	double radius = input.nextDouble();	
          
     System.out.println("Enter your lenght: ");
	int lenght = input.nextInt();

	area = ((radius*radius) * 3.14159);

	    volume = area * lenght;


 System.out.println("The area of the cylinder is " + area);
 System.out.println("The volume of the cylinder is " + volume);




}

}