import org.junit.jupiter.api.Test;

public class CodeWar {
    public static void function(int [] numbers, int value){

        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (value == numbers[i] + numbers[j]){
                    System.out.print(i + " ");
                    break;
                }
            }

        }
    }

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        int value = 3;
        function(array,value);
    }

//
    }
}
