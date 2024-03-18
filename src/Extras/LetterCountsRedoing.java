package Extras;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class LetterCountsRedoing {
    public static void createMap(Map<Character,Integer> map){
        String string = "HELLO WORLD";
       char [] letters = string.toCharArray();
       for (char letter : letters){
           if (map.containsKey(letter)){
              int count = map.get(letter);
              map.put(letter,count + 1);
           }else
               map.put(letter,1);
       }

    }
    public static void displayMap(Map<Character,Integer> map){
        Set<Character> keys = map.keySet();
        TreeSet<Character> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contains: %nKey       value%n");
        for (char key: sortedKeys){
            System.out.printf("%s%10s%n",key,map.get(key));
        }
        //System.out.printf("%nSize:%d%nisEmpty : ");
    }

    public static void main (String [] args){
    Map<Character,Integer>map = new HashMap<>();
      createMap(map);
      displayMap(map);

    }

}
