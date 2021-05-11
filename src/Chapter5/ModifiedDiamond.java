package Chapter5;

import java.util.Scanner;

public class ModifiedDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int spaces = 20, star = 1;
        if(number>=1 && number <=19&& number%2 == 1){

            int half = number / 2 + 1;
            for (int i = 1; i <= number; i++) {
                for (int s = spaces; s > 0; s--) {
                    System.out.print(" ");
                }
                for (int j = star; j > 0; j--) {
                    System.out.print("* ");
                }
                if (i < half) {
                    System.out.println();
                    star += 2;
                    spaces -= 2;
                }
                else if(i >=half){
                    System.out.println();
                    star-=2;
                    spaces+=2;
                }


            }
        }
        else
            System.out.println("Enter odd  number between 1 and 19!");
    }
}
