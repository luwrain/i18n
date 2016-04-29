/*
   Copyright 2012-2015 Michael Pozhidaev <michael.pozhidaev@gmail.com>

   This file is part of the LUWRAIN.

   LUWRAIN is free software; you can redistribute it and/or
   modify it under the terms of the GNU General Public
   License as published by the Free Software Foundation; either
   version 3 of the License, or (at your option) any later version.

   LUWRAIN is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
   General Public License for more details.
*/

package org.luwrain.i18n.en;

class AppWiki implements org.luwrain.app.wiki.Strings
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
	return "Search in English Wikipedia";
    }

    @Override public String searchRu()
    {
	return "Search in Russian Wikipedia";
    }

    @Override public String errorSearching()
    {
	return "Unable to perform a request";
    }

    @Override public String nothingFound()
    {
	return "Nothing found";
    }

    @Override public String queryResults()
    {
	return "Search results";
    }

    @Override public String queryPopupName()
    {
	return "Search in Wikipedia";
    }

    @Override public String queryPopupPrefix()
    {
	return "Keywords to search:";
    }

    @Override public String noContent()
    {
	return "Start search in Wikipedia with the context menu";
    }
}
