package Chapter14Test;

import org.junit.jupiter.api.Test;

public class StringsTest {
    @Test
    void reverseString() {
        String initial = "68573565 234";

        StringBuilder reversed = new StringBuilder(initial.substring(initial.length() - 3));
        reversed.append(")");
        reversed.insert(0, "(+");
        for (int i = initial.length() - 5; i >= 0; i--) {

            reversed.append(initial.charAt(i));
        }
        System.out.println(reversed);

    }
}