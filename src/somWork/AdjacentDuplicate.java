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

    public static void main(String[] args) {
        AdjacentDuplicate adj = new AdjacentDuplicate();
        String string = "aabaarbarccrabmq";
        System.out.println(adj.removeDuplicates(string));
    }
}


