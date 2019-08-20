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

import java.io.*;
import java.util.*;
import java.net.*;
import com.google.gson.*;
import com.google.gson.annotations.*;

import org.luwrain.core.*;
import org.luwrain.i18n.*;

public class WordsList
{
    static private final String LOG_COMPONENT = Extension.LOG_COMPONENT;
        static private final String RESOURCE_PATH = "org/luwrain/i18n/ru/words";

    static private final String NOUN_PREFIX = "noun:";

    private final Map<String, Noun> nouns = new HashMap();

    void loadFromResource()
    {

	final URL url = this.getClass().getClassLoader().getResource(RESOURCE_PATH);
	if (url == null)
	{
	    Log.error(LOG_COMPONENT, "No resource " + RESOURCE_PATH);
	    return;
	}
	try {
	final InputStream is = url.openStream();
	try {
	    load(is);
	}
	finally {
	    is.close();
	}
	}
	catch(IOException e)
	{
	    Log.error(LOG_COMPONENT, "unable to read and parse the resource " + RESOURCE_PATH + ":" + e.getClass().getName() + ":" + e.getMessage());
	    return;
	}
	Log.debug(LOG_COMPONENT, "read " + nouns.size() + " nouns from " + RESOURCE_PATH);
    }

    void load(InputStream is) throws IOException
    {
	NullCheck.notNull(is, "is");
	final BufferedReader r = new BufferedReader(new InputStreamReader(is));
	String line = r.readLine();
	while (line != null)
	{
	    loadFromLine(line);
	    line = r.readLine();
	}
    }

    void loadFromLine(String line)
    {
	NullCheck.notNull(line, "line");
	if (line.trim().isEmpty())
	    return;
	final int pos = line.indexOf(":");
	if (pos < 0)
	    return;
	final String word = line.substring(0, pos).trim();
	final String forms = line.substring(pos + 1).trim();
	if (word.isEmpty() || forms.isEmpty())
	    return;
	if (forms.startsWith(NOUN_PREFIX))
	    addNoun(word, forms.substring(NOUN_PREFIX.length()));
    }

    private void addNoun(String word, String forms)
    {
	NullCheck.notEmpty(word, "word");
	NullCheck.notNull(forms, "forms");
	if (forms.trim().isEmpty())
	    return;
	final Gson gson = new Gson();
	final Noun noun = gson.fromJson(forms.trim(), Noun.class);
	if (noun != null)
	    nouns.put(word, noun);
	
    }

    static private final class Cases
    {
	@SerializedName("nom")
	String nom = null;

	@SerializedName("gen")
	String gen = null;

	@SerializedName("dat")
	String dat = null;

	@SerializedName("acc")
	String acc = null;

	@SerializedName("inst")
	String inst = null;

	@SerializedName("prae")
	String prae = null;
    }

    static private final class Noun
    {
	@SerializedName("gender")
	String gender = null;

	@SerializedName("s")
	Cases singular = null;

	@SerializedName("p")
	Cases plural = null;
    }
}

