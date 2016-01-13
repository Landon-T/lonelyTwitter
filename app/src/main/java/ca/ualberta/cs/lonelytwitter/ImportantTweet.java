package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by lthys on 1/12/16.
 */
public class ImportantTweet extends tweet {
    public ImportantTweet(String message, Date date) {
        super(message, date);
        //requires proteced not private
        //this.isImportant = True;
       // this.setIsImportant(Boolean.TRUE);
    }

    public ImportantTweet(String message) {
        super(message);
        //this.setIsImportant(Boolean.TRUE);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }

    public Date getDate(){
        return this.date;
    }

    public String getMessage(){
        return "!!important!!"+this.message;
    }
}
