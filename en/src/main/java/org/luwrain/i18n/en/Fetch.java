
package org.luwrain.i18n.en;

class Fetch implements org.luwrain.app.fetch.Strings
{
    @Override public String appName()
    {
	return "Fetch of news";
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
	return "Error occurred while reading information about news groups, skipping news fetching";
    }

    @Override public String noNewsGroups()
    {
	return "No news groups, skipping news fetching";
    }

    @Override public String newsFetchingError(String groupName)
    {
	return "Error occurred while fetching news of group \"" + groupName + "\", skipping this group";
    }

    @Override public String newsGroupFetched(String name,
					     int fresh,
					     int total)
    {
	return name + ": " + fresh + " new of " + total;
    }

    @Override public String pressEnterToStart()
    {
    return "Press ENTER to launch fetching";
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
	return "Fetching mail from account \"" + accountName + "\"";
    }

    @Override public String mailErrorWithAccount(String accountName)
    {
	return "Error occurred while fetching mail from account \"" + accountName + "\", skipping this account";
    }

    public String connecting(String host)
    {
	return "Connecting to " + host;
    }

    public String noMailAccounts()
    {
	return "No mail accounts, skipping mail fetching";
    }

    @Override public String noMailStoring()
    {
	return "No connection for mail storing, skipping mail fetching";
    }

    @Override public String mailAccountsProblem()
    {
	return "Error occurred while reading information about mail accounts, skipping mail fetching";
    }

    @Override public String fetchedMailMessages(int count)
    {
	return "Messages fetched: " + count;
    }

    @Override public String startingNewsFetching()
    {
	return "Starting news fetching";
    }

    @Override public String interrupted()
    {
	return "Fetching is interrupted";
    }
}
