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

import org.luwrain.core.*;

public class Extension extends org.luwrain.core.extensions.EmptyExtension
{
    @Override public void i18nExtension(Luwrain luwrain, I18nExtension i18nExt)
    {
	i18nExt.addLang("en", new org.luwrain.i18n.en.Lang());
	i18nExt.addCommandTitle("en", "quit", "Quit");
	i18nExt.addCommandTitle("en", "shutdown", "Shutdown");

	i18nExt.addStrings("en", "luwrain.environment", new Environment());
	i18nExt.addStrings("en", "main-menu", new MainMenu());

	i18nExt.addStrings("en", "luwrain.commander", new Commander());
	i18nExt.addStrings("en", "luwrain.fetch", new Fetch());
	i18nExt.addStrings("en", "luwrain.news", new News());
	i18nExt.addStrings("en", "luwrain.twitter", new Twitter());
	i18nExt.addStrings("en", "luwrain.notepad", new Notepad());

	i18nExt.addStrings("en", "luwrain.reader", new Reader());
	i18nExt.addStrings("en", "luwrain.wiki", new Wiki());


    }
}
