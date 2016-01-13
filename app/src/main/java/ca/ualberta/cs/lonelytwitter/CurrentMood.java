package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by lthys on 1/12/16.
 */
public abstract class CurrentMood {
    protected Date date;
    protected String CurrentMood;
    protected ArrayList <String> mood;

    public CurrentMood(Date date) {
        this.date = date;
        this.mood = new ArrayList<String>();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMood() {
        return CurrentMood;
    }

    public ArrayList<String> getList(){
        return mood;
    }


}