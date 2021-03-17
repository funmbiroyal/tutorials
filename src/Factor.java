import java.util.Scanner;

public class Factor {

    public static void main(String[] args) {
        int userNumber;
        System.out.println("Enter your number:...");
        Scanner input = new Scanner(System.in);

        userNumber = input.nextInt();
        System.out.println("Enter your number:...");
        for (int i = 1; i <= userNumber; i++) {

            if (userNumber % i == 0) {
                System.out.print(  i + "\t");


            }

        }
    }
}