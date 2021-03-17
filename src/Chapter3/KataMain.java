package Chapter3;

public class KataMain {
    public static void main(String[] args) {
        Kata kata = new Kata();
        int[] array = {87, 68, 94, 100, 83};
        int total = 0 ;
        for (int counter = 0; counter < array.length; counter++)
            total += array[counter];
        System.out.printf("Total of array elements: %d%n", total);


    }
}
