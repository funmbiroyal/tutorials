package somWork.m2;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int number){
        while(number%2 == 0){
            number= number/2;
        }
        if (number == 1)
            return true;
        return false;
    }

    public static boolean isPowerOfTwo2(int number){
        return (number & number-1)==0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(128));
        System.out.println(isPowerOfTwo2(64));
    }
}
