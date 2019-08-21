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

public abstract class AbstractTokenizer
{
    final List<Token> output = new LinkedList();

    abstract char getCh();
    abstract public boolean hasCh();
    abstract public void backCh(char ch);

    public void tokenize()
    {
	while (hasCh())
	{
	    final char ch = getCh();
	    if (ch >= '0' && ch <= '9')
		onNumToken(ch); else
		if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
		    onLatinToken(ch); else
		    if ((ch >= 'а' && ch <= 'я') || (ch >= 'А' && ch <= 'Я'))
			onCyrilToken(ch); else
			if (Character.isSpace(ch))
			    onSpaceToken(ch); else
			    onPuncToken(ch);
	}
    }

    private void onNumToken(char ch)
    {
	final StringBuilder b = new StringBuilder();
	b.append(ch);
	while(hasCh())
	{
	    final char nextCh = getCh();
	    if (nextCh >= '0' && nextCh <= '9')
	    {
		b.append(nextCh);
		continue;
	    }
	    backCh(nextCh);
	    break;
	}
	output.add(new Token(Token.Type.NUM, new String(b)));
    }

    private void onLatinToken(char ch)
    {
	final StringBuilder b = new StringBuilder();
	b.append(ch);
	while(hasCh())
	{
	    final char nextCh = getCh();
	    if ((nextCh >= 'a' && nextCh <= 'z') || (nextCh >= 'A' && nextCh <= 'Z'))
	    {
		b.append(nextCh);
		continue;
	    }
	    backCh(nextCh);
	    break;
	}
	output.add(new Token(Token.Type.LATIN, new String(b)));
    }
    
    private void onCyrilToken(char ch)
    {
	final StringBuilder b = new StringBuilder();
	b.append(ch);
	while(hasCh())
	{
	    final char nextCh = getCh();
	    if ((nextCh >= 'а' && nextCh <= 'я') || (nextCh >= 'А' && nextCh <= 'Я'))
	    {
		b.append(nextCh);
		continue;
	    }
	    backCh(nextCh);
	    break;
	}
	output.add(new Token(Token.Type.CYRIL, new String(b)));
    }

    private void onSpaceToken(char ch)
    {
	final StringBuilder b = new StringBuilder();
	b.append(ch);
	while(hasCh())
	{
	    final char nextCh = getCh();
	    if (Character.isSpace(nextCh))
	    {
		b.append(nextCh);
		continue;
	    }
	    backCh(nextCh);
	    break;
	}
	output.add(new Token(Token.Type.SPACE, new String(b)));
    }

    private void onPuncToken(char ch)
    {
	output.add(new Token(Token.Type.PUNC, new Character(ch).toString()));
    }
}
