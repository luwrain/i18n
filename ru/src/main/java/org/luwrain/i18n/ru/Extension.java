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

public class Extension extends org.luwrain.core.extensions.EmptyExtension
{
    @Override public void i18nExtension(Luwrain luwrain, I18nExtension ext)
    {
	ext.addLang("ru", new Lang(ext.getStaticValueNames()));

	ext.addCommandTitle("ru", "quit", "Завершить работу в Luwrain");
	ext.addCommandTitle("ru", "shutdown", "Выключить компьютер");

	ext.addStrings("ru", "main-menu", new MainMenu());
	ext.addStrings("ru", org.luwrain.desktop.App.STRINGS_NAME, new Desktop());
	ext.addStrings("ru", "luwrain.environment", new Environment());

	save("control-panel", "Панель управления", new AppControl(), ext);
	save("registry", "Редактор реестра", new AppRegistry(), ext);
	save("term", "Терминал", new AppTerm(), ext);
	save("mail", "Почта", new AppMail(), ext);
	save("message", "Сообщение", new AppMessage(), ext);
	save("fetch", "Доставка почты и новостей", new AppFetch(), ext);
	save("contacts", "Адресная книга", new AppContacts(), ext);
	save("notepad", "Блокнот", new AppNotepad(), ext);
	save("commander", "Обзор файлов и папок", new AppCommander(), ext);
	save("reader", "Просмотр документов", new AppReader(), ext);
	save("wiki", "Поиск в Википедии", new AppWiki(), ext);
	save("twitter", "Твиттер", new AppTwitter(), ext);
	save("news", "Новости", new AppNews(), ext);

 	ext.addCommandTitle("ru", "reader-search-google", "Поиск в Google");
    }

    private void save(String name, String command,
		 Object strings, I18nExtension ext)
    {
 	ext.addCommandTitle("ru", name, command);
	ext.addStrings("ru", "luwrain." + name, strings);
    }
}
