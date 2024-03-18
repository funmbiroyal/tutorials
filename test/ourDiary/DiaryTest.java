package ourDiary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiaryTest {
    @Test
    void entryCanBeAddedInDiary(){
        Diary diary = new Diary();
        diary.addEntry("""
                 is beautiful!
                """);
        diary.addEntry("""
                 Funmbi
                 has a Car!
                """);
        assertEquals(2,diary.getTotalNumberOfEntry());
    }

}
