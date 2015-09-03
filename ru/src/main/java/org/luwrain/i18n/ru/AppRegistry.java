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

class AppRegistry implements org.luwrain.app.registry.Strings
{
    @Override public String appName()
    {
	return "Редактор реестра";
    }

    @Override public String dirsAreaName()
    {
	return "Каталоги параметров реестра";
    }

    @Override public String valuesAreaName()
    {
	return "Список параметров";
    }

    @Override public String rootItemTitle()
    {
	return "Реестр Luwrain";
    }

    @Override public String introduceStringValue(String name, String value)
    {
	return "Строковый параметр " + name + " равен " + value;
    }

    @Override public String introduceIntegerValue(String name, String value)
    {
	return "Целочисленный параметр " + name + " равен " + value;
    }

    @Override public String introduceBooleanValue(String name, boolean value)
    {
	return "Булевый параметр " + name + " равен " + (value?"да":"нет");
    }

    @Override public String yes()
    {
	return "Да";
    }

    @Override public String no()
    {
	return "Нет";
    }

    @Override public String newDirectoryTitle()
    {
	return "Новый каталог реестра";
    }

    @Override public String newDirectoryPrefix(String parentName)
    {
	return "Имя нового каталога в \"" + parentName + "\":";
    }

    @Override public String directoryNameMayNotBeEmpty()
    {
	return "Имя каталога реестра не может быть пустым";
    }

    @Override public String directoryInsertionRejected(String parentName, String dirName)
    {
	return "В создании каталога реестра с именем \"" + dirName + "\" отказано";
    }

    @Override public String newParameterTitle()
    {
    return "Добавление нового параметра";
    }

    @Override public String newParameterName()
    {
	return "Имя нового параметра реестра:";
    }

    @Override public String 	newParameterType()
    {
	return "Тип нового параметра реестра:";
    }

    @Override public String parameterNameMayNotBeEmpty()
    {
	return "Имя параметра не может быть пустым";
    }

    @Override public String invalidParameterType(String type)
    {
	return "\"" + type + "\" не является допустимым типом параметра";
    }

    @Override public String parameterInsertionFailed()
    {
	return "В добавлении нового параметра отказано";
    }

    @Override public String savingOk()
    {
	return "Все изменения успешно сохранены!";
    }

    @Override public String savingFailed()
    {
	return "Некоторые из изменений не могут быть сохранены";
    }
}
