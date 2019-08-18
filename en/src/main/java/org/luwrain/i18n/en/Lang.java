/*
   Copyright 2012-2019 Michael Pozhidaev <msp@luwrain.org>

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

package org.luwrain.i18n.en;

import java.util.*;

import org.luwrain.core.*;
import org.luwrain.i18n.*;

class Lang extends LangBase
{
    Lang(Map<String, String> staticStrings, Map<String, String> chars)
    {
	super(staticStrings, chars);
    }

    @Override public String getNumberStr(int num, String entities)
    {
	NullCheck.notEmpty(entities, "entities");
	final StringBuilder b = new StringBuilder();
	b.append("" + num + " ");
	switch(entities)
	{
	case "items":
	    b.append(num == 1?"item":"items");
	    break;
	case "percents":
	    b.append(num == 1?"percent":"percents");
	    break;
	case "hours":
	    b.append(num == 1?"hour":"hours");
	    break;
	case "minutes":
	    b.append(num == 1?"minute":"minutes");
	    break;
	}
	return new String(b);
    }

    @Override public String pastTimeBrief(java.util.Date date)
    {
	NullCheck.notNull(date, "date");
	return new DateUtils().pastTimeBrief(date) + " ago";
	}

    @Override public String getSpokenText(String text, Luwrain.SpokenTextType type)
    {
	//FIXME:
	return text;
    }
}
