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

import java.util.*;

class AppNotepad implements org.luwrain.app.notepad.Strings
{
    @Override public String appName()
    {
	return "Блокнот";
    }

    @Override public String initialTitle()
    {
	return "Блокнот";
    }

    @Override public String errorOpeningFile()
    {
	return "Произошла ошибка при чтении файла";
    }

    public String errorSavingFile()
    {
	return "Произошла ошибка при сохранении файла";
    }

    @Override public String fileIsSaved()
    {
	return "Файл успешно сохранён";
    }

    @Override public String savePopupName()
    {
	return "Сохранение файла";
    }

    @Override public String savePopupPrefix()
    {
	return "Введите имя файла для сохранения:";
    }

    @Override public String saveChangesPopupName()
    {
	return "Несохранённые изменения";
    }

    @Override public String saveChangesPopupQuestion()
    {
	return "Вы хотите сохранить изменения?";
    }

    @Override public String noModificationsToSave()
    {
	return "Нет изменений для сохранения";
    }

    @Override public String charsetPopupName()
    {
	return "Смена кодировки";
    }

    @Override public String charsetPopupPrefix()
    {
	return "Введите новую кодировку:";
    }

    @Override public String invalidCharset()
    {
	return "Введено недопустимое значение";
    }

    @Override public String rereadAnotherCharsetPopupName()
    {
	return "Смена кодировки";
    }

    @Override public String rereadAnotherCharsetPopupQuestion()
    {
	return "Вы хотите перечитать файл с учётом новой кодировки?";
    }

    @Override public String actionTitle(String name)
    {
	switch(name)
	{
	case "save":
	    return "Сохранить";
	case "open-another-charset":
	    return "Открыть с указанием кодировки";
	case "save-another-charset":
	    return "Сохранить с указанием кодировки";
	case "remove-backslash-r":
	    return "Удалить символы переноса строк Windows";
	case "add-backslash-r":
	    return "Добавить символы переноса строк Windows";
	default:
	    return "#Неизвестное действие блокнота:" + name + "#";
	}
    }
}
