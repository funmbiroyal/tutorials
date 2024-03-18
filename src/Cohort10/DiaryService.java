package Cohort10;

import java.util.ArrayList;
import java.util.List;

public class DiaryService {
    private CDiary diary;
    private List<CEntry>entries;

    public String writeEntry(String entry) {
        entries = new ArrayList<>();
        CEntry entryBody = new CEntry(entry);
         entries.add(entryBody);
         return "Entry added Successfully";

    }

    public int getNumberOfEntries() {
        return entries.size();
    }

    public int addEntryToDiary(String entry) {
        CDiary diary = new CDiary();
        String entryBody = writeEntry(entry);

        return 0;
    }
}