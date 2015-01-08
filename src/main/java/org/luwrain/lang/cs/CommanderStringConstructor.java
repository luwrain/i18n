/*
   Copyright 2015 Mgr. Janusz Chmiel <chmiel@deep.cz>
   Copyright 2012-2014 Michael Pozhidaev <msp@altlinux.org>

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

package org.luwrain.langs.en;

import java.io.*;
import java.util.*;
import org.luwrain.core.Langs;
import org.luwrain.app.commander.DirItem;
import org.luwrain.app.commander.PanelArea;

class CommanderStringConstructor implements org.luwrain.app.commander.StringConstructor
{
    public String appName()
    {
	return "Zpr�vce soubor�";
    }

    public String leftPanelName(String path)
    {
	return "Lev� panel " + path;
    }

    public String rightPanelName(String path)
    {
	return "Prav� panel " + path;
    }

    public String tasksAreaName()
    {
	return "Seznam �loh";
    }

    public String noItemsAbove()
    {
	return "Na ho�e nejsou ��dn� polo�ky";
    }

    public String noItemsBelow()
    {
	return "Dole nejsou ��dn� polo�ky";
    }

    public String inaccessibleDirectoryContent()
    {
	return "Obsah adres��e je nep��stupn�";
    }

    public String rootDirectory()
    {
	return "Ko�enov� adres��";
    }

    public String dirItemIntroduction(DirItem item, boolean brief)
    {
	if (item == null)
	    return "";
	String text = item.getFileName();
	if (text.isEmpty())
	    return Langs.staticValue(Langs.EMPTY_LINE);
	if (text.equals(PanelArea.PARENT_DIR))
	    return "Nad�azen� adres��";
	if (!brief)
	{
	    if (item.getType() == DirItem.DIRECTORY)
	    {
		if (item.isSelected())
		    text = "Zvolen� adres��" + text; else
		    text = " "Adres�� + text;
	    } else
		if (item.selected)
		    text = "Zvolen� adres��" + text;
	}
	return text;
    }

    public String done()
    {
	return "Hotovo";
    }

    public String failed()
    {
	return "Chyba";
    }

    public String copying(File[] files)
    {
	if (files == null)
	    return "";
	if (files.length == 1)
	    return "Kop�ruji soubory" + files[0];
	return "Kop�ruji " + files + " polo�ka(s)";
    }

    public String copyPopupName()
    {
	return "Kop�rovat";
    }

    public String copyPopupPrefix(File[] files)
    {
	if (files == null || files.length < 1)
	    return "";
	if (files.length == 1)
	    return "Kop�ruji \"" + files[0].getName() + "\" to:";
	return "Kop�ruji " + files.length + " polo�ky do:";
    }

    public String movePopupName()
    {
	return "P�esunout/p�ejmenovat";
    }

    public String movePopupPrefix(File[] files)
    {
	if (files == null || files.length < 1)
	    return "";
	if (files.length == 1)
	    return "P�esunout/p�ejmenovat /remove \"" + files[0].getName() + "\" to:";
	return "P�esunuji " + files.length + " items to:";
    }

    public String mkdirPopupName()
    {
	return "Vytvo�it nov� adres��";
    }

    public String mkdirPopupPrefix()
    {
	return "Jm�no nov�ho adres��e";
    }

    public String delPopupName()
    {
	return "Vymazat";
    }

    public String delPopupPrefix(File[] files)
    {
	if (files == null || files.length < 1)
	    return "";
	if (files.length == 1)
	{
	    if (files[0].isDirectory())
		return "Jste si jist/�, �e si p�ejete vymazat adres�� \"" + files[0].getName() + "\"?";
	    return "Jste si jist/�, �e si p�ejete smazat soubor \"" + files[0].getName() + "\"?";
	}
	return "Jste si jist/�, �e si p�ejete smazat soubory" + files.length + " items?";
    }
}
