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

package org.luwrain.i18n.ru;

import java.io.*;
import java.nio.file.*;

import org.luwrain.core.NullCheck;
import org.luwrain.app.commander.operations.Operation;
//import org.luwrain.app.commander.PanelArea;

class AppCommander implements org.luwrain.app.commander.Strings
{
    @Override public String appName()
    {
	return "Обзор файлов и папок";
    }

    @Override public String leftPanelName()
    {
	return "Левая панель ";
    }

    @Override public String rightPanelName()
    {
	return "Правая панель ";
    }

    @Override public String operationsAreaName()
    {
	return "Действия";
    }

    @Override public String panelActionTitle(String actionName, boolean multiple)
    {
	switch(actionName)
	{
	case "open":
	    return "Открыть";
	case "edit-as-text":
	    return "Редактировать как текст";
	case "preview":
	    return "Просмотр";
	case "preview-another-format":
	    return "Просмотр с указанием формата";
	case "copy":
	    return "Копировать";
	case "move":
	    return "Переименовать/переместить";
	case "mkdir":
	    return "Создать каталог";
	case "delete":
	    return "Удалить";
	case "hidden-show":
	    return "Показать скрытые файлы";
	case "hidden-hide":
	    return "Не показывать скрытые файлы";
	case "info":
	    return multiple?"Информация об объектах":"Информация об объекте";
	default:
	    return actionName;
	}
    }

    @Override public String infoActionTitle(String actionName)
    {
	NullCheck.notNull(actionName, "actionName");
	switch(actionName)
	{
	case "close-info":
	    return "Закрыть просмотр информации";
	default:
	    return actionName;
	}
    }

    @Override public String copyPopupName()
    {
	return "Копирование";
    }

    @Override public String copyPopupPrefix(Path[] files)
    {
	NullCheck.notNullItems(files, "files");
	if (files.length == 1)
	    return "Копировать " + files[0].getFileName().toString() + " в:";
	return "Копировать " + numberOfItems(files.length) + " в:";
    }

    @Override public String copyOperationName(Path[] filesToCopy, Path copyTo)
    {
	NullCheck.notNull(filesToCopy, "filesToCopy");
	NullCheck.notNull(copyTo, "copyTo");
	if (filesToCopy.length == 1)
	    return "Копирование " + filesToCopy[0].getFileName().toString() + " в " + copyTo.toString();
	return "Копирование " + numberOfItems(filesToCopy.length) + " в "  + copyTo.toString();
    }

    @Override public String movePopupName()
    {
	return "Переименование/перемещение";
    }

    @Override public String movePopupPrefix(File[] files)
    {
	if (files == null)
	    throw new NullPointerException("files may not be null");
	if (files.length == 1)
	    return "Переименовать/переместить " + files[0].getName() + " в:";
	return "Переименовать/переместить " + numberOfItems(files.length) + " в:";
    }

    @Override public String moveOperationName(File[] filesToMove, File moveTo)
    {
	if (filesToMove.length == 1)
	    return "Переименование/перемещение " + filesToMove[0].getName() + " в " + moveTo.getAbsolutePath();
	return "Переименование/перемещение " + numberOfItems(filesToMove.length) + " в "  + moveTo.getAbsolutePath();
    }

    @Override public String mkdirPopupName()
    {
	return "Создание каталога";
    }

    @Override public String mkdirPopupPrefix()
    {
	return "Имя нового каталога:";
    }

    @Override public String mkdirErrorMessage()
    {
	return "Каталог по указанному пути не может быть создан";
    }

    @Override public String mkdirOkMessage(String dirName)
    {
	return "Создан " + dirName;
    }

    @Override public String delPopupName()
    {
	return "Удаление";
    }

    @Override public String delPopupText(File[] files)
    {
	if (files == null)
	    throw new NullPointerException("files may not be null");
	if (files.length == 1)
	    return "Вы действительно хотите удалить " + files[0] + "?";
	return "Вы действительно хотите удалить " + numberOfItems(files.length) + "?";
    }

    @Override public String delOperationName(File[] filesToDelete)
    {
	if (filesToDelete.length == 1)
	    return "Удаление " + filesToDelete[0].getName();
	return "Удаление " + numberOfItems(filesToDelete.length);
    }

    @Override public String operationCompletedMessage(Operation op)
    {
	switch (op.getFinishCode())
	{
	case OK:
	    return op.getOperationName() + " успешно завершено";
	case INTERRUPTED:
	    return op.getOperationName() + " отменено";
	default:
	    return op.getOperationName() + " завершено неуспешно";
	}
    }

    @Override public String operationFinishDescr(Operation op)
    {
	switch (op.getFinishCode())
	{
	case OK:
	    return "Готово: " + op.getOperationName();
	case INTERRUPTED:
	    return "Прервано: " + op.getOperationName();
	case UNEXPECTED_PROBLEM:
	    return "Неожиданная ошибка: " + op.getOperationName();
	case PROBLEM_CREATING_DIRECTORY:
	    return "Невозможно создать каталог " + op.getExtInfo() + ": " + op.getOperationName();
	case PROBLEM_READING_FILE:
	    return "Ошибка чтения файла " + op.getExtInfo() + ": " + op.getOperationName();
	case PROBLEM_WRITING_FILE:
	    return "Ошибка записи файла " + op.getExtInfo() + ": " + op.getOperationName();
	case INACCESSIBLE_SOURCE:
	    return "Содержимое недоступно для чтения:" + op.getOperationName();
	case PROBLEM_CREATING_SYMLINK:
	    return "Невозможно создать символьную ссылку" + op.getExtInfo() + ": " + op.getOperationName();
	case PROBLEM_READING_SYMLINK:
	    return "Невозможно прочитать символьную ссылку" + op.getExtInfo() + ": " + op.getOperationName();
	case PROBLEM_DELETING:
	    return "Невозможно удалить " + op.getExtInfo() + ": " + op.getOperationName();
	case DEST_EXISTS_NOT_REGULAR:
	    return "Целевой файл существует и не является обычным файлом:" + op.getExtInfo() + ": " + op.getOperationName();
	case NOT_CONFIRMED_OVERWRITE:
	    return "Перезапить не подтверждена:" + op.getExtInfo() + ": " + op.getOperationName();
	case DEST_EXISTS_NOT_DIR:
	    return "Целевой файл существует и не является каталогом:" + op.getExtInfo() + ": " + op.getOperationName();
	case DEST_EXISTS:
	    return "Целевой файл существует:" + op.getExtInfo() + ": " + op.getOperationName();
	default:
	    return "Неизвестная ошибка: " + op.getOperationName();
	}
    }

    @Override public String notAllOperationsFinished()
    {
	return "Приложение не может быть закрыто при выполняющихся действиях";
    }

    @Override public String cancelOperationPopupName()
    {
	return "Отмена действия";
    }

    @Override public String cancelOperationPopupText(Operation op)
    {
	return "Вы действительно хотите отменить действие \"" + op.getOperationName() + "\"?";
    }

    private String numberOfItems(int num)
    {
	return "" + num + " " + Lang.afterNum(num, "элементов", "элемент", "элемента");
    }

    private String numberOfFiles(int num)
    {
	return "" + num + " " + Lang.afterNum(num, "файлов", "файл", "файла");
    }

    @Override public String bytesNum(long num)
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

    @Override public String infoAreaName()
    {
 return "Расширенная информация";
    }
}
