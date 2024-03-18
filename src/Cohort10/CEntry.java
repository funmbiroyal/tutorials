package Cohort10;

import java.time.LocalDateTime;

public class CEntry {
    private static int defaultId = 0;
    private int entryId;
    private String title;
    private String body;
    private LocalDateTime localDateTime;

    public CEntry(String entryBody) {
        body = entryBody;
        localDateTime = LocalDateTime.now();
        entryId =++defaultId;

    }

    public CEntry() {
    }

    public int getEntryId() {
        return entryId;
    }

    public void setEntryId(int entryId) {
        this.entryId = entryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}