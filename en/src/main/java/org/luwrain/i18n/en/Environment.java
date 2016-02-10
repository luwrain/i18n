
package org.luwrain.i18n.en;

import org.luwrain.os.Location;

class Environment implements org.luwrain.core.Strings
{
    @Override public String quitPopupName()
    {
	return "Quit";
    }

    @Override public String quitPopupText()
    {
	return "Are you sure you want to quit?";
    }

    @Override public String appLaunchNoEnoughMemory()
    {
	return "No enough memory for new application";
    }

    @Override public String appLaunchUnexpectedError()
    {
	return "Unexpected error while new application launch";
    }

    @Override public String appCloseHasPopup()
    {
	return "You should close all popups before closing the application";
    }

    @Override public String noCommand()
    {
	return "No selected command in the system";
    }

    @Override public String startWorkFromMainMenu()
    {
	return "Start your work from main menu";
    }

    @Override public String noLaunchedApps()
    {
	return "All applications closed";
    }

    @Override public String fontSize(int size)
    {
	return "Font size: " + size;
    }

    @Override public String openPopupName()
    {
	return "Open file";
    }

    @Override public String openPopupPrefix()
    {
	return "Enter the name of the file to open:";
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
	return "Application is blocked by opened popup";
    }

    @Override public String locationTitle(Location location)
    {
	if (location == null)
	    return null;
	switch(location.type())
	{
	case Location.ROOT:
	    return "Root directory, " + bytesNum(location.file().getFreeSpace()) + " free";
	case Location.USER_HOME:
	    return "Home directory, " + bytesNum(location.file().getFreeSpace()) + " free";
	case Location.REGULAR:
	    return "Local drive " + location.name() + ", " + bytesNum(location.file().getFreeSpace()) + " free";
	case Location.REMOTE:
	    return "Network connection " + location.name() + ", " + bytesNum(location.file().getFreeSpace()) + " free";
	case Location.REMOVABLE:
	    return "Removable storage " + location.name() + ", " + bytesNum(location.file().getFreeSpace()) + " free";
	default:
	    return "";
	}
    }

    private String bytesNum(long num)
    {
	if (num > 1024 * 1024 * 1024)
	{
	    final long g = num / (1024 * 1024 * 1024);
	    long rest = num - (g * 1024 * 1024 * 1024);
	    rest /= (102 * 1024 * 1024);
	    return g + "," + rest + "G";
	}
	if (num > 1024 * 1024)
	{
	    final long m = num / (1024 * 1024);
	    long rest = num - (m * 1024 * 1024);
	    rest /= (102 * 1024);
	    return m + "," + rest + "M";
	}
	if (num > 1024)
	{
	    final long k = num / 1024;
	    long rest = num - (k * 1024);
	    rest /= 102;
	    return k + "," + rest + "K";
	}
	return "" + num + "B";
    }
}
