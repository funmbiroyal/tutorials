package Cohort10;

import ourDiary.Entry;

import java.util.ArrayList;
import java.util.List;

public class CDiary {
    private String username;
    private int id;
    private String password;
    private String title;
    private List<String> entries = new ArrayList<>();

//    public CDiary(List<CEntry>entries){
//        this.entries = entries;
//    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getEntries() {
        return entries;
    }

    public void setEntries(List<String> entries) {
        this.entries = entries;
    }
}
