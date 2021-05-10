package Chapter5;

import java.util.Scanner;

public class Barchart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int number = 0;
        int asterisk = 0;
        int a = 0, b = 0, c = 0, d = 0, e = 0;

        while (counter < 6) {
            System.out.println("Enter number");
            number = scanner.nextInt();
            if (counter == 1 && number >= 1 && number <= 30) {
                a = number;
                counter++;
            } else if (counter == 2 && number > 1 && number <= 30) {
                b = number;
                counter++;

            } else if (counter == 3 && number > 1 && number <= 30) {
                c = number;
                counter++;

            } else if (counter == 4 && number> 1 && number <= 30) {
                d = number;
                counter++;

            } else if (counter == 5 && number> 1 && number <= 30) {
                e = number;
                counter++;
            } else {
                System.out.println("invalid input, enter a valid number");
            }

        }
        for(int i = 0; i<5;i++){
            if(i== 0){
                asterisk= a;
            }
           else if(i== 1){
                asterisk=b;
            }
           else if(i==2){
               asterisk=c;
            }
           else if(i==3){
               asterisk =d;
            }
           else if(i==4){
               asterisk = e;
            }
            for (int t = asterisk; t >0 ; t--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}