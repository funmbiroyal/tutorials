package articles;

import java.util.Arrays;
import java.util.Objects;

public class StringsEquality {

    public boolean checkEquality(String[] array1, String[] array2) {
        if (Arrays.equals(array1, array2)){
            return true;
        }
        if (array1 == null || array2==null){
            return false;
        }
        if (array1.length != array2.length){
            return false;
        }
        for (int i = 0; i < array1.length ; i++) {
            if (!array1[i].equals(array1[i])){
                return false;
            }
        }
        return true;
    }
}
