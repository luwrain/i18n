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

package org.luwrain.i18n.ru;

import java.net.*;
import java.util.*;

import org.luwrain.core.*;
import java.io.*;
import org.luwrain.i18n.*;

public class Extension extends org.luwrain.core.extensions.EmptyExtension
{
    static private final String LANG = "ru";

    static private final String COMMAND_PREFIX = "command.";
    static private final String STATIC_PREFIX = "static.";
    static private final String STRINGS_PREFIX = "strings.";

    static private final String CONSTANTS_PROPERTIES_RESOURCE = "org/luwrain/i18n/ru/constants.properties";

    private final Map<String, String> staticStrings = new HashMap<String, String>();

    @Override public void i18nExtension(Luwrain luwrain, I18nExtension ext)
    {
	try {
	    loadProperties(CONSTANTS_PROPERTIES_RESOURCE, ext);
	}
	catch(IOException e)
	{
	    e.printStackTrace();
	}

	ext.addLang("ru", new Lang());


	ext.addStrings("ru", "main-menu", new MainMenu());
	ext.addStrings("ru", "luwrain.crash", new AppCrash());
	ext.addStrings("ru", org.luwrain.desktop.App.STRINGS_NAME, new Desktop());

	save("control-panel", "Панель управления", new AppControl(), ext);
	save("registry", "Редактор реестра", new AppRegistry(), ext);
	save("message", "Сообщение", new AppMessage(), ext);
	save("contacts", "Адресная книга", new AppContacts(), ext);
	save("wiki", "Википедия", new AppWiki(), ext);
	save("calc", "Калькулятор", new AppCalc(), ext);
    }

    private void save(String name, String command,
		 Object strings, I18nExtension ext)
    {
 	ext.addCommandTitle("ru", name, command);
	ext.addStrings("ru", "luwrain." + name, strings);
    }

    private boolean saveProxy(String name, Class stringsClass, I18nExtension ext)
    {
	final Object strings;
	try {
	    strings = PropertiesProxy.create(ClassLoader.getSystemResource(CONSTANTS_PROPERTIES_RESOURCE), name + ".", stringsClass);
	}
	catch(java.io.IOException e)
	{
	    e.printStackTrace();
	    return false;
	}
	ext.addStrings("ru", "luwrain." + name, strings);
	return true;
	}

    private boolean addProxy(String name, String className, I18nExtension ext)
    {
	NullCheck.notEmpty(name, "name");
	NullCheck.notEmpty(className, "className");
	NullCheck.notNull(ext, "ext");
	final Class cl;
	try {
	    cl = Class.forName(className);
	}
	catch (ClassNotFoundException e)
	{
	    return false;
	}
	return saveProxy(name, cl, ext);
    }

    private void loadProperties(String name, I18nExtension ext) throws IOException
    {
	NullCheck.notEmpty(name, "name");
	NullCheck.notNull(ext, "ext");
	final Properties props = new Properties();
	final URL url = ClassLoader.getSystemResource(name);
	props.load(new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8")));
	final Enumeration e = props.propertyNames();
	while(e.hasMoreElements())
	{
	    final String k = (String)e.nextElement();
	    final String v = props.getProperty(k);
	    if (v == null)
	    {
		Log.warning(LANG, "key \'" + k + "\' in resource file " + name + " doesn\'t have value");
		continue;
	    }
	    if (k.trim().startsWith(COMMAND_PREFIX))
	    {
		final String c = k.trim().substring(COMMAND_PREFIX.length());
	    if (c.trim().isEmpty())
	    {
		Log.warning(LANG, "illegal key \'" + k + "\' in resource file " + name);
		continue;
	    }
	    ext.addCommandTitle(LANG, c.trim(), v.trim());
	continue;
	    }
	    if (k.trim().startsWith(STATIC_PREFIX))
	    {
		final String c = k.trim().substring(STATIC_PREFIX.length());
	    if (c.trim().isEmpty())
	    {
		Log.warning(LANG, "illegal key \'" + k + "\' in resource file " + name);
		continue;
	    }
	    staticStrings.put(c.trim(), v.trim());
	continue;
	    }
	    if (k.trim().startsWith(STRINGS_PREFIX))
	    {
		final String c = k.trim().substring(STRINGS_PREFIX.length());
	    if (c.trim().isEmpty())
	    {
		Log.warning(LANG, "illegal key \'" + k + "\' in resource file " + name);
		continue;
	    }
    if (!addProxy(c.trim(), v.trim(), ext))
	Log.warning(LANG, "unable to create proxy strings object \'" + c + "\' for interface " + v.trim());
	continue;
	    }
	}
    }
}
