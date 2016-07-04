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

import org.luwrain.core.*;

class Lang implements org.luwrain.core.Lang
{
    private final ResourceConstants constants = new ResourceConstants();

    @Override public String getStaticStr(String id)
    {
	NullCheck.notNull(id, "id");
	final String value = constants.value("static." + id); 
	return value != null?value.trim():"#Неизвестный идентификатор строки: \'" + id + "\'#";
    }

    @Override public String pastTimeBrief(java.util.Date date)
    {
	return new DateUtils().passedTimeBrief(date) + " назад";
    }


    @Override public String hasSpecialNameOfChar(char ch)
    {
	if (Character.isDigit(ch) || Character.isLetter(ch))
	    return null;
	switch(ch)
	{
	case '\r':
return "Символ переноса строки в стиле Windows";
	case '—':
	    return "длинное тире";
	case '~':
	    return "тильда";
	case '`':
	    return "обратный апостроф";
	case '!':
	    return "восклицательный знак";
	case '@':
	    return "собачка";
	case '#':
	    return "диез";
	case '$':
	    return "доллар";
	case '%':
	    return "процент";
	case '^':
	    return "знак степени";
	case '&':
	    	    return "амперсант";
	case '*':
	    return "звезда";
	case '(':
	    return "левая круглая скобка";
	case ')':
	    return "правая круглая скобка";
	case '_':
	    return "знак подчёркивания";
	case '-':
	    return "дефис";
	case '+':
	    return "плюс";
	case '=':
	    return "равно";
	case '[':
	    return "левая квадратная скобка";
	case ']':
	    return "правая квадратная скобка";
	case '{':
	    return "левая фигурная скобка";
	case '}':
	    return "правая фигурная скобка";
	case ':':
    return "двоеточие";
	case ';':
	    return "точка с запятой";
	case '\\':
	    return "обратная наклонная черта";
	case '|':
	    return "вертикальная черта";
	case '\'':
	    return "апостроф";
	case '\"':
	    return "двойная кавычка";
	case '/':
	    return "прямая наклонная черта";
	case '?':
	    return "вопросительный знак";
	case '<':
	    return "меньше";
	case '>':
	    return "больше";
	case ',':
	    return "запятая";
	case '.':
	    return "точка";
	default:
	    return Character.getName(ch);
	}
    }

    static String afterNum(int num,
			   String afterZero,
			   String afterOne,
			   String afterTwo)
    {
	if (num < 0)
	    throw new IllegalArgumentException("num may not be negative");
	if (num == 0 || num % 10 == 0)
	    return afterZero;
	if (num % 100 >= 11 && num % 100 <= 19)
	    return afterZero;
	if (num % 10 == 1)
	    return afterOne;
	if (num % 10 >= 2 && num % 10 < 4)
	    return afterTwo;
	return afterZero;
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


}
