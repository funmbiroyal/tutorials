package Chapter5;

public class Factorial {
    public static void main(String[] args) {
        System.out.printf("%s%30s%n", "values", "factorials");
         long factorial = 1;
         int number = 20;
        for (int i = 2; i <=number ; i++) {
            factorial = factorial*i;
            System.out.printf("%d%30d%n",i,factorial);

        }





    }
}
