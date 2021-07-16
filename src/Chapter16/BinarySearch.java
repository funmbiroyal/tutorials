package Chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void search(List<String> list, String key) {
        System.out.printf("%nSearching for: %s%n", key);
        int result = Collections.binarySearch(list, key);

        if (result >= 0) {
            System.out.printf("Found at index %d%n", result);
        } else {
            System.out.printf("Not Found (%d)%n", result);
        }
    }

    public static void main(String[] args) {
        String [] colors = {"red", "white", "blue", "black", "yellow", "purple", "tan", "pink"};
        List<String>myList = Arrays.asList(colors);
        Collections.sort(myList);
        System.out.println("The result of the binary search");
        search(myList,"teal");
        search(myList,"yellow");
        search(myList,"blue");
        search(myList,"red");
        search(myList,"white");
        search(myList,"gray");
        search(myList,"tan");
        search(myList,"pink");
        search(myList,"purple");
        search(myList,"black");
    }
}
