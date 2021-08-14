/*
   Copyright 2012-2021 Michael Pozhidaev <msp@luwrain.org>

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
import org.luwrain.core.Luwrain.SpeakableTextType;

import org.luwrain.nlp.ru.*;
import org.luwrain.script2.ScriptUtils;
import org.luwrain.script.hooks.*;

final class SpeakableText
{
    static private final String
	HOOK_NATURAL_PRE = "luwrain.i18n.ru.speakable.natural.pre",
	HOOK_NATURAL = "luwrain.i18n.ru.speakable.natural",
	HOOK_PROGRAMMING_PRE = "luwrain.i18n.ru.speakable.programming.pre";

    private final HookContainer hookContainer;

    SpeakableText(HookContainer hookContainer)
    {
	NullCheck.notNull(hookContainer, "hookContainer");
	this.hookContainer = hookContainer;
    }

    String process(String text, SpeakableTextType type)
    {
	NullCheck.notNull(text, "text");
	NullCheck.notNull(type, "type");
	switch(type)
	{
	case NATURAL:
	    return processNatural(text);
	case PROGRAMMING:
	    return processProgramming(text);
	default:
	    return text;
	}
    }

    private String processNatural(String text)
    {
	NullCheck.notNull(text, "text");
	/*
	final String t = new TransformerHook(hookContainer).run(HOOK_NATURAL_PRE, text).toString();
	final Token[] tokens = ReaderTokenizer.tokenize(t);
	final Object tokensRes = new ProviderHook(hookContainer).run(HOOK_NATURAL, new Object[]{ScriptUtils.getArray(tokens)});
	if (tokensRes != null && tokensRes.toString() != null)
	    return tokensRes.toString();
	return t;
	*/
	return text;
    }

    private String processProgramming(String text)
    {
	NullCheck.notNull(text, "text");
	return new TransformerHook(hookContainer).run(HOOK_PROGRAMMING_PRE, text).toString();
    }
}
