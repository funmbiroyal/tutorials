package Chapter7Test;

import Chapter7.CodeWarTask;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CodeWarTaskTest {
    CodeWarTask codeWar;
    @BeforeEach
    void startEachTestWith(){
         codeWar = new CodeWarTask();
    }
    @Test
    void codeWarTaskCreatedTest(){
        CodeWarTask codeWar = new CodeWarTask();
        assertNotNull(codeWar);

    }
    @Test
    void canFindIndicesOfTwoAddedNumberTest(){
        int [] array = {1,2,3,4,5};
        int value = 3;
        System.out.println(Arrays.toString(CodeWarTask.findIndicesOfTwoAddedNumber(array, value)));

    }
}
