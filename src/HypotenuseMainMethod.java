import java.util.Scanner;

public class HypotenuseMainMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter your value for side 1: ");
        double side1 = scanner.nextDouble();
        System.out.println("Enter your value for side 2: ");
        double side2 = scanner.nextDouble();
        double hypotenuse = Math.sqrt(Math.pow(side1,2)+Math.pow(side2,2));
        System.out.println("The hypotenuse is " + hypotenuse );
    }
}
