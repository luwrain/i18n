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

import java.io.*;

class AppMessage implements org.luwrain.app.message.Strings
{
    @Override public String appName()
    {
	return "Сообщение";
    }

    @Override public String withoutSubject()
    {
	return "ННет темы сообщения";
    }

    @Override public String emptyRecipient()
    {
	return "Пустой получатель";
    }

    @Override public String errorSendingMessage()
    {
	return "Произошла ошибка при отправлении сообщения";
    }

    @Override public String to()
    {
	return "Кому:";
    }

    @Override public String cc()
    {
	return "Копия:";
    }

    @Override public String subject()
    {
	return "Тема:";
    }

    @Override public String enterMessageBelow()
    {
	return "Текст сообщения ниже:";
    }

    @Override public String attachmentPopupName()
    {
	return "Новое прикрепление";
    }

    @Override public String attachmentPopupPrefix()
    {
	return "Выберите файл для прикрепления:";
    }

    @Override public String attachment(File f)
    {
	return "Прикрепление " + f.getName() + " (" + f.getAbsolutePath() + ")";
    }

    @Override public String contactsFolderTitle(String origTitle)
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
