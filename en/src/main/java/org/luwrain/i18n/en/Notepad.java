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

import java.util.*;

class Notepad implements org.luwrain.app.notepad.Strings
{
    @Override public String appName()
    {
	return "Notepad";
    }

    @Override public String introduction()
    {
	return "Editing";
    }

    @Override public String newFileName()
    {
	return "New file.txt";
    }

    @Override public String errorOpeningFile()
    {
	return "Error occurred while reading a file";
    }

    public String errorSavingFile()
    {
	return "Error occurred while writing to file";
    }

    @Override public String fileIsSaved()
    {
	return "File successfully saved";
    }

    @Override public String savePopupName()
    {
	return "Saving";
    }

    @Override public String savePopupPrefix()
    {
	return "Enter the name of a file to write to:";
    }

    @Override public String saveChangesPopupName()
    {
	return "Unsaved changes";
    }

    @Override public String saveChangesPopupQuestion()
    {
	return "Do you want to save changes?";
    }

    @Override public String noModificationsToSave()
    {
	return "No changes to save";
    }

    @Override public String charsetPopupName()
    {
	return "Another charset";
    }

    @Override public String charsetPopupPrefix()
    {
	return "Enter new charset:";
    }

    @Override public String invalidCharset()
    {
	return "You have entered an invalid value";
    }

    @Override public String rereadAnotherCharsetPopupName()
    {
	return "Another charset";
    }

    @Override public String rereadAnotherCharsetPopupQuestion()
    {
	return "Do you want to reread this file with new charset?";
    }
}
