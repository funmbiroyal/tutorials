package Chapter16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets {
    public static  void printNoDuplicate(List<String>values){
        Set<String>set = new HashSet<>(values);
        System.out.printf("%nNon duplicates are: ");
        for (String value: set ){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String [] colors = {"red", "white", "blue", "green", "gray",
                "orange", "tan", "white", "cyan", "peach", "gray", "orange"};
        List<String> myList = Arrays.asList(colors);
        System.out.printf("List: %s%n", myList);
        printNoDuplicate(myList);
    }
}
