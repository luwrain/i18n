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

import org.luwrain.core.*;

public class Extension extends org.luwrain.core.extensions.EmptyExtension
{
    static private final String LANG_NAME = "en";
    
    @Override public void i18nExtension(Luwrain luwrain, I18nExtension ext)
    {
	//	ext.addLang(LANG_NAME, new Lang(ext.getStaticValueNames()));

	ext.addCommandTitle(LANG_NAME, "quit", "Quit");
	ext.addCommandTitle(LANG_NAME, "shutdown", "Shutdown");
	ext.addCommandTitle(LANG_NAME, "suspend", "Suspend");
	ext.addCommandTitle(LANG_NAME, "reboot", "Reboot");

	//mainmenu
	//desktop
	//control panel
	//registry
	//term
	//mail
	//message
	//fetch
	//contacts
	//	save("notepad", "Notepad", new AppNotepad(), ext);
	//	save("commander", "Commander", new AppCommander(), ext);
	//	save("reader", "Documents preview", new AppReader(), ext);
	//wiki
	//twitter
	//	save("news", "News", new AppNews(), ext);
	//	save("opds", "OPDS-libraries", new AppOpds(), ext);
	//narrator
	//	save("wifi", "Wifi-networks", new AppWifi(), ext);
	//	save("player", "Mediaplayer", new AppPlayer(), ext);
	//calc
    }
}
