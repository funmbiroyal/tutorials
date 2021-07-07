package Extras;

import javax.management.StringValueExp;
import java.util.Arrays;

import static java.lang.String.valueOf;

public class Intersection {
    private String[] arrayOfStrings;
    public static void main(String[] args) {

        String [] array = {"1, 3, 4, 7, 13","1, 2, 4, 13, 15"};

        String newString = "";
        String anotherString = "";
        newString = array[0];
        anotherString = array[1];

        String[] newStringSplit = newString.split(",");
        String[] anotherStringSplit = anotherString.split(",");

        for (int i = 0; i < newStringSplit.length; i++) {
            for (int j = 0; j < anotherStringSplit.length; j++) {
                if (newStringSplit[i].equals(anotherStringSplit[j])){
                    System.out.print(newStringSplit[i] + ",");
                }

            }

        }
    }

}

