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

import org.luwrain.hardware.Partition;
import org.luwrain.core.NullCheck;

class Environment implements org.luwrain.core.Strings
{
    @Override public String pastTimeBrief(java.util.Date date)
    {
	return "fixme ";
    }

    @Override public String noClipboardContent()
    {
	return "No data in clipboard";
    }

    @Override public String regionPointSet()
    {
	return "Mark set";
    }

    @Override public String linesCopied(int linesNum)
    {
	if (linesNum < 1)
	    return "No copied lines";
	if (linesNum == 1)
	    return "One line copied";
	return "Lines copied: " + linesNum;
    }

    @Override public String linesInserted(int linesNum)
    {
	if (linesNum < 1)
	    return "No copied lines";
	if (linesNum == 1)
	    return "One line pasted";
	return "Lines pasted: " + linesNum;
    }

    @Override public String quitPopupName()
    {
	return "Exiting LUWRAIN";
    }

    @Override public String quitPopupText()
    {
	return "Are you sure you want to exit LUWRAIN?";
    }

    @Override public String appLaunchNoEnoughMemory()
    {
	return "No enough memory to run an application";
    }

    @Override public String appLaunchUnexpectedError()
    {
	return "Launching of the application is interrupted by an internal application error";
    }

    @Override public String appCloseHasPopup()
    {
	return "You should close all application popups before closing the application";
    }

    @Override public String noCommand()
    {
	return "The command you choose isn\t accessible in the system";
    }

    @Override public String startWorkFromMainMenu()
    {
	return "Start you work from the main menu";
    }

    @Override public String noLaunchedApps()
    {
	return "All applications closed";
    }

    @Override public String fontSize(int size)
    {
	return "Font sizeп: " + size;
    }

    @Override public String openPopupName()
    {
	return "Open a file";
    }

    @Override public String openPopupPrefix()
    {
	return "Enter name of the file to open:";
    }

    @Override public String commandPopupName()
    {
	return "Run a command";
    }

    @Override public String commandPopupPrefix()
    {
	return "Command:";
    }

@Override public String appBlockedByPopup()
    {
	return "The application is inaccessible due to opened popup area";
    }

    @Override public String partitionTitle(Partition p)
    {
	NullCheck.notNull(p, "p");
	switch(p.type())
	{
	case Partition.ROOT:
	    return "Root directory, " + bytesNum(p.file().getFreeSpace()) + " free";
	case Partition.USER_HOME:
	    return "Home directory, " + bytesNum(p.file().getFreeSpace()) + " free";
	case Partition.REGULAR:
	    return "Local partition " + p.name() + ", " + bytesNum(p.file().getFreeSpace()) + " free";
	case Partition.REMOTE:
	    return "Network drive " + p.name() + ", " + bytesNum(p.file().getFreeSpace()) + " free";
	case Partition.REMOVABLE:
	    return "Removable media " + p.name() + ", " + bytesNum(p.file().getFreeSpace()) + " free";
	default:
	    return "";
	}
    }

    @Override public String uniRefPrefix(String uniRefType)
    {
	switch(uniRefType)
	{
	case "file":
	    return "File";
	case "command":
	    return "Command";
	default:
	    return "#Unknown uniRef type \"" + uniRefType + "\"#";
	}
    }

    @Override public String linesDeleted()
    {
	return "Deleted";
    }

    @Override public String noReadingChannel()
    {
	return "No speech output for reading";
    }

        private String bytesNum(long num)
    {
	if (num > 1024 * 1024 * 1024)
	{
	    final long g = num / (1024 * 1024 * 1024);
	    long rest = num - (g * 1024 * 1024 * 1024);
	    rest /= (102 * 1024 * 1024);
	    return g + "," + rest + "ГБ";
	}
	if (num > 1024 * 1024)
	{
	    final long m = num / (1024 * 1024);
	    long rest = num - (m * 1024 * 1024);
	    rest /= (102 * 1024);
	    return m + "," + rest + "МБ";
	}
	if (num > 1024)
	{
	    final long k = num / 1024;
	    long rest = num - (k * 1024);
	    rest /= 102;
	    return k + "," + rest + "КБ";
	}
	return "" + num + "Б";
    }

    @Override public String mainMenuName()
    {
	return "Main menu";
    }

    @Override public String mainMenuSection(String sect)
    {
	switch(sect)
	    {
	    case "luwrain-main-menu-internet":
		return "Internet";
			    case "luwrain-main-menu-doc":
				return "Books and documents";
					    case "luwrain-main-menu-tools":
						return "Tools and accessories";
					    case "luwrain-main-menu-exiting":
						return "Exiting";
	    default:
		return sect;
	    }
    }

    @Override public String contextMenuName()
    {
	return "Context menu";
    }
}
