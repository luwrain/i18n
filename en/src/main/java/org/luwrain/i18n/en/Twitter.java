/*
   Copyright 2012-2015 Michael Pozhidaev <michael.pozhidaev@gmail.com>

   This file is part of the Luwrain.

   Luwrain is free software; you can redistribute it and/or
   modify it under the terms of the GNU General Public
   License as published by the Free Software Foundation; either
   version 3 of the License, or (at your option) any later version.

   Luwrain is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
   General Public License for more details.
*/

package org.luwrain.i18n.en;

class Twitter implements org.luwrain.app.twitter.Strings
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
	return "Timeline";
    }

    @Override public String userTweetsSectionsItem()
    {
	return "Timeline of another user";
    }

    @Override public String noConnection()
    {
	return "You must choose an account for work";
    }

    @Override public String problemConnecting()
    {
	return "Unable to connect to selected account";
    }

    @Override public String searchPopupName()
    {
	return "Search";
    }

    @Override public String searchPopupPrefix()
    {
	return "Search for:";
    }

    @Override public String problemSearching()
    {
	return "Error occurred while search";
    }

    @Override public String nothingFound()
    {
	return "Nothing found for your search phrase";
    }

    @Override public String postPopupName()
    {
	return "New tweet";
    }

    @Override public String postPopupPrefix()
    {
	return "Enter the text of new tweet:";
    }

    @Override public String postingSuccess()
    {
	return "New tweet successfully published";
    }

    @Override public String problemPosting()
    {
	return "Error occurred while publishing new tweet";
    }

    @Override public String problemHomeTweets()
    {
	return "Error occurred while fetch a timeline";
    }

    @Override public String userTweetsPopupName()
    {
	return "Timeline of another user";
    }

    @Override public String userTweetsPopupPrefix()
    {
	return "Enter the name of a user to fetch timeline of:";
    }

    @Override public String problemUserTweets()
    {
	return "Error occurred while fetching a timeline of selected user";
    }

    @Override public String noUserTweets()
    {
	return "The user doesn\'t have any published tweets";
    }

    @Override public String connectedAccount()
    {
	return "Connected account";
    }

    @Override public String account()
    {
	return "Account";
    }
}
