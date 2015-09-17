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

class AppControl implements org.luwrain.app.cpanel.Strings
{
    @Override public String appName()
    {
	return "Панель управления";
    }

    @Override public String sectionsAreaName()
    {
	return "Группы параметров";
    }

    @Override public String sectName(int id)
    {
	switch(id)
	{
	case SYS_DEVICES:
	    return "Системные устройства";
	case STORAGE_DEVICES:
	    return "Устройства хранения";
	case HARDWARE:
	    return "Оборудование";
	case APPS:
	    return "Приложения";
	case SPEECH:
	    return "Речь";
	case SOUNDS:
	    return "Звук";
	case KEYBOARD:
	    return "Клавиатура";
	case UI :
	    return "Интерфейс";
	case EXTENSIONS :
	    return "Расширения";
	case NETWORK :
	    return "Сеть";
	case WORKERS :
	    return "Фоновые задачи";
	default:
	    return "Неизвестный тип секции " + id + "#";
	}
    }
}
