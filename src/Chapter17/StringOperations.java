package Chapter17;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringOperations {
    public static void main(String[] args) {
        String [] strings = {"Red", "orange", "Yellow", "green", "Blue", "indigo", "Violet"};
        System.out.printf("Original strings:%s%n",Arrays.asList(strings));
        System.out.printf("%nStrings in uppercase: %s%n",Arrays.stream(strings)
                .map(String::toUpperCase)
                .collect(Collectors.toList()));

        System.out.printf("Strings greater than n sorted in ascending order: %s%n",
                Arrays.stream(strings)
                .filter(s -> s.compareToIgnoreCase("n") > 0)
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.toList()));

        System.out.printf("Strings less than n sorted in descending order: %s%n",
                Arrays.stream(strings)
                .filter(s -> s.compareToIgnoreCase("n") > 0)
                .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                .collect(Collectors.toList())


                );
   }
}