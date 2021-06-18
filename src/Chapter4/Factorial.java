package Chapter4;

public class Factorial {
    public static int findFactorialOfNumber(int number){
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
    public static double findMathConstant(int value){
        double e;
        double factorial = 1;
        if (value == 0){
            return  e = 1 + 1.0;
        }else if (value == 1){
            e = 1 + 1.0;
        }else {
            while (value >= 2){
                factorial += (1.0/findFactorialOfNumber(value));
                value--;

            }
        }
        return e = 1 + factorial;
    }

    public static void main(String[] args) {
        System.out.println(findFactorialOfNumber(5));
        System.out.println(findMathConstant(30));
    }
}
