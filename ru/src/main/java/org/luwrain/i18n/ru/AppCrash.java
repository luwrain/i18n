/*
   Copyright 2012-2019 Michael Pozhidaev <michael.pozhidaev@gmail.com>

   This file is part of LUWRAIN.

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

class AppCrash implements org.luwrain.app.crash.Strings
{
    @Override public String appName()
    {
	return "Внутренняя ошибка приложения";
    }

    @Override public String[] introMessage()
    {
	return new String[]{
	    "Во время работы приложения произошла внутренняя ошибка, корректно",
	    "обработать которую приложение не в состоянии. Если оно осталось",
	    "запущенным, рекомендуется его закрыть и перезапустить заново, поскольку",
	    "целостность внутренних данных может быть повреждена. Ниже",
	    "приводится техническая информация, которая способна помочь разработчикам",
	    "установить причину ошибки.",
	};
    }

    @Override public String app(String className)
    {
	return "Приложение: " + className;
    }

    @Override public String stackTrace()
    {
	return "Содержимое стека:";
    }
}
