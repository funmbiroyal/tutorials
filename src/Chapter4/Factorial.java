package Chapter4;

public class Factorial {
    public static int factorialOfNumber(int number){
        int factorial = 1;
        if (number == 0){
            return 1;
        }
        else if (number == 1){
            return 1;
        }else {
           while (number >=2 ){
                factorial  *= number;
                number--;
           }


        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(factorialOfNumber(5));
    }
}
