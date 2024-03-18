package ourDiary;


import java.time.LocalDateTime;

public class Entry {
    private  final LocalDateTime entryDateTime;
    private  String entryBody;
    private static int lastEntryId;
    private int entryId;

    public  Entry(String entryBody){
        this.entryBody = entryBody;
        entryDateTime=LocalDateTime.now();
        entryId = ++lastEntryId;
    }


}
