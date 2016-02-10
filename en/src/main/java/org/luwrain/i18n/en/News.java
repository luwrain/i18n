
package org.luwrain.i18n.en;

import java.util.*;

class News implements org.luwrain.app.news.Strings
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
	return "Articles";
    }

    @Override public String viewAreaName()
    {
	return "Article text";
    }

    @Override public     String errorReadingArticles()
    {
	return "Error occurred while opening list of news article";
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
	return "No news articles";
    }

    @Override public String noSummaryItemsAbove()
    {
	return "Begin of articles list";
    }

    @Override public String noSummaryItemsBelow()
    {
	return "End of articles list";
    }

    @Override public String errorUpdatingArticleState()
    {
	return "Error occurred while updating article state";
    }

    @Override public String noMoreUnreadInGroup()
    {
	return "All articles read";
    }
}
