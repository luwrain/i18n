/*
   Copyright 2012-2015 Michael Pozhidaev <msp@altlinux.org>

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

import org.luwrain.core.LangStatic;

public class Lang extends org.luwrain.core.Lang
{
    @Override public String staticStr(int code)
    {
	switch (code)
	{
	case LangStatic.SPACE:
	    return "space";
	case LangStatic.TAB:
	    return "tab";
	case LangStatic.BEGIN_OF_LINE:
	    return "Begin of line";
	case LangStatic.END_OF_LINE:
	    return "End of line";
	case LangStatic.EMPTY_LINE:
	    return "Empty line";
	case LangStatic.NO_LINES_ABOVE:
	    return "No lines above";
	case LangStatic.NO_LINES_BELOW:
	    return "No lines below";
	case LangStatic.BEGIN_OF_TEXT:
	    return "Begin of text";
	case LangStatic.END_OF_TEXT:
	    return "End of text";
	case LangStatic.TREE_AREA_BEGIN:
	    return "Begin of tree";
	case LangStatic.TREE_AREA_END:
	    return "End of tree";
	case LangStatic.NO_ITEMS_ABOVE:
	    return "No items above";
	case LangStatic.NO_ITEMS_BELOW:
	    return "No items below";
	case LangStatic.EMPTY_TREE:
	    return "Empty tree";
	case LangStatic.EMPTY_TREE_ITEM:
	    return "Empty tree item";
	case LangStatic.TREE_EXPANDED:
	    return "Expanded";
	case LangStatic.TREE_COLLAPSED:
	    return "Collapsed";
	case LangStatic.TREE_LEVEL:
	    return "level";
	case LangStatic.LIST_NO_CONTENT:
	    return "No list items";
	case LangStatic.NO_TABLE_ROWS:
	    return "No table rows"; 
	case LangStatic.NO_TABLE_ROWS_ABOVE:
	    return "No rows above"; 
	case LangStatic.NO_TABLE_ROWS_BELOW:
	    return "No rows below";
	case LangStatic.END_OF_TABLE_COL:
	    return "End of column";
	case LangStatic.MESSAGE:
	    return "Message";
	case LangStatic.MESSAGE_TO:
	    return "To:";
	case LangStatic.MESSAGE_CC:
	    return "CC:";
	case LangStatic.MESSAGE_SUBJECT:
	    return "ТSubject:";
	case LangStatic.MESSAGE_TEXT:
	    return "Enter the text of the message:";
	case LangStatic.MESSAGE_ATTACHMENT:
	    return "Attachment";
	case LangStatic.MESSAGE_ATTACHMENT_POPUP_TITLE:
	    return "Attach a file";
	case LangStatic.MESSAGE_ATTACHMENT_POPUP_PREFIX:
	    return "Choose a file for the attachment:";
	case LangStatic.COPIED_LINES:
	    return "Lines copied:";
	case LangStatic.CUT_LINES:
	    return "Lines cut:";
	case LangStatic.COMMANDER_NO_CONTENT:
	    return "Folder content is inaccessible";
	case LangStatic.COMMANDER_SELECTED_DIRECTORY:
	    return "Selected folder";
	case LangStatic.COMMANDER_SELECTED:
	    return "Selected";
	case LangStatic.COMMANDER_DIRECTORY:
	    return "Folder";
	case LangStatic.COMMANDER_PARENT_DIRECTORY:
	    return "Parent folder";
	case LangStatic.COMMANDER_USER_HOME:
	    return "Home directory";
	case LangStatic.POPUP_IMPORTANT_LOCATIONS_NAME:
	    return "Select location";
	default:
	    return "#UNKNOWN IDENTIFIER?#";
	}
    }

    @Override public String hasSpecialNameOfChar(char ch)
    {
	if (Character.isDigit(ch) || Character.isLetter(ch))
	    return null;
	switch(ch)
	{
	case '-':
	    return "dash";
	case '/':
	    return "slash";
	default:
	    return Character.getName(ch);
	}
    }
}
