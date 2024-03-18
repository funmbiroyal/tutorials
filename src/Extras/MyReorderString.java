package Extras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyReorderString {

    private static String reorder(String sentence) {
       String [] tokens = sentence.split("\\s+");
       String [] newArray = new String [tokens.length];

       for (String token : tokens) {
           for (int i = 0; i < token.length(); i++) {
               if (Character.isDigit(token.charAt(i))) {
                   int digit = Integer.parseInt(String.valueOf(token.charAt(i)));
                   newArray[digit -1] = token;
                   break;
               }
           }
       }
           StringBuilder sb = new StringBuilder();
       for (String word: newArray){
           sb.append(word).append(" ");
       }
       return sb.toString().trim();
    }




    @Test
    void reorderString() {
    String input = "girl5  beautiful4 This1 is2 a3 ";
   assertEquals("This1 is2 a3 beautiful4 girl5",MyReorderString.reorder(input));
    }


}