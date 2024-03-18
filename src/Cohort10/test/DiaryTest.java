package Cohort10.test;

import Cohort10.CDiary;
import Cohort10.CEntry;
import Cohort10.DiaryService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ourDiary.Diary;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {
    DiaryService diaryService;
    CDiary diary;
    CEntry entry;

@BeforeEach
    void startAllTestWith(){
    diary = new CDiary();
    entry = new CEntry("My Story");
    diaryService = new DiaryService();
}
    @Test
    void diaryCanBeCreated(){
    assertNotNull(diary);
    }
   @Test
    void canAddEntryToDiary(){
    diaryService.writeEntry("My Birthday is approaching");
    diaryService.addEntryToDiary("name");
    assertEquals(1,entry.getEntryId());

    diary.setId(1);
    assertEquals(1,diary.getId());
    assertEquals(1,diaryService.getNumberOfEntries());
}
}
