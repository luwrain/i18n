/*
   Copyright 2012-2015 Michael Pozhidaev <michael.pozhidaev@gmail.com>

   This file is part of the LUWRAIN.

   LUWRAIN is free software; you can redistribute it and/or
   modify it under the terms of the GNU General Public
   License as published by the Free Software Foundation; either
   version 3 of the License, or (at your option) any later version.

   LUWRAIN is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
   General Public License for more details.
*/

package org.luwrain.i18n.en;

import java.util.Date;

class AppTwitter implements org.luwrain.app.twitter.Strings
{
    @Override public String appName()
    {
	return "Twitter";
    }

    @Override public String tweetsAreaName()
    {
	return "Tweets";
    }

    @Override public String searchSectionsItem()
    {
	return "Search";
    }

    @Override public String postSectionsItem()
    {
	return "New tweet";
    }

    @Override public String homeTweetsSectionsItem()
    {
	return "Published tweets";
    }

    @Override public String userTweetsSectionsItem()
    {
	return "Tweets of other users";
    }

    @Override public String noConnection()
    {
	return "It is necessary to choose an account for work";
    }

    @Override public String problemConnecting()
    {
	return "Unable to connect to the selected accound";
    }

    @Override public String searchPopupName()
    {
	return "Search";
    }

    @Override public String searchPopupPrefix()
    {
	return "Enter the expression  to search:";
    }

    @Override public String problemSearching()
    {
	return "An error occurred while searching";
    }

    @Override public String nothingFound()
    {
	return "Nothing found";
    }

    @Override public String postPopupName()
    {
	return "New tweet";
    }

    @Override public String postPopupPrefix()
    {
	return "Enter the text of the new tweet:";
    }

    @Override public String postingSuccess()
    {
	return "New tweet was successfully published";
    }

    @Override public String problemPosting()
    {
	return "Unable to publish new tweet";
    }

    @Override public String problemHomeTweets()
    {
	return "Unable to get the list of published tweets";
    }

    @Override public String userTweetsPopupName()
    {
	return "Tweets preview";
    }

    @Override public String userTweetsPopupPrefix()
    {
	return "Enter the name of the user to see tweets of:";
    }

    @Override public String problemUserTweets()
    {
	return "Unable to get the tweets of the requested user";
    }

    @Override public String noUserTweets()
    {
	return "The user has no published tweets";
    }

    @Override public String connectedAccount()
    {
	return "Activated account";
    }

    @Override public String account()
    {
	return "Account";
    }

    @Override public String numberOfFavorites(int num)
    {
	if (num < 1)
	    return "No likes";
	return "" + num + " " + Lang.afterNum(num, "лайков", "лайк", "лайка");
    }

    @Override public String numberOfRetweets(int num)
    {
	if (num < 1)
	    return "No retweets";
	return "" + num + " " + Lang.afterNum(num, "ретвитов", "ретвит", "ретвита");
    }

    @Override public String passedTime(Date date)
    {
	return new DateUtils().passedTimeBrief(date) + " назад";
    }

    @Override public String retweet()
    {
	return "ретвит";
    }
}
