package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by lthys on 1/12/16.
 */
public abstract class tweet {
    protected Date date;
    protected String message;
    //protected Boolean isImportant;

    public abstract Boolean isImportant();

    public tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetToLong{
        if (message.length() > 140){
            throw new TweetToLong();
        }

        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return date.toString() + " | " + message;

    }




}
