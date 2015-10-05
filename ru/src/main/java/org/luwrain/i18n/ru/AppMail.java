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

import java.util.Date;

class AppMail implements org.luwrain.app.mail.Strings
{
    @Override public String appName()
    {
	return "Почта";
    }

    @Override public String folderTitle(String src)
    {
	switch(src)
	{
	case "luwrain-mail-folder-root":
	    return "Электронная почта";
	case "luwrain-mail-folder-inbox":
	    return "Входящие";
	case "luwrain-mail-folder-pending":
	    return "Исходящие";
	case "luwrain-mail-folder-sent":
	    return "Отправленные";
	case "luwrain-mail-folder-drafts":
	    return "Черновики";
	case "luwrain-mail-folder-private":
	    return "Личные";
	case "luwrain-mail-folder-lists":
	    return "Списки рассылок";
	default:
	    return src;
	}
    }

    @Override public String foldersAreaName()
    {
	return "Группы";
    }

    @Override public String summaryAreaName()
    {
	return "Сообщения";
    }

    @Override public String messageAreaName()
    {
	return "Текст сообщения";
    }

    @Override public String noMailStoring()
    {
	return "Отсутствует подключения для хранения почты";
    }

    @Override public String errorOpeningFolder()
    {
	return "Ошибка открытия почтовой группы";
    }

    @Override public String mailFoldersRoot()
    {
	return "Электронная почта";
    }

    @Override public String readPrefix()
    {
	return "Прочитано";
    }

    @Override public String markedPrefix()
    {
	return "Помечено";
    }

    @Override public String emptySummaryArea()
    {
	return "Сообщения в списке отсутствуют";
    }

    @Override public String lastSummaryLine()
    {
	return "Сообщения ниже отсутствуют";
    }

    @Override public String firstSummaryLine()
    {
	return "Сообщение выше отсутствуют";
    }

    @Override public String passedTimeBrief(Date date)
    {
	final DateUtils utils = new DateUtils();
	return utils.passedTimeBrief(date) + " назад";
    }

    @Override public String messageSentDate(Date date)
    {
	final DateUtils utils = new DateUtils();
	return DateUtils.dateTime(date) + " (" + utils.passedTimeFull(date) + " назад)";
    }

@Override public String replyFirstLine(String sender,Date sentDate)
    {
	return sender + " написал(а) " + (new DateUtils().date(sentDate)) + ":";
    }
}
