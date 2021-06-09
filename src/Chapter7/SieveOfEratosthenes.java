package Chapter7;

import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        boolean[] numbers = new boolean[10];
        Arrays.fill(numbers,true);
              findPrimeNumber(numbers);
        for(int i = 0; i < numbers.length; i ++){
            System.out.println(numbers[i] ? i : "Not prime");
        }

    }

    public static boolean[] findPrimeNumber(boolean [] numbers) {
        int multiple = 0;
        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i]) {
                for (int j = 2; j < numbers.length; j++) {
                    multiple = i * j;
                    if (multiple < numbers.length) {
                        numbers[multiple] = false;
                    } else
                        break;

                }
            }

        }


            return numbers;
        }


        //for (int i = 0; i < numbers.length; i++) {
        //            System.out.println(numbers[i] ? i : "Not prime");
        //

    }





