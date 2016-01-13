package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by lthys on 1/12/16.
 */
public class MoodHappy extends CurrentMood{
    public MoodHappy(Date date){
        super(date);
        mood.add("happy");
        CurrentMood = "happy";
    }




}
