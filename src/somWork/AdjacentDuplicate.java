package somWork;

import javax.imageio.stream.ImageInputStream;
import java.util.Stack;

public class AdjacentDuplicate {
    public String removeDuplicates(String string) {
        if(string == null){
            return null;
        }
    char [] chars = string.toCharArray();
        char previous = ' ';
        int i = 0;
    for (char c : chars) {
            if (c != previous){
               chars[i++] = c;
               previous = c;
            }
     }
return new String(chars).substring(0,i);
    }
    public String removeDuplicates(String word, int number) {
        for (int i = 1, count = 1; i < word.length(); i++) {
            count = word.charAt(i) == word.charAt(i-1) ? count + 1 : 1;
            if (count == number)
                word = removeDuplicates(word.substring(0, i-number+1) + word.substring(i+1), number);
        }
        return word;
    }

    public static void main(String[] args) {
        AdjacentDuplicate adj = new AdjacentDuplicate();
        String string = "aabaarbarccrabmq";
        System.out.println(adj.removeDuplicates(string));
        System.out.println(adj.removeDuplicates("aaabddda",3));

    }
}


