package Chapter16;

import java.util.ArrayList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Collections {
    public static void removeColors(Collection<String>list1, Collection<String>list2){
       Iterator<String> iterator = list1.iterator();
       if (iterator.hasNext()){
           do {
               if (list2.contains(iterator.next())){
                   iterator.remove();
               }
           }while (iterator.hasNext());
       }


    }

    public static void main(String[] args) {
        String[] colors = {"Green", "White", "Blue", "Black", "Red", "Yellow"};
        List<String> list = new ArrayList<>();

        for (String color : colors) {
            list.add(color);
        }

        String[]removeColors = {"Black","Red","Yellow"};
        List<String> colorsToRemove = new ArrayList<>();

        for (String color : removeColors)
            colorsToRemove.add(color);

            System.out.println("Colors in list: ");
            for (String s : list)
                System.out.printf("%s ", s);

            removeColors(list,colorsToRemove);
             System.out.printf("%n%nColors in the list after removing some:%n");
            for (String s : list)
                System.out.printf("%s ",s);


    }
}
