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

class AppContacts implements org.luwrain.app.contacts.Strings
{
    @Override public String appName()
    {
	return "Адресная книга";
    }

    @Override public String foldersAreaName()
    {
	return "Группы и записи";
    }

    @Override public String valuesAreaName()
    {
	return "Адреса и телефоны";
    }

    @Override public String notesAreaName()
    {
	return "Комментарий";
    }

    @Override public String insertIntoTreePopupName()
    {
	return "Выберите тип нового объекта";
    }

    @Override public String insertIntoTreePopupValueFolder()
    {
	return "Новая группа контактов";
    }

    @Override public String insertIntoTreePopupValueContact()
    {
	return "Новый контакт";
    }

    @Override public String folderTitle(String origTitle)
    {
	switch(origTitle)
	{
	case "luwrain-contacts-folder-root":
	    return "Адресная книга";
	case "luwrain-contacts-folder-personal":
	    return "Личные контакты";
	case "luwrain-contacts-folder-job":
	    return "Работа";
	case "luwrain-contacts-folder-organizations":
	    return "Организации";
	case "luwrain-contacts-folder-lists":
	    return "Списки рассылок";
	default:
	    return origTitle;
	}
    }
}
