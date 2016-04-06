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

import java.util.Properties;
import java.net.URL;
import java.io.*;

class ResourceConstants
{
    static private final String RESOURCE_PATH = "org.luwrain.i18n.en/constants.properties";

    private final Properties properties = new Properties();

    ResourceConstants()
    {
	URL url = ClassLoader.getSystemResource(RESOURCE_PATH);
	try {
	    properties.load(new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8")));
	}
	catch (IOException e)
	{
	    e.printStackTrace();
	    throw new IllegalArgumentException("No resource file " + RESOURCE_PATH);//FIXME:Maybe there is a better exception type
	}
    }

    String value(String name)
    {
	final String v = properties.getProperty(name);
	if (v == null)
	    return null;
	return v.trim();
    }
};
