package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by lthys on 1/26/16.
 */
public class Tweetlist {
    private ArrayList<tweet> tweets = new ArrayList<tweet>();


    public boolean hasTweet(tweet twe){

        return tweets.contains(twe);
    }

    public void addTweet(tweet twe){
        //check for dup tweet
        if (tweets.contains(twe)){
            throw new IllegalArgumentException();
        }
        else {
            tweets.add(twe);
        }
    }

    public tweet getTweet(int index){
        return tweets.get(index);
    }

    public void removeTweet(tweet twe){
        tweets.remove(twe);
    }

    //returns a Count of tweets
    public int getCount(){

        return tweets.size();
    }

    public ArrayList<tweet> getTweets() {
        ArrayList<tweet> tweetSorted = new ArrayList<tweet>();
        int min = 0;
        for(int i = 0; i < tweets.size(); i++){
            for(int i2 =0; i2 < tweets.size();i2++) {
                if ((tweets.get(i).getDate().compareTo(tweets.get(i2).getDate())) > 0 )
                    min = i2;
            }
            tweetSorted.add(tweets.get(min));
            tweets.remove(min);

        }
        return tweetSorted;

    }


}
