package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by lthys on 1/12/16.
 */
public class MoodSad extends CurrentMood {

    public MoodSad(Date date) {
        super(date);
        mood.add("sad");
        CurrentMood = "sad";
    }
}
