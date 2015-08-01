/*
   Copyright 2012-2015 Michael Pozhidaev <michael.pozhidaev@gmail.com>

   This file is part of the Luwrain.

   Luwrain is free software; you can redistribute it and/or
   modify it under the terms of the GNU General Public
   License as published by the Free Software Foundation; either
   version 3 of the License, or (at your option) any later version.

   Luwrain is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
   General Public License for more details.
*/

package org.luwrain.i18n.ru;

import java.util.*;

class Registry implements org.luwrain.app.registry.StringConstructor
{
    public String dirsAreaName()
    {
	return "Каталоги параметров реестра";
    }

    public String valuesAreaName()
    {
	return "Список параметров";
    }

    public String rootItemTitle()
    {
	return "Реестр Luwrain";
    }

    public String introduceStringValue(String name, String value)
    {
	return "Строковый параметр " + name + " равен " + value;
    }

    public String introduceIntegerValue(String name, String value)
    {
	return "Целочисленный параметр " + name + " равен " + value;
    }

    public String introduceBooleanValue(String name, boolean value)
    {
	return "Булевый параметр " + name + " равен " + (value?"да":"нет");
    }

    public String yes()
    {
	return "Да";
    }

    public String no()
    {
	return "Нет";
    }

    public String newDirectoryTitle()
    {
	return "Новый каталог реестра";
    }

    public String newDirectoryPrefix(String parentName)
    {
	return "Имя нового каталога в \"" + parentName + "\":";
    }

    public String directoryNameMayNotBeEmpty()
    {
	return "Имя каталога реестра не может быть пустым";
    }

    public String directoryInsertionRejected(String parentName, String dirName)
    {
	return "В создании каталога реестра с именем \"" + dirName + "\" отказано";
    }

    public String newParameterTitle()
    {
    return "Добавление нового параметра";
    }

    public String newParameterName()
    {
	return "Имя нового параметра реестра:";
    }

    public String 	newParameterType()
    {
	return "Тип нового параметра реестра:";
    }

    public String parameterNameMayNotBeEmpty()
    {
	return "Имя параметра не может быть пустым";
    }

    public String invalidParameterType(String type)
    {
	return "\"" + type + "\" не является допустимым типом параметра";
    }

    public String parameterInsertionFailed()
    {
	return "В добавлении нового параметра отказано";
    }

    public String savingOk()
    {
	return "Все изменения успешно сохранены!";
    }

    public String savingFailed()
    {
	return "Некоторые из изменений не могут быть сохранены";
    }
}
