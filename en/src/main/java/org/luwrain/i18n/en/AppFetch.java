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

class AppFetch implements org.luwrain.app.fetch.Strings
{
    @Override public String appName()
    {
	return "News fetching";
    }

    @Override public String noNewsGroupsData()
    {
	return "No information about news groups";
    }

    @Override public String fetchingCompleted()
    {
	return "Fetching completed";
    }

    @Override public String newsGroupsError()
    {
	return "Unable to get information about news groups, skipping news fetching";
    }

    @Override public String noNewsGroups()
    {
	return "No news groups, skipping news fetching";
    }

    @Override public String newsFetchingError(String groupName)
    {
	return "Произошла ошибка доставки новостей для группы \"" + groupName + "\", группа пропущена";
    }

    @Override public String newsGroupFetched(String name,
					     int fresh,
					     int total)
    {
	if (fresh == 1)
	return name + ": " + fresh + " новая из " + total; else
	    return name + ": " + fresh + " новых из " + total;
    }

    @Override public String pressEnterToStart()
    {
    return "Нажмите ENTER для начала работы!";
	}

    @Override public String processAlreadyRunning()
    {
	return "Fetching is already launched";
    }

    @Override public String processNotFinished()
    {
	return "Fetching is not finished yet";
    }

    @Override public String readingMailFromAccount(String accountName)
    {
	return "Reading mail from the account \"" + accountName + "\"";
    }

    @Override public String mailErrorWithAccount(String accountName)
    {
	return "An error occurred while fetching mail from account \"" + accountName + "\", skipping the account";
    }

    public String connecting(String host)
    {
	return "Connecting to " + host;
    }

    public String noMailAccounts()
    {
	return "No mail accounts, skipping mail reading of mail";
    }

    @Override public String noMailStoring()
    {
	return "No mail storing, skipping reading of mail";
    }

    @Override public String mailAccountsProblem()
    {
	return "Unable to get a list of mail accounts, skipping reading of mail";
    }

    public String fetchedMailMessages(int count)
    {
	return "Messages fetched: " + count;
    }

    @Override public String startingNewsFetching()
    {
	return "Reading mail";
    }

    @Override public String interrupted()
    {
	return "User has interrupted the fetching progress";
    }

    @Override public String actionTitle(String actionName)
    {
	return actionName;
    }
}
