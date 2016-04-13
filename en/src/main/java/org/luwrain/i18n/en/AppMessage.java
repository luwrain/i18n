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

import java.io.*;

class AppMessage implements org.luwrain.app.message.Strings
{
    @Override public String appName()
    {
	return "Message";
    }

    @Override public String withoutSubject()
    {
	return "No message subject";
    }

    @Override public String emptyRecipient()
    {
	return "Empty recipient";
    }

    @Override public String errorSendingMessage()
    {
	return "Unable to send the message";
    }

    @Override public String to()
    {
	return "To:";
    }

    @Override public String cc()
    {
	return "CC:";
    }

    @Override public String subject()
    {
	return "Subject:";
    }

    @Override public String enterMessageBelow()
    {
	return "Write the text of the message below:";
    }

    @Override public String attachmentPopupName()
    {
	return "New attachments";
    }

    @Override public String attachmentPopupPrefix()
    {
	return "Choose a file for the attachment:";
    }

    @Override public String attachment(File f)
    {
	return "Attachment " + f.getName() + " (" + f.getAbsolutePath() + ")";
    }

    @Override public String contactsFolderTitle(String origTitle)
    {
	switch(origTitle)
	{
	case "luwrain-contacts-folder-root":
	    return "Address book";
	case "luwrain-contacts-folder-personal":
	    return "Personal contacts";
	case "luwrain-contacts-folder-job":
	    return "Job";
	case "luwrain-contacts-folder-organizations":
	    return "Organizations";
	case "luwrain-contacts-folder-lists":
	    return "Mailing lists";
	default:
	    return origTitle;
	}
    }
}
