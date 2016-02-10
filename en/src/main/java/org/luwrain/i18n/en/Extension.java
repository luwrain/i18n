
package org.luwrain.i18n.en;

import org.luwrain.core.*;

public class Extension extends org.luwrain.core.extensions.EmptyExtension
{
    @Override public void i18nExtension(Luwrain luwrain, I18nExtension i18nExt)
    {
	i18nExt.addLang("en", new org.luwrain.i18n.en.Lang());
	i18nExt.addCommandTitle("en", "quit", "Quit");
	i18nExt.addCommandTitle("en", "shutdown", "Shutdown");

	i18nExt.addStrings("en", "luwrain.environment", new Environment());
	i18nExt.addStrings("en", "main-menu", new MainMenu());

	i18nExt.addStrings("en", "luwrain.commander", new Commander());
	i18nExt.addStrings("en", "luwrain.fetch", new Fetch());
	i18nExt.addStrings("en", "luwrain.news", new News());
	i18nExt.addStrings("en", "luwrain.twitter", new Twitter());
	i18nExt.addStrings("en", "luwrain.notepad", new Notepad());

	i18nExt.addStrings("en", "luwrain.reader", new Reader());
	i18nExt.addStrings("en", "luwrain.wiki", new Wiki());


    }
}
