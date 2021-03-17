import java.util.Random;

public class Array {
    public static void main(String[] args) {
      int [] c = new int [5];
        System.out.printf("%s%8s%n", "Index", "Value");

        c [0] = 45;
        c [1] = 46;
        c [2] = 47;
        c [3] = 48;
        c [4] = 49;


        for (int counter = 1; counter <= c.length; counter++) {
            System.out.println(c[counter-1]);
        }
        int[] array = { 87, 68, 94, 83, 78, 85, 91, 76, 87 };
         int total = 0;

        for (int counter = 0; counter < array.length; counter++)
            total = total + array[counter];
        System.out.printf("Total of array elements: %d%n", total);
    }
//    int [] array = new int[6];
//    Random rand = new Random();
//
//        for (int i = 1; i <= 10 ; i++) {
//        ++array [1+ rand.nextInt(5)];
//        // System.out.println( array + " ");
//    }
//        System.out.printf("%s%10s%n", "number","value");
//        for (int number= 0; number < array.length ; number++) {
//
//        System.out.printf( "%4d%8d%n" ,number , array[number]);

    }

