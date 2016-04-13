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

import java.util.*;

class AppNews implements org.luwrain.app.news.Strings
{
    @Override public String appName()
    {
	return "News";
    }

    @Override public String groupsAreaName()
    {
	return "News groups";
    }

    @Override public String summaryAreaName()
    {
	return "Articles list";
    }

    @Override public String viewAreaName()
    {
	return "Text of the article";
    }

    @Override public     String errorReadingArticles()
    {
	return "Unable to fetch news articles";
    }

    @Override public String readPrefix()
    {
	return "Read";
    }

    @Override public String markedPrefix()
    {
	return "Marked";
    }

    @Override public String noSummaryItems()
    {
	return "No news article";
    }

    @Override public String noSummaryItemsAbove()
    {
	return "No news articles above";
    }

    @Override public String noSummaryItemsBelow()
    {
	return "No news articles below";
    }

    @Override public String errorUpdatingArticleState()
    {
	return "Unable to save the news article";
    }

    @Override public String noMoreUnreadInGroup()
    {
	return "No unread news articles in the group";
    }

    @Override public String passedTimeBrief(Date date)
    {
	return new DateUtils().passedTimeBrief(date) + " ago";
    }
}
