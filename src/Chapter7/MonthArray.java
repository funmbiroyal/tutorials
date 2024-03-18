package Chapter7;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MonthArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] months = {"January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"};

        for (String month : months)
            System.out.println(month);

        System.out.println("Enter number of month from (1-12)");
        int number = scanner.nextInt();
        System.out.println("The month is " + months[number - 1]);
        System.out.println("---------------");
        int array[] = {2, 3, 6, 9, 1};
        int newArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        System.out.println(Arrays.toString(newArray));
        System.out.println("-------------------");

        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'r'};
        String[] stringArray = new String[4];
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[2] == 'c' && charArray[0] == 'a' && charArray[6] == 'r' && charArray[4] == 'd') {
                stringArray[i] += String.valueOf(charArray[i]);
            }

        }
        System.out.println(charArray);
        System.out.println(Arrays.toString(stringArray));
    }
}

