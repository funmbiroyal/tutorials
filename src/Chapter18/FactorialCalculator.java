package Chapter18;

import java.math.BigInteger;

public class FactorialCalculator {
    public static long factorial (long number){
        if (number <= 1)
            return  1;
        else
           return number * factorial(number-1);

    }

    public static BigInteger factorial(BigInteger number){
        if (number.compareTo(BigInteger.ONE)<= 0)
            return BigInteger.ONE;
        else
            return number.multiply(factorial(number.subtract(BigInteger.ONE)));
    }

    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            System.out.printf("%d! = %d" +
                    "",i, factorial(i) );
            System.out.println();
        }
        System.out.println();
        System.out.println("For Big integer.");

        for (int i = 1; i <= 50; i++){
            System.out.printf("%d! = %d",i,factorial(i));
            System.out.println();
        }

    }
}
