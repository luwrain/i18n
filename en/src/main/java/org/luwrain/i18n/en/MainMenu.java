/*
   Copyright 2012-2015 Michael Pozhidaev <msp@altlinux.org>

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

import java.util.*;

class MainMenu implements org.luwrain.mainmenu.Strings
{
    @Override public String areaName()
    {
	return "Main menu";
        }

    @Override public String currentDateTime()
    {
	Calendar c = new GregorianCalendar();
	String value = "";
	value += withZeroes(c.get(Calendar.HOUR_OF_DAY), 2);
	value += ":";
	value += withZeroes(c.get(Calendar.MINUTE), 2);
	value += ", ";
	value += dayOfWeek(c.get(Calendar.DAY_OF_WEEK));
	value += ", ";
	value += month(c.get(Calendar.MONTH));
	value += " ";
	value += c.get(Calendar.DAY_OF_MONTH);
	return value;
    }

    private String dayOfWeek(int index)
    {
	switch(index)
	{
	case 1:
	    return "Sunday";
	case 2:
	    return "Monday";
	case 3:
	    return "Tuesday";
	case 4:
	    return "Wednesday";
	case 5:
	    return "Thursday";
	case 6:
	    return "Friday";
	case 7:
	    return "Saturday";
	}
	return null;
    }

    private String month(int index)
    {
	switch(index)
	{
	case 0:
	    return "January";
	case 1:
	    return "February";
	case 2:
	    return "March";
	case 3:
	    return "April";
	case 4:
	    return "May";
	case 5:
	    return "June";
	case 6:
	    return "July";
	case 7:
	    return "August";
	case 8:
	    return "September";
	case 9:
	    return "October";
	case 10:
	    return "November";
	case 11:
	    return "December";
	}
	return null;
    }

    private String withZeroes(int value, int len)
    {
	String s = "";
	s += value;
	while(s.length() < len)
	    s = "0" + s;
	return s;
    }

    @Override public String noCommand()
    {
	return "No command for chosen main menu item";
    }
}
