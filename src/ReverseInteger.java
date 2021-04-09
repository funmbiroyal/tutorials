import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your digit: ");
        int userInput = scanner.nextInt();
        while(userInput > 0){
            System.out.println(userInput%10);
            userInput = userInput/10;
            //System.out.println(userInput + " ");
        }

    }
}