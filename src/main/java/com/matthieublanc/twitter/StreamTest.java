package com.matthieublanc.twitter;

import twitter4j.*;
import twitter4j.conf.ConfigurationBuilder;

import java.io.IOException;

public class StreamTest {

	public static void main(String[] args) throws TwitterException, IOException {
		StatusListener listener = new TweetStatusListener();
		TwitterStream twitterStream = new TwitterStreamFactory(new ConfigurationBuilder().setJSONStoreEnabled(true).build()).getInstance();
		twitterStream.addListener(listener);
		// sample() method internally creates a thread which manipulates
		// TwitterStream and calls these adequate listener methods continuously.
		FilterQuery filterQuery = new FilterQuery(0, null, new String[] { "maif,maaf,axa,allianz,generali,Metlife,Prudential,Zenkyoren,AIG,Aviva" });
		twitterStream.filter(filterQuery);
	}

}
