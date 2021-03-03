//package Chapter4;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double pi = 3.14159;
        int radius;
        System.out.println("Enter the radius of a circle: ");
        radius = input.nextInt();
double diameter = (2*radius);
 System.out.println("The diameter of a circle is: " + diameter);

double circumference =(2*pi*radius);
System.out.println("The circumference of a circle is: " + circumference);

double area = (pi * (radius * radius ));
System.out.println("The area of the circle is :"+ area );

    }
}
