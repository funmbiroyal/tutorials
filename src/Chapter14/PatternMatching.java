package Chapter14;

import java.util.regex.Pattern;

public class PatternMatching {
    public static void main(String[] args) {

        String text    =
                "is the text to be searched " +
                        "for occurrences of the pattern.";

        String pattern = ".*is.*";

        boolean matches = Pattern.matches(pattern,text);

        System.out.println("matches = " + matches);
    }
}
