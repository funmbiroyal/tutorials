package Chapter6;

public class Conversion {
    public static int convertNumber(int number) {
       String hex =Integer.toHexString(number) ;
       String oct = Integer.toOctalString(number);
       String bin = Integer.toBinaryString(number);
        return number;
    }
//    public static int getConvertedNumber(){
//
//    }
}
