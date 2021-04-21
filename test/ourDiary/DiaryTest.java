package ourDiary;

import org.junit.jupiter.api.Test;

public class DiaryTest {
    @Test
    void entryCanBeAdded(){
        Diary diary = new Diary();
        diary.addEntry();
    }
}
