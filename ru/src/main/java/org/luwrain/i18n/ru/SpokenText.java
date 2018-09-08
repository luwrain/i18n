/*
   Copyright 2012-2018 Michael Pozhidaev <michael.pozhidaev@gmail.com>

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

import org.luwrain.core.*;
import org.luwrain.core.Luwrain.SpokenTextType;

final class SpokenText
{
    String process(String text, SpokenTextType type)
    {
	NullCheck.notNull(text, "text");
	NullCheck.notNull(type, "type");
	switch(type)
	{
	case NATURAL:
	    return processNatural(text);
	default:
	    return text;
	}
    }

    private String processNatural(String text)
    {
	NullCheck.notNull(text, "text");
	final StringBuilder b = new StringBuilder();
	for(int i = 0;i < text.length();++i)
	{
	    final char c = text.charAt(i);
	    switch(c)
	    {
	    case '(':
		b.append(" , в скобках, ");
		break;
	    case ')':
		b.append(" , закрылась скобка, ");

		break;
	    default:
		b.append("" + c);
	    }
	}
	return new String(b);
    }
}
