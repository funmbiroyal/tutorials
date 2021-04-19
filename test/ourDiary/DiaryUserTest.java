package ourDiary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {
    @Test
    void userHasADiary(){
        //given
        Diary relationshipDiary = new Diary();
        //when
        User joy = new User("Joy",relationshipDiary);
        assertNotNull(joy.getDiary());
    }


}
