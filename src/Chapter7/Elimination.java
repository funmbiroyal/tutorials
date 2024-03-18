package Chapter7;

import java.util.Scanner;

public class Elimination {
    public static void main(String[] args) {
        Scanner  ini = new Scanner(System.in);
        int[] array = new int[5];

        for (int i = 0; i < array.length ; i++) {
            System.out.println("Enter a number: ");
            int userInput = ini.nextInt();
            if(i == 0){
                array[i] = userInput;
            }else {
                if(array[i - 1 ] != userInput && array[i] == 0){
                    array[i] = userInput;

                }
            }
        }

        for (int element:array) {
            System.out.print(element + " ");

        }


    }

}


