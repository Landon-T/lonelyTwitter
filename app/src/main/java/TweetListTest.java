import android.test.ActivityInstrumentationTestCase2;

import java.util.ArrayList;

import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.Tweetlist;
import ca.ualberta.cs.lonelytwitter.normalTweet;
import ca.ualberta.cs.lonelytwitter.tweet;

/**
 * Created by lthys on 1/26/16.
 */
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest() {
        super(LonelyTwitterActivity.class);

    }

    //methods must start with test
    public void testAddTweet() {
        Tweetlist tweets = new Tweetlist();
        tweet twe = new normalTweet("test tweet");
        tweet twe2 = new normalTweet("test2");
        tweets.addTweet(twe);
        assertTrue(tweets.hasTweet(twe));
        try{
            tweets.addTweet(twe);
            assertTrue(Boolean.FALSE);
        }
        catch(IllegalArgumentException x){

        }


    }


    public void testHasTweet() {
        Tweetlist tweets = new Tweetlist();
        tweet twe = new normalTweet("hello");

        assertFalse(tweets.hasTweet(twe));

        tweets.addTweet(twe);


        assertTrue(tweets.hasTweet(twe));


    }

    public void testDeleteTweet(){
        Tweetlist tweets = new Tweetlist();
        tweet twe = new normalTweet("test hello");

        tweets.addTweet(twe);
        tweets.removeTweet(twe);

        assertFalse(tweets.hasTweet(twe));
    }
    public void testGetTweet(){
        Tweetlist tweets = new Tweetlist();
        tweet twe = new normalTweet("test hello");

        tweets.addTweet(twe);
        tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(),twe.getMessage());
        assertEquals(returnedTweet.getDate(),twe.getDate());

    }

    public void testTweetCount(){
        Tweetlist tweets = new Tweetlist();
        tweet twe = new normalTweet("test hello");
        tweets.addTweet(twe);
        assertEquals(tweets.getCount(),1);
        tweet twe2 = new normalTweet("test2");
        tweets.addTweet(twe2);
        assertEquals(tweets.getCount(),2);


    }

    public void testGetTweets(){
        Tweetlist tweets = new Tweetlist();
        ArrayList<tweet> sorted = new ArrayList<tweet>();
        tweet twe = new normalTweet("test hello");
        tweet twe2 = new normalTweet("test2 hello");

        tweets.addTweet(twe);
        tweets.addTweet(twe2);
        sorted = tweets.getTweets();

        assertTrue(   (sorted.get(0).getDate().compareTo(sorted.get(1).getDate())) < 0);



    }
}
