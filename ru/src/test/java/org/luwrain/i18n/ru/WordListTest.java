/*
   Copyright 2012-2020 Michael Pozhidaev <msp@luwrain.org>

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

import org.junit.*;

import org.luwrain.core.*;

public class WordListTest extends Assert
{
    @Test public void century() throws Exception
    {
	try {
	final WordList wordList = new WordList();
	wordList.loadFromResource();
	final RuWord[] w = wordList.findWord("век");
	assertNotNull(w);
	assertEquals(w.length, 1);
	final RuWord ww = w[0];
	assertNotNull(ww);
	System.out.println(ww.getLemma());
	}
	catch(Exception e)
	{
	    e.printStackTrace();
	}
    }
}
