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
    @Override public void i18nExtension(Luwrain luwrain, I18nExtension i18nExt)
    {
	i18nExt.addLang("ru", new Lang());

	//Some basic commands;
	i18nExt.addCommandTitle("ru", "quit", "Завершить работу в Luwrain");
	i18nExt.addCommandTitle("ru", "shutdown", "Выключить компьютер");

	//Basic strings;
	i18nExt.addStrings("ru", "main-menu", new MainMenu());
	i18nExt.addStrings("ru", org.luwrain.desktop.App.STRINGS_NAME, new Desktop());
	i18nExt.addStrings("ru", "luwrain.environment", new Environment());

	//Control panel;
	i18nExt.addCommandTitle("ru", "control-panel", "Панель управления");
	i18nExt.addStrings("ru", org.luwrain.app.cpanel.ControlPanelApp.STRINGS_NAME, new AppControl());

	//Registry;
	i18nExt.addCommandTitle("ru", "registry", "Редактор реестра");
	i18nExt.addStrings("ru", org.luwrain.app.registry.RegistryApp.STRINGS_NAME, new AppRegistry());

	//term;
	i18nExt.addCommandTitle("ru", "term", "Терминал");
	i18nExt.addStrings("ru", "luwrain.term", new AppTerm());

	//Mail
	i18nExt.addCommandTitle("ru", "mail", "Почта");
	i18nExt.addStrings("ru", "luwrain.mail", new AppMail());

	//essage;
	i18nExt.addCommandTitle("ru", "message", "Новое сообщение");
	i18nExt.addStrings("ru", "luwrain.message", new AppMessage());

	//fetch;
	i18nExt.addCommandTitle("ru", "fetch", "Доставка почты и новостей");
	i18nExt.addStrings("ru", "luwrain.fetch", new AppFetch());

	//contacts;
	i18nExt.addCommandTitle("ru", "contacts", "Адресная книга");
	i18nExt.addStrings("ru", "luwrain.contacts", new AppContacts());

    	//notepad;
	i18nExt.addCommandTitle("ru", "notepad", "Блокнот");
	i18nExt.addStrings("ru", "luwrain.notepad", new AppNotepad());
    }
}
