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

    private final Map<String, String> stringsMap = new HashMap<String, String>(){{
	    put("notepad", "org.luwrain.app.notepad.Strings");
	    put("commander", "org.luwrain.app.commander.Strings");
	    put("reader", "org.luwrain.app.reader.Strings");
	    put("news", "org.luwrain.app.news.Strings");
	    put("narrator", "org.luwrain.app.narrator.Strings");
	    put("wifi", "org.luwrain.app.wifi.Strings");
	    put("player", "org.luwrain.app.player.Strings");
	    put("extensions.voiceman", "org.luwrain.extensions.voiceman.Strings");
	    put("extensions.cmdtts", "org.luwrain.extensions.cmdtts.Strings");
	    put("extensions.emacspeak", "org.luwrain.extensions.emacspeak.Strings");
	    put("settings.mail", "org.luwrain.settings.mail.Strings");
	    put("settings.news", "org.luwrain.settings.news.Strings");
	}};


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

	ext.addCommandTitle("ru", "quit", "Завершить работу в Luwrain");
	ext.addCommandTitle("ru", "reader-open-auto", "Найти в интернете");
	ext.addCommandTitle("ru", "shutdown", "Выключить компьютер");
	ext.addCommandTitle("ru", "suspend", "Спящий режим");
	ext.addCommandTitle("ru", "reboot", "Перезагрузить компьютер");

	ext.addStrings("ru", "main-menu", new MainMenu());
	ext.addStrings("ru", "luwrain.crash", new AppCrash());
	ext.addStrings("ru", org.luwrain.desktop.App.STRINGS_NAME, new Desktop());

	save("control-panel", "Панель управления", new AppControl(), ext);
	save("registry", "Редактор реестра", new AppRegistry(), ext);
	save("term", "Терминал", new AppTerm(), ext);
	//	save("mail", "Почта", new AppMail(), ext);
	save("message", "Сообщение", new AppMessage(), ext);
	save("fetch", "Доставка почты и новостей", new AppFetch(), ext);
	save("contacts", "Адресная книга", new AppContacts(), ext);
	save("wiki", "Википедия", new AppWiki(), ext);
	save("twitter", "Твиттер", new AppTwitter(), ext);
	//	saveWithProxy("news", "Новости", "org.luwrain.app.news.Strings", ext);
	save("opds", "Электронные библиотеки", new AppOpds(), ext);
	//	saveWithProxy("narrator", "Рассказчик", org.luwrain.app.narrator.Strings.class, ext);
	//	saveWithProxy("wifi", "Подключение к WiFi-сетям", org.luwrain.app.wifi.Strings.class, ext);
	//	saveWithProxy("player", "Медиаплеер", "org.luwrain.app.player.Strings", ext);
	save("calc", "Калькулятор", new AppCalc(), ext);
 	ext.addCommandTitle("ru", "reader-search-google", "Поиск в Google");
 	ext.addCommandTitle("ru", "reader-luwrain-homepage", "Домашняя страница LUWRAIN");
 	ext.addCommandTitle("ru", "open-url", "Открыть веб-страницу");
	//	saveProxy("extensions.voiceman", org.luwrain.extensions.voiceman.Strings.class, ext);
//	saveProxy("extensions.cmdtts", org.luwrain.extensions.cmdtts.Strings.class, ext);
	//	saveProxy("extensions.emacspeak", org.luwrain.extensions.emacspeak.Strings.class, ext);

	//	//	saveProxy("settings.mail", org.luwrain.settings.mail.Strings.class, ext);
	///	//	saveProxy("settings.news", org.luwrain.settings.news.Strings.class, ext);
    }

    /*
    private void saveWithProxy(String name, String command,
		 Class stringsClass, I18nExtension ext)
    {
	Object strings = null;
	try {
strings = PropertiesProxy.create(ClassLoader.getSystemResource(CONSTANTS_PROPERTIES_RESOURCE), name + ".", stringsClass);
	}
	catch(java.io.IOException e)
	{
	    e.printStackTrace();
	}
	save(name, command, strings, ext);
	}
    */

    /*
    private void saveWithProxy(String name, String command,
String stringsClassName, I18nExtension ext)
    {
	Class stringsClass = null;
	try {
	stringsClass = Class.forName(stringsClassName);
	}
	catch(ClassNotFoundException e)
	{
	    e.printStackTrace();
	    return;
	}
	Object strings = null;
	try {
strings = PropertiesProxy.create(ClassLoader.getSystemResource(CONSTANTS_PROPERTIES_RESOURCE), name + ".", stringsClass);
	}
	catch(java.io.IOException e)
	{
	    e.printStackTrace();
	}
	save(name, command, strings, ext);
	}
    */

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
	return false;
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
	    e.printStackTrace();
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
