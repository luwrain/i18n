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
import com.google.gson.annotations.*;

import org.luwrain.i18n.*;

public class WordsList
{
    private final Map<String, Noun> nouns = new HashMap();


    static protected final class Cases
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

    static protected final class Noun
    {
	@SerializedName("gender")
	String gender = null;

	@SerializedName("s")
	Cases singular = null;

	@SerializedName("p")
	Cases plural = null;
    }
}
