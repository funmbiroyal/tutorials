package Chapter16;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

public class Linklist {
    public static void convertToUpperCase(List<String>list){
        ListIterator<String> iterator = list.listIterator();

        while (iterator.hasNext()){
            String color = iterator.next();
            iterator.set(color.toUpperCase());
        }
    }
    public static void printList(List<String>list){
        System.out.printf("%nList%n: ");
        for(String color : list){

        }

    }
}
