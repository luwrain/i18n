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

import java.util.*;

import com.google.gson.annotations.*;

import org.luwrain.core.*;
import org.luwrain.nlp.*;

public final class RuWord implements Word
{
    @SerializedName("pos")
    private POS pos = null;

    @SerializedName("lemma")
    private String lemma = null;

    @SerializedName("base")
    private String gramBase = null;

    @SerializedName("forms")
    private List<Form> forms = null;

    @Override public POS getPos()
    {
	return pos;
    }

    public String getLemma()
    {
	return this.lemma != null?this.lemma:"";
    }

    public Form[] getForms()
    {
	if (forms == null)
	    return new Form[0];
	return forms.toArray(new Form[forms.size()]);
    }

        static public final class Form
    {
	@SerializedName("gram")
	private String gramAttrStr = null;
	@SerializedName("word")
	private String word = null;
    }
}
