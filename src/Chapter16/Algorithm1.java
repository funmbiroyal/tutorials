package Chapter16;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithm1 {
    public static void output(List<Character>characters){

        for (Character character: characters){
            System.out.println(character);
        }
            System.out.printf("%nThe Maximum is: %s", Collections.max(characters));
            System.out.printf("%nThe Minimum is: %s",Collections.min(characters));

    }

    public static void main(String[] args) {
        Character[]letters = {'P','C','M'};
        List<Character>myLetters = Arrays.asList(letters);
        System.out.printf("%nList Contains:%n");
        output(myLetters);

        System.out.printf("%nReversed List:%n");
        Collections.reverse(myLetters);
        output(myLetters);

        Character[]letterCopy = new Character[3];
        List<Character>newLetterCopy = Arrays.asList(letterCopy);
        Collections.copy(newLetterCopy,myLetters);
        System.out.printf("%nAfter copying, new copy list contains:%n");
        output(newLetterCopy);

        Collections.fill(myLetters,'G');
        System.out.printf("%nAfter calling fill, list contains:%n");
        output(myLetters);
    }
}
