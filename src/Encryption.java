import java.util.Scanner;

public class Encryption {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
      Encryption.getNumber();
      int number = getNumber();
        System.out.println(encryptNumber(number));
    }
public static int getNumber(){
        System.out.println("Enter a four  digit number : ");
    int number = scanner.nextInt();
    return number;
}
public static int encryptNumber(int number){
        int userInput = number;
        int digit1 = (userInput + 7) % 10;
         userInput= userInput/ 10;

}
}



