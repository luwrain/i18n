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
	ext.addLang(LANG_NAME, new Lang(ext.getStaticValueNames()));

	ext.addCommandTitle(LANG_NAME, "quit", "Quit");
	ext.addCommandTitle(LANG_NAME, "shutdown", "Shutdown");
	ext.addCommandTitle(LANG_NAME, "suspend", "Suspend");
	ext.addCommandTitle(LANG_NAME, "reboot", "Reboot");

	ext.addStrings(LANG_NAME, "main-menu", new MainMenu());
	ext.addStrings(LANG_NAME, org.luwrain.desktop.App.STRINGS_NAME, new Desktop());
	ext.addStrings(LANG_NAME, "luwrain.environment", new Environment());

	save("control-panel", "Control panel", new AppControl(), ext);
	save("registry", "Registry editor", new AppRegistry(), ext);
	save("term", "Terminal", new AppTerm(), ext);
	save("mail", "Mail", new AppMail(), ext);
	save("message", "Message", new AppMessage(), ext);
	save("fetch", "Mail and news fetching", new AppFetch(), ext);
	save("contacts", "Address book", new AppContacts(), ext);
	save("notepad", "Notepad", new AppNotepad(), ext);
	save("commander", "Commander", new AppCommander(), ext);
	//	save("reader", "Documents preview", new AppReader(), ext);
	save("wiki", "Wikipedia", new AppWiki(), ext);
	save("twitter", "Twitter", new AppTwitter(), ext);
	//	save("news", "News", new AppNews(), ext);
	save("opds", "OPDS-libraries", new AppOpds(), ext);
	save("narrator", "Narrator", new AppNarrator(), ext);
	save("wifi", "Wifi-networks", new AppWifi(), ext);
	save("player", "Mediaplayer", new AppPlayer(), ext);
	save("calc", "Calculator", new AppCalc(), ext);
 	ext.addCommandTitle(LANG_NAME, "reader-search-google", "Search in Google");
 	ext.addCommandTitle(LANG_NAME, "reader-luwrain-homepage", "LUWRAIN homepage");
 	ext.addCommandTitle(LANG_NAME, "open-url", "Browse URL");
    }

    private void save(String name, String command,
		 Object strings, I18nExtension ext)
    {
 	ext.addCommandTitle(LANG_NAME, name, command);
	ext.addStrings(LANG_NAME, "luwrain." + name, strings);
    }
}
