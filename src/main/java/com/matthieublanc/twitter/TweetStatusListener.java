package com.matthieublanc.twitter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.json.DataObjectFactory;

public class TweetStatusListener implements StatusListener {
	
	final static Logger logger = LoggerFactory.getLogger("tweets-logger");


	@Override
	public void onException(Exception ex) {
		ex.printStackTrace();
	}

	@Override
	public void onStatus(Status status) {
		//logger.info("@" + status.getUser().getScreenName() + " " + status.getText());
		logger.info(DataObjectFactory.getRawJSON(status));
	}

	@Override
	public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTrackLimitationNotice(int numberOfLimitedStatuses) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onScrubGeo(long userId, long upToStatusId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStallWarning(StallWarning warning) {
		// TODO Auto-generated method stub

	}

}
