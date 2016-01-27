package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by lthys on 1/12/16.
 */
public class normalTweet extends tweet implements Tweetable {
    public normalTweet(String message, Date date) {
        super(message, date);
    }

    public normalTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }

    public Date getDate(){
        return this.date;
    }

    public String getMessage(){
        return this.message;
    }


}
