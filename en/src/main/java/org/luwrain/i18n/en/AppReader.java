
package org.luwrain.i18n.en;

class AppReader implements org.luwrain.app.reader.Strings
{
    @Override public String appName()
    {
	return "Documents preview";
    }

    @Override public String sectionIntroduction(int level, String text)
    {
	return text + " Section level " + level;
    }

    @Override public String tableIntroduction(int rows, int cols, String text)
    {
	return text + " Table with " + rows + " rows and " + cols + "columns";
    }

    @Override public String tableIntroductionWithLevel(int level,
						       int rows, int cols, String text)
    {
	return text + " Table of level  " + level;
    }

    @Override public String tableCellIntroduction(int row, int col, String text)
    {
	if (col == 1)
return text + " row " + row; else
return text + " column " + col;
    }

    @Override public String orderedListItemIntroduction(int index, String text)
    {
	if (index == 0)
	    return text + " Ordered list";
	return text + " list item  " + (index + 1);
    }

    @Override public String unorderedListItemIntroduction(int index, String text)
    {
	return text;
    }

    @Override public String paragraphIntroduction(String text)
    {
	return "Paragraph " + text;
    }

    @Override public String noContent(boolean fetching)
    {
	return fetching?"Loading the document. Please wait.":"Open a document with the context menu";
    }

    @Override public String fetching(String url)
    {
	return "Fetching " + url;
    }

    @Override public String badUrl(String url)
    {
	return "An invalid link:" + url;
    }

    @Override public String linkPrefix()
    {
	return "link";
    }

    @Override public String actionTitle(String actionName)
    {
	switch(actionName)
	{
	case "open-file":
	    return "Open file";
	case "open-url":
	    return "Open URL";
	case "info":
	    return "Info about document";
	case "change-format":
	    return "Change a format";
	case "change-charset":
	    return "Change a charset";
	case "open-in-narrator":
	    return "Open in narrator";
	default:
	    return actionName;
	}
    }

    @Override public String infoAreaName()
    {
	return "Info about the document";
    }

    @Override public String bookTreeRoot()
    {
	return "book";
    }

    @Override public String treeAreaName()
    {
	return "sections";
    }

    @Override public String notesAreaName()
    {
	return "Bookmarks";
    }

    @Override public String infoPageField(String name)
    {
	switch(name)
	{
	case "url":
	    return "URL";
	case "title":
	    return "Section";
	case "ncc:files":
	    return "Files";
	case "ncc:multimediaType":
	    return "Type of data";
	case "dc:creator":
	    return "Creator";
	case "ncc:generator":
	    return "Created by";
	case "dc:format":
	    return "Daisy-format";
	case "dc:title":
	    return "Daisy-header";
	case "ncc:narrator":
	    return "Narrator";
	case "ncc:sourceDate":
	    return "Date of recording";
	case "ncc:producedDate":
	    return "Date of release";
	case "dc:language":
	    return "Language";
	case "ncc:producer":
	    return "Producer";
	case "ncc:totalTime":
	    return "Total time";
	case "dc:date":
	    return "Date";
	case "dc:publisher":
	    return "Publisher";
	default:
	    return "";
	}
    }
}
