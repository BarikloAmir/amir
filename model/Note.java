package ceit.aut.ac.ir.model;

import java.io.Serializable;

// TODO: Phase2: uncomment this code
public class Note implements Serializable {

    private String title;
    private String content;
    private String date;

    public Note(String title, String content, String date) {
        this.title = title;
        this.content = content;
        this.date = date;
    }

    @Override
    public String toString() {
        return
                title + '\n'
                + content + '\n'+
                        date +"\n";
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date;
    }

    public String getTitle() {
        return title;
    }
}

