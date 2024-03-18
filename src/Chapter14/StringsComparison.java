package Chapter14;

import java.util.Locale;
import java.util.Scanner;

public class StringsComparison {
    public static String compareStrings(String userInput1, String userInput2) {

        if (userInput2.compareTo(userInput1) > 0)
            return userInput2 + " is " + "greater";
        else if (userInput1.compareTo(userInput2) < 0)
            return userInput1 + " is " + "lesser";

        else
            return userInput1 + " and " + userInput2 + " are both equal! ";
//        System.out.println(userInput1.compareTo(userInput2));
//        System.out.println(userInput2.compareTo(userInput1));

    }

    public static void main(String[] args) {
        System.out.println(compareStrings("beautiful","vegetarian"));
    }
}

