import java.util.Scanner;

public class SeparatingIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; ) {
            System.out.println("Enter your digit: ");
            int userInput = scanner.nextInt();
            System.out.println("Separated digits");
            int result = userInput / 10;

            System.out.print(result + "  ");
            result = userInput % 10;
            System.out.println(result);
            i++;
        }

    }
}




