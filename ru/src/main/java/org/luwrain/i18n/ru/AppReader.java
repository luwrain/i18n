
package org.luwrain.i18n.ru;

class AppReader implements org.luwrain.app.reader.Strings
{
    @Override public String appName()
    {
	return "Просмотр документов";
    }

    @Override public String tableIntroduction(int rows, int cols, String text)
    {
	return "Таблица Строк " + rows + " Столбцов " + cols + " " + text;
    }

    @Override public String tableIntroductionWithLevel(int level,
						       int rows,
						       int cols, String text)
    {
	return "Таблица уровня " + level + " Строк " + rows + " Столбцов " + cols + " " + text;
    }



    @Override public String tableCellIntroduction(int row, int col, String text)
    {
	if (col == 1)
return "Строка " + row + " " + text; else
return "Столбец " + col + " " + text;


    }

    @Override public String orderedListItemIntroduction(int index, String text)
    {
	if (index == 0)
	    return "Начало нумерованного списка " + text;
	    return "элемент списка " + index + " " + text;
    }

    @Override public String unorderedListItemIntroduction(int index, String text)
    {
	if (index == 0)
	    return "Начало ненумерованного списка " + text;
	return "Ненумерованный элемент " + text;
    }

    @Override public String paragraphIntroduction(String text)
    {
	return "Параграф " + text;
    }

    @Override public String errorOpeningFile()
    {
	return "Произошла ошибка открытия документа";
    }

    @Override public String errorFetching(String comment)
    {
	return "Доставка запрошенной страницы невозможна:" + comment;
    }

    @Override public String noContent()
    {
	return "Откройте документ при помощи контекстного меню";
    }

    @Override public String fetchingContent()
    {
	return "Идёт загрузка документа, подождите, пожалуйста";
    }
}
