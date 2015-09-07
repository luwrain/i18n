
package org.luwrain.i18n.ru;

class AppWiki implements org.luwrain.app.wiki.Strings
{
    @Override public String appName()
    {
	return "Поиск в Википедии";
    }

    @Override public String querySuccess(int count)
    {
	return "Найдено статей: " + count;
    }

    @Override public String searchEn()
    {
	return "Поиск в английском языковом разделе";
    }

    @Override public String searchRu()
    {
	return "Поиск в русском языковом разделе";
    }

    @Override public String errorSearching()
    {
	return "При обработке запроса произошла ошибка";
    }

    @Override public String nothingFound()
    {
	return "Ничего не найдено";
    }

    @Override public String queryResults()
    {
	return "Результаты поиска";
    }

    @Override public String queryPopupName()
    {
	return "Поиск в Википедии";
    }

    @Override public String queryPopupPrefix()
    {
	return "Выражения для поиска:";
    }
}
