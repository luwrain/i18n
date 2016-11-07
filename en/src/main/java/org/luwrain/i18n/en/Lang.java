/*
   Copyright 2012-2016 Michael Pozhidaev <michael.pozhidaev@gmail.com>

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

import java.util.*;

import org.luwrain.core.*;
import org.luwrain.i18n.*;

class Lang extends LangBase
{
    Lang(Map<String, String> staticStrings,
	 Map<String, String> chars)
    {
	super(staticStrings, chars);
    }

    @Override public String getNumberStr(int num, String entities)
    {
	return "fixme";
    }

@Override public String pastTimeBrief(java.util.Date date)
    {
	return "fixme";
    }

    static String afterNum(int num,
			   String afterZero,
			   String afterOne,
			   String afterTwo)
    {
	if (num < 0)
	    throw new IllegalArgumentException("num may not be negative");
	if (num == 0 || num % 10 == 0)
	    return afterZero;
	if (num % 100 >= 11 && num % 100 <= 19)
	    return afterZero;
	if (num % 10 == 1)
	    return afterOne;
	if (num % 10 >= 2 && num % 10 < 4)
	    return afterTwo;
	return afterZero;
    }

}
