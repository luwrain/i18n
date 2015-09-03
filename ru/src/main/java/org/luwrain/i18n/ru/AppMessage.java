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

class AppMessage implements org.luwrain.app.message.Strings
{
    @Override public String appName()
    {
	return "Сообщение";
    }

    @Override public String noMailStoring()
    {
	return "Нет подключения для хранения электронной почты";
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
}
