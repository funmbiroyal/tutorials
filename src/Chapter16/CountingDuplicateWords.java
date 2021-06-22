package Chapter16;

import java.util.*;

public class CountingDuplicateWords {
    private static void createMap(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();


        String[] tokens = input.split(" ");

         for (String token : tokens)
             {
             String word = token.toLowerCase();
            String newWord = word.replaceAll("\\p{Punct}","");

            if (map.containsKey(newWord)) {
                int count = map.get(newWord);
                map.put(newWord, count + 1);

            }else
            map.put(newWord, 1);
        }
    }

    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet();
        TreeSet<String> sortedKeys = new TreeSet<>(keys);
        System.out.printf("%nMap contains:%nKey\t\t\t\tValue%n");

        for (String key : sortedKeys){
            System.out.printf("%-10s%10s%n", key, map.get(key));
        }
        System.out.printf("%nSize: %d%nisEmpty: %b%n",map.size(), map.isEmpty());
    }

    public static void main(String[] args) {
        Map<String, Integer> testMap = new HashMap<>();
        createMap(testMap);
        displayMap(testMap);
    }

}
