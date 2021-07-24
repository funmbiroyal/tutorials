package Chapter17;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntegerStreamOperations {
    public static void main(String[] args) {
        Integer [] values = {2, 9, 5, 0, 3, 7, 1, 4, 8, 6};
       System.out.printf("Original values: %s%n", Arrays.asList(values));
        System.out.printf("%nSorted values: %s%n",
                Arrays.stream(values)
                .sorted()
                .collect(Collectors.toList())
        );
        System.out.println();

        List<Integer>greaterThan4 = Arrays.stream(values).filter(value ->value > 4).sorted().collect(Collectors.toList());
        System.out.printf("%nValues greater than 4 are: %s%n ",greaterThan4);

    }
}
