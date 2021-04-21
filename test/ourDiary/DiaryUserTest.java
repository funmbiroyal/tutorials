package ourDiary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryUserTest {
    User joy;
    Diary relationshipDiary;
    @BeforeEach
    void startEachTestWith(){
        relationshipDiary = new Diary();
        joy = new User("Joy",relationshipDiary);
    }
    @Test
    void userHasADiary(){
        //when
        //User joy = new User("Joy",relationshipDiary);
        assertNotNull(joy.getDiary());
    }
@Test
    void userCanWriteOnDiary(){
        joy.createEntry("I was heartbroken today!");

}

}
