package Chapter16;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingCollections {

    public static void sortInAscendingOrder(String [] suits) {
        List<String> list = Arrays.asList(suits);
        Collections.sort(list);
        System.out.println("Sorted Elements in ascending order: " + list);
    }
    public static void sortInDescendingOrder(String [] suits){
        List<String>list = Arrays.asList(suits);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("Sorted Elements in descending order: "+ list);
    }

    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        sortInAscendingOrder(suits);
        sortInDescendingOrder(suits);
    }
}
