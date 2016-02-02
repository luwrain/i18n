
package org.luwrain.i18n.ru;

class AppReader implements org.luwrain.app.reader.Strings
{
    @Override public String appName()
    {
	return "Просмотр документов";
    }

    @Override public String sectionIntroduction(int level, String text)
    {
	return text + " заголовок уровня " + level;
    }

    @Override public String tableIntroduction(int rows, int cols, String text)
    {
	return text + " Таблица Строк " + rows + " Столбцов " + cols;
    }

    @Override public String tableIntroductionWithLevel(int level,
						       int rows, int cols, String text)
    {
	return text + " Таблица уровня " + level + " Строк " + rows + " Столбцов " + cols;
    }

    @Override public String tableCellIntroduction(int row, int col, String text)
    {
	if (col == 1)
return text + " Строка " + row; else
return text + " Столбец " + col;
    }

    @Override public String orderedListItemIntroduction(int index, String text)
    {
	if (index == 0)
	    return text + " Начало нумерованного списка ";
	return text + " элемент списка " + (index + 1);
    }

    @Override public String unorderedListItemIntroduction(int index, String text)
    {
	/*
	if (index == 0)
	    return text + " Начало ненумерованного списка ";
	return text + "Ненумерованный элемент";
	*/
	return text;
    }

    @Override public String paragraphIntroduction(String text)
    {
	return "Параграф " + text;
    }

    @Override public String noContent(boolean fetching)
    {
	return fetching?"Идёт загрузка данных. Пожалуйста, подождите.":"Откройте документ при помощи контекстного меню";
    }

    @Override public String fetching(String url)
    {
	return "Доставка " + url;
    }

    @Override public String badUrl(String url)
    {
	return "Неверно оформленная ссылка:" + url;
    }

    @Override public String linkPrefix()
    {
	return "Ссылка";
    }

    @Override public String contextMenuOpenInNarrator()
    {
	return "Открыть в рассказчике";
    }

    @Override public String infoAreaName()
    {
	return "Информация о документе";
    }
}
