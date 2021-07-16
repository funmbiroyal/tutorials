package Chapter16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithm2 {
    public static void main(String[] args) {
        String[] colors = {"red", "white", "yellow", "blue"};
        List<String> list1 = Arrays.asList(colors);
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("green");
        list2.add("violet");
        list2.add("purple");
        System.out.print("Before addAll, list2 contains: ");
        for (String s : list2){
            System.out.print(s + " ");
        }
        Collections.addAll(list2,colors);
        System.out.printf("%nAfter addAll, list2 contains: ");

        for (String s : list2){
            System.out.print(s + " ");
        }
       int frequency = Collections.frequency(list2,"violet");
        System.out.printf(
                "%nFrequency of violet list2: %d%n", frequency);
       boolean disjoint = Collections.disjoint(list1,list2);
        System.out.printf("list1 and list2 %s elements in common%n",(disjoint ? "do not have":"have"));
    }
}
