package Chapter17;

import java.security.SecureRandom;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RandomIntStreams {
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        System.out.printf("%s%10s%n","face","frequency");
        secureRandom.ints(50,1,7)
                .boxed()
                .collect(Collectors.groupingBy
                        (Function.identity(),Collectors.counting()))
                .forEach((face,frequency)-> System.out.printf("%-6d%d%n",face,frequency));
    }
}
