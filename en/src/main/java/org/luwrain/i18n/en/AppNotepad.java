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

class AppNotepad implements org.luwrain.app.notepad.Strings
{
    @Override public String appName()
    {
	return "Notepad";
    }

    @Override public String initialTitle()
    {
	return "Notepad";
    }

    @Override public String errorOpeningFile()
    {
	return "Unable to read the file";
    }

    public String errorSavingFile()
    {
	return "Unable to save the file";
    }

    @Override public String fileIsSaved()
    {
	return "File successfully saved";
    }

    @Override public String savePopupName()
    {
	return "File saving";
    }

    @Override public String savePopupPrefix()
    {
	return "Enter the name of a file to save:";
    }

    @Override public String saveChangesPopupName()
    {
	return "Unsaved changes";
    }

    @Override public String saveChangesPopupQuestion()
    {
	return "Do you want to save the changes";
    }

    @Override public String noModificationsToSave()
    {
	return "No changes to save";
    }

    @Override public String charsetPopupName()
    {
	return "New charset";
    }

    @Override public String charsetPopupPrefix()
    {
	return "Choose new charset:";
    }

    @Override public String invalidCharset()
    {
	return "The invalid value has been entered";
    }

    @Override public String rereadAnotherCharsetPopupName()
    {
	return "Charset changing";
    }

    @Override public String rereadAnotherCharsetPopupQuestion()
    {
	return "Do you want to reread the file with new charset?";
    }

    @Override public String actionTitle(String name)
    {
	switch(name)
	{
	case "save":
	    return "Save";
	case "open-another-charset":
	    return "Open with specified charset";
	case "save-another-charset":
	    return "Save with specified charset";
	case "remove-backslash-r":
	    return "Remove new lines chars in Windows style";
	case "add-backslash-r":
	    return "Add new lines chars in Windows style";
	default:
	    return "#Unknown notepad action:" + name + "#";
	}
    }

    @Override public String infoAreaName()
    {
	return "Information";
    }
}
