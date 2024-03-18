package Chapter16;

import java.util.*;

public class ColorsWithLinkedList {
    public static void convertToUpperCase(List<String>list){
       ListIterator<String> listIterator = list.listIterator();
       while (listIterator.hasNext()){
           String color = listIterator.next();
           listIterator.set(color.toUpperCase());
       }
    }

    public static void printList(List<String>list){
        System.out.printf("%nList:%n ");
        for(String color : list){
            System.out.print(color + " ");
        }
    }

    public static void removeItem(List<String> list, int start, int end){
        list.subList(start,end).clear();
    }

    public static void printReversedList(List<String>list) {
        ListIterator<String> listIterator = list.listIterator(list.size());
        System.out.printf("%n Reversed list:%n");
        while (listIterator.hasPrevious()) {
            System.out.printf("%s  ", listIterator.previous());
        }
    }

    public static void main(String[] args) {
        String [] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
        List<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(colors)) ;

        String [] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
        List<String>list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(colors2));

        list1.addAll(list2);
        printList(list1);

        convertToUpperCase(list1);
        printList(list1);

        removeItem(list1,5,10);
        printList(list1);
        printReversedList(list1);

    }
   }
