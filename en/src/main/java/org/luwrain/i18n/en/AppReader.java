
package org.luwrain.i18n.en;

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

    @Override public String actionTitle(String actionName)
    {
	switch(actionName)
	{
	case "open-file":
	    return "Открыть файл";
	case "open-url":
	    return "Открыть URL";
	case "info":
	    return "Информация о документе";
	case "change-format":
	    return "Сменить формат";
	case "change-charset":
	    return "Сменить кодировку";
	case "open-in-narrator":
	    return "Открыть в Рассказчике";
	default:
	    return actionName;
	}
    }

    @Override public String infoAreaName()
    {
	return "Информация о документе";
    }

    @Override public String bookTreeRoot()
    {
	return "Книга";
    }

    @Override public String treeAreaName()
    {
	return "Разделы";
    }

    @Override public String notesAreaName()
    {
	return "Закладки";
    }

    @Override public String infoPageField(String name)
    {
	switch(name)
	{
	case "url":
	    return "URL";
	case "title":
	    return "Заголовок";
	case "ncc:files":
	    return "Файлов";
	case "ncc:multimediaType":
	    return "Тип данных";
	case "dc:creator":
	    return "Создатель";
	case "ncc:generator":
	    return "Подготовлено при помощи";
	case "dc:format":
	    return "Daisy-формат";
	case "dc:title":
	    return "Daisy-заголовок";
	case "ncc:narrator":
	    return "Чтец";
	case "ncc:sourceDate":
	    return "Дата записи";
	case "ncc:producedDate":
	    return "Дата выпуска";
	case "dc:language":
	    return "Язык";
	case "ncc:producer":
	    return "Продюсер";
	case "ncc:totalTime":
	    return "Общее время";
	case "dc:date":
	    return "Дата";
	case "dc:publisher":
	    return "Издатель";
	default:
	    return "";
	}
    }
}
