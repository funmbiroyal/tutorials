package Extras;

import java.util.Arrays;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        boolean [] values = new boolean[10];
        Arrays.fill(values,true);
        for(int i = 2; i < values.length;i++){
            if (values[i]){
                for (int j = 2; j < values.length; j++) {
                    int multiple = i * j;
                    if (multiple < values.length){
                        values[multiple] = false;
                    }else {
                        break;
                    }

               }
            }
        }
        for (int k = 0; k < values.length ; k++) {
            System.out.println(values[k] ? k : "Not prime");
        }
    }

}
