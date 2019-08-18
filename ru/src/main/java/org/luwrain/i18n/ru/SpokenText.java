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

package org.luwrain.i18n.ru;

import org.luwrain.core.*;
import org.luwrain.core.Luwrain.SpokenTextType;

final class SpokenText
{
    static private final String HOOK_NAME_NATURAL_PRE = "luwrain.i18n.ru.speech.natural.pre";
        static private final String HOOK_NAME_PROGRAMMING_PRE = "luwrain.i18n.ru.speech.programming.pre";

    private final Luwrain luwrain;

    SpokenText(Luwrain luwrain)
    {
	NullCheck.notNull(luwrain, "luwrain");
	this.luwrain = luwrain;
    }

    String process(String text, SpokenTextType type)
    {
	NullCheck.notNull(text, "text");
	NullCheck.notNull(type, "type");
	final SpokenTextHook hook = new SpokenTextHook(text);
	switch(type)
	{
	case NATURAL:
	    luwrain.xRunHooks(HOOK_NAME_NATURAL_PRE, hook);
	    return hook.getText();
	case PROGRAMMING:
	    luwrain.xRunHooks(HOOK_NAME_PROGRAMMING_PRE, hook);
	    return hook.getText();
	default:
	    return text;
	}
    }
}
