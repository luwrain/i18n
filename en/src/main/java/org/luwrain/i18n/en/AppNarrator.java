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

class AppNarrator
{
    public String appName()
    {
	return "Рассказчик";
    }

    public String targetDirPopupName()
    {
	return "Каталог для сохранения книги";
    }

    public String targetDirPopupPrefix()
    {
	return "Выберите каталог для сохранения файлов книги:";
    }

    public String noTextToSynth()
    {
	return "Отсутствует текст для создания книги";
    }

    public String noChannelToSynth()
    {
	return "Отсутствуют подходящие речевые синтезаторы";
    }

    public String noSupportedAudioFormats()
    {
	return "Отсутствуют поддерживаемые форматы звуковых данных";
    }

    public String done()
    {
	return "Готово!";
    }

    public String compressing(String fileName)
    {
	return "Сжатие " + fileName;
    }
}


