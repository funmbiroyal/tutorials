package Chapter7;

import java.util.Arrays;

public class PrimeArray {
    public static void main(String[] args) {
        boolean [] numbers = new boolean[10];
        Arrays.fill(numbers,true);
        for(int i = 2; i < numbers.length;i++){
            if (numbers[i]){
                for(int j = 2; j < numbers.length;j++){
                    int multiple = i * j;
                    if (multiple< numbers.length){
                        numbers[multiple] = false;
                    }else
                        break;
                }

            }
            for (int j = 0; j < numbers.length; j++) {
                System.out.println(numbers[i] ? i : "Not prime");
            }
        }

    }
}