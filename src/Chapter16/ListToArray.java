
package Chapter16;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {
        String [] colors = {"Black","Blue","Red"};
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList(colors));
        linkedList.addLast("Yellow");
        linkedList.add("Orange");
        linkedList.add(4,"purple");
        linkedList.addFirst("Cyan");

         colors = linkedList.toArray(new String[linkedList.size()]);

        System.out.println("Colors: ");
        for (String color : colors ){
          System.out.println(color);
      }
    }
}
