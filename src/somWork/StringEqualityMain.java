package somWork;

import java.lang.reflect.Array;
import java.util.Arrays;

//fixme
public class StringEqualityMain {
    public static void main(String[] args) {
        StringsEquality equality = new StringsEquality();
        String [] array1 = {"Ade","Boy","Cold" };
        String [] array2 = {"Ade","Boy","Cold" };
        boolean isEqual = equality.checkEquality(array1,array2);
        System.out.println(isEqual);

    }
}
