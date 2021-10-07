package articles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringsEqualityTest {
    @Test
    void stringArrayEqualsTest(){
        StringsEquality stringsArray = new StringsEquality();
        String [] array1 = {"Good","Jane","John" };
        String [] array2 = {"Good","Jane","John" };

        assertTrue( stringsArray.checkEquality(array1,array2));
    }
}
