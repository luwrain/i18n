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

import org.luwrain.core.*;
import org.luwrain.i18n.*;

public class Extension extends org.luwrain.core.extensions.EmptyExtension
{
    static private final String CONSTANTS_PROPERTIES_RESOURCE = "org/luwrain/i18n/ru/constants.properties";


    @Override public void i18nExtension(Luwrain luwrain, I18nExtension ext)
    {
	ext.addLang("ru", new Lang());

	ext.addCommandTitle("ru", "quit", "Завершить работу в Luwrain");
	ext.addCommandTitle("ru", "shutdown", "Выключить компьютер");
	ext.addCommandTitle("ru", "suspend", "Спящий режим");
	ext.addCommandTitle("ru", "reboot", "Перезагрузить компьютер");

	ext.addStrings("ru", "main-menu", new MainMenu());
	ext.addStrings("ru", "luwrain.crash", new AppCrash());
	ext.addStrings("ru", org.luwrain.desktop.App.STRINGS_NAME, new Desktop());

	save("control-panel", "Панель управления", new AppControl(), ext);
	save("registry", "Редактор реестра", new AppRegistry(), ext);
	save("term", "Терминал", new AppTerm(), ext);
	save("mail", "Почта", new AppMail(), ext);
	save("message", "Сообщение", new AppMessage(), ext);
	save("fetch", "Доставка почты и новостей", new AppFetch(), ext);
	save("contacts", "Адресная книга", new AppContacts(), ext);
	saveWithProxy("notepad", "Блокнот", org.luwrain.app.notepad.Strings.class, ext);
	save("commander", "Обзор файлов и папок", new AppCommander(), ext);
	saveWithProxy("reader", "Просмотр документов", org.luwrain.app.reader.Strings.class, ext);
	save("wiki", "Википедия", new AppWiki(), ext);
	save("twitter", "Твиттер", new AppTwitter(), ext);
	saveWithProxy("news", "Новости", org.luwrain.app.news.Strings.class, ext);
	save("opds", "Каталоги книг", new AppOpds(), ext);
	saveWithProxy("narrator", "Рассказчик", org.luwrain.app.narrator.Strings.class, ext);
	saveWithProxy("wifi", "Подключение к WiFi-сетям", org.luwrain.app.wifi.Strings.class, ext);
	//	saveWithProxy("player", "Медиаплеер", org.luwrain.app.player.Strings.class, ext);
	save("calc", "Калькулятор", new AppCalc(), ext);
 	ext.addCommandTitle("ru", "reader-search-google", "Поиск в Google");
 	ext.addCommandTitle("ru", "reader-luwrain-homepage", "Домашняя страница LUWRAIN");
 	ext.addCommandTitle("ru", "open-url", "Открыть веб-страницу");
    }

    private void save(String name, String command,
		 Object strings, I18nExtension ext)
    {
 	ext.addCommandTitle("ru", name, command);
	ext.addStrings("ru", "luwrain." + name, strings);
    }

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
}
