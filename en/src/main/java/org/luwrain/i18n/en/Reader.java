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

public class Reader implements org.luwrain.app.reader.Strings
{
    @Override public String appName()
    {
	return "Documents reader";
    }

    @Override public String tableIntroduction(int rows, int cols, String text)
    {
	return "Table rows " + rows + " columns " + cols + " " + text;
    }

    @Override public String tableIntroductionWithLevel(int level,
						       int rows,
						       int cols, String text)
    {
	return "Table level " + level + " rows " + rows + " columns " + cols + " " + text;
    }

    @Override public String tableCellIntroduction(int row, int col, String text)
    {
	if (col == 1)
return "Row " + row + " " + text; else
return "Column " + col + " " + text;
    }

    @Override public String orderedListItemIntroduction(int index, String text)
    {
	if (index == 0)
	    return "Begin of ordered list" + text;
	    return "Item " + index + " " + text;
    }

    @Override public String unorderedListItemIntroduction(int index, String text)
    {
	if (index == 0)
	    return "Begin of unordered list" + text;
	return "Unordered item " + text;
    }

    @Override public String errorOpeningFile()
    {
	return "Error opening a document";
    }

    @Override public String errorFetching()
    {
	return "Error occurred while fetching a page";
    }

    @Override public String noContent()
    {
	return "No document content";
    }
}
