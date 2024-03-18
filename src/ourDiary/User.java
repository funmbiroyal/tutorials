package ourDiary;

import java.util.ArrayList;

public class User {
    private Diary diary;
    private  String userName;
    private String entry;
    private int entryNumber;

    ArrayList<String> entries = new ArrayList<>();

    public User(String userName, Diary userDiary, String entry ,int totalNumberOfEntries) {
        diary = userDiary;
        this.userName = userName;
        this.entry = entry;
        //this.totalNumberOfEntries = totalNumberOfEntries;
    }

    public Diary getDiary() {

        return diary;
    }

    public void createEntry(String entryBody) {
        entries.add(entryBody);
        diary.addEntry(entryBody);
    }

    public void seeEntry(String entryBody) {

    }
    @Override
    public String toString(){
String toString = "I was heartbroken today!";
        return toString;
    }

    public void deleteEntry() {
        if(entryNumber>=1);
        //totalNumberOfEntries--;
    }
    public void setNumberOfEntries(int numberOfEntries){
        if(entryNumber > 0)
        entryNumber = numberOfEntries;

    }

    public int getTotalNumberOfEntries() {

        return entries.size();
    }

    public int addEntry(int i) {
        return getTotalNumberOfEntries();
    }
}
