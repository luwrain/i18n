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
import org.luwrain.i18n.*;

public final class RuWord implements Word
{
    static public final class Form
    {
	private final GrammaticalAttr gramAttr;
	private final String word;
	public Form(GrammaticalAttr gramAttr, String word)
	{
	    NullCheck.notNull(gramAttr, "gramAttr");
	    NullCheck.notEmpty(word, "word");
	    this.gramAttr = gramAttr;
	    this.word = word;
	}
    }

    private final POS pos;
    private final String word;
    private final Form[] forms;

    public RuWord(POS pos, String word, Form[] forms)
    {
	NullCheck.notNull(pos, "pos");
	NullCheck.notEmpty(word, "word");
	NullCheck.notNullItems(forms, "forms");
	this .pos = pos;
	this.word = word;
	this.forms = forms.clone();
    }

    public RuWord(POS pos, String word)
    {
	this(pos, word, new Form[0]);
    }

    public RuWord(String word)
    {
	this(POS.UNKNOWN, word);
    }

    @Override public POS getPos()
    {
	return pos;
    }

    public String getWord()
    {
	return word;
    }

    public Form[] getForms()
    {
	return forms.clone();
    }
}
