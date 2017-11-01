package ca.ualberta.cs.lonelytweet;

import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}


	/**
	 *	changed so that it returns boolean rather than use a variable that returns
	 *  a boolean (control flow issue).
	 */
	@Override
	public boolean isValid() {
		return !(tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10);

	}

	@Override
	public String getTweetBody() {
        return tweetBody;
    }
}