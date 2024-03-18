package ourDiary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryUserTest {
    User joy;
    Diary relationshipDiary;
    String entry;
    @BeforeEach
    void startEachTestWith(){
        relationshipDiary = new Diary();
        joy = new User("Joy",relationshipDiary,entry,0);
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
        assertEquals("I was heartbroken today!",joy.toString());
}
@Test
    void userCanGetNumberOfEntries(){
        joy.createEntry("I was heartbroken today!");
        joy.createEntry("Oh, it was an amazing business meeting today");
    assertEquals(2,joy.getTotalNumberOfEntries());

}
}
