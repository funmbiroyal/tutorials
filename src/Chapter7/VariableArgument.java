package Chapter7;

public class VariableArgument {
    public static int calculateProduct(int ... args) {
        int product = 1;
        for(int value : args){
            product *= value;
        }
        return product;
    }
    public static int calculateSum(int ... args) {
        int sum = 0;
       for(int value : args){
           sum += value;
       }
       return sum;
    }

    public static void main(String[] args) {
        System.out.println("variable argument list with 3 values, product is " + calculateProduct(10,2,10));
        System.out.println("variable argument list with 4 values, product is " + calculateProduct(10,10,10,2));
        System.out.println("variable argument list with 10 values, product is " + calculateProduct(2,3,4,5,6,4,10,10,10,2));
        System.out.println("variable argument list with 7 values, sum is " + calculateSum(34,5,6,7,8,90,37));
    }


}
