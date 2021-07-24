package Chapter17;

import java.util.stream.IntStream;

public class IntStreamOperation {
    public static void main(String[] args) {
        int [] values = {3, 10, 6, 1, 4, 8, 2, 5, 9, 7};
        System.out.println("Original values:");
        IntStream.of(values)
                .forEach(value -> System.out.printf("%d ",value));
        System.out.println();

        System.out.printf("%nCount: %d%n",
                IntStream.of(values).count());

        System.out.printf("%nMinimum: %d%n",
                IntStream.of(values).min().getAsInt());

        System.out.printf("%nMaximum: %d%n",
                IntStream.of(values).max().getAsInt());

        System.out.printf("%nAverage: %.2f%n",
                IntStream.of(values).average().getAsDouble());

        System.out.printf("%nSum via reduce method: %d%n",
                IntStream.of(values).reduce(0,(x,y)-> x + y));

        System.out.printf("%nSum of squares via reduce method: %d%n",
              IntStream.of(values).reduce(0,(x,y)-> x + y*y));

        System.out.printf("%nProduct via reduce method: %d%n",
                IntStream.of(values).reduce(1,(x,y)-> x * y));

        System.out.printf("%nEven values displayed in sorted order: " );
                IntStream.of(values)
                .filter(value -> value%2 == 0)
                        .sorted()
                        .forEach(value -> System.out.printf("%d ",value));
        System.out.println();
        System.out.printf("%nOdd values displayed in sorted order: ");
        IntStream.of(values)
                .filter(value -> value%2 == 1)
                .map(value -> value * 2)
                .sorted()
                .forEach(value -> System.out.printf("%d ",value));
      System.out.println();

        System.out.printf("%nSum of integers from 1 - 9: %d%n",
                IntStream.range(1,10).sum());
        System.out.printf("%nSum of integers from 1 -10: %d%n",
                IntStream.rangeClosed(1,10).sum());

    }
}
