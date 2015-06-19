/*
   Copyright 2012-2015 Michael Pozhidaev <michael.pozhidaev@gmail.com>

   This file is part of the Luwrain.

   Luwrain is free software; you can redistribute it and/or
   modify it under the terms of the GNU General Public
   License as published by the Free Software Foundation; either
   version 3 of the License, or (at your option) any later version.

   Luwrain is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
   General Public License for more details.
*/

package org.luwrain.i18n.en;

class Wiki implements org.luwrain.app.wiki.Strings
{
    @Override public String appName()
    {
	return "Search in Wikipedia";
    }

    @Override public String querySuccess(int count)
    {
	return "Articles found: " + count;
    }

    @Override public String searchEn()
    {
	return "Search in English";
    }

    @Override public String searchRu()
    {
	return "Search in Russian";
    }

    @Override public String errorSearching()
    {
	return "Error occurred while searching";
    }

    @Override public String nothingFound()
    {
	return "Nothing found";
    }

    @Override public String queryResults()
    {
	return "Search result";
    }

    @Override public String queryPopupName()
    {
	return "Search in Wikipedia";
    }

    @Override public String queryPopupPrefix()
    {
	return "Phrase to search:";
    }
}
