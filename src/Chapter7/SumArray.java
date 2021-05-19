package Chapter7;

public class SumArray {
    public static void main(String[] args) {
        int array [] = {45,34,66,10,100};
        int total = 0;
        for (int counter = 0; counter < array.length ; counter++) {
            total += array[counter];

        }
        System.out.printf("sum of array in the element: %d%n ",total);
    }
}
