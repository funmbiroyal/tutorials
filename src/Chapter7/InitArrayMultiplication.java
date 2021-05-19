package Chapter7;

public class InitArrayMultiplication {
    public static void main(String[] args) {
        final int array_length = 10;
        int [] array = new int[array_length];
        for (int counter = 0; counter < array.length; counter++)

            array[counter] = 2+2*counter;
            System.out.printf("%s%8s%n","Value","index");


            for (int i = 0; i < array.length; i++)
            System.out.printf("%d%8d%n", i,array[i]);



    }
}
