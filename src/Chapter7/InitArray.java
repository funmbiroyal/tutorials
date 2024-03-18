package Chapter7;

import java.util.Arrays;

public class InitArray {
    public static int [] reverse(int [] list) {
        int [] result  = new int[list.length];
        for (int i = 0; i < list.length-1;i++){
            for (int j = result.length-1; j > 0; j--) {

                result[j]  = list[i];
            }
        }
        return result;
        }

    public static void main(String[] args) {
        System.out.printf("%s%10s%n","index", "value");
        int array []= {23,34,56,78,99,90,87,65,43,22};
        for (int i = 0; i < array.length ; i++) {
            System.out.printf("%3d%9d%n",i, array[i]);

        }
        int [] myArray = {2,4,6,8,0,6};
        System.out.println(Arrays.toString(reverse(myArray)));
        }
    }

