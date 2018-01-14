/*
   Copyright 2012-2018 Michael Pozhidaev <michael.pozhidaev@gmail.com>

   This file is part of LUWRAIN.

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
import org.luwrain.i18n.*;

public class Extension extends I18nExtensionBase
{
    static private final String LANG_NAME = "en";
    static private final String RESOURCE_PATH = "org/luwrain/i18n/en/constants.properties";

    @Override public void i18nExtension(Luwrain luwrain, I18nExtension ext)
    {
	NullCheck.notNull(luwrain, "luwrain");
	NullCheck.notNull(ext, "ext");
	try {
	    loadProperties(RESOURCE_PATH, LANG_NAME, ext);
	}
	catch(java.io.IOException e)
	{
	    Log.error(LANG_NAME, "unable to load properties from " + RESOURCE_PATH + ":" + e.getClass().getName() + ":" + e.getMessage());
	    return;
	}
	ext.addLang(LANG_NAME, new Lang(staticStrings, chars));
    }
}
