package com.capgemini.service;

import com.capgemini.pojo.MyDate;

public class DateDifferenceProvider {
	private static final int DAY_IN_YEAR=365;
	private static final int DAY_IN_LEAPYEAR=366;
	private static final int FEB=2;
	
	private static final int DAY_IN_JAN=31;
	private static final int DAY_IN_FEB=28;
	private static final int DAY_IN_MAR=31;
	private static final int DAY_IN_APR=30;
	private static final int DAY_IN_MAY=31;
	private static final int DAY_IN_JUN=30;
	private static final int DAY_IN_JUL=31;
	private static final int DAY_IN_AUG=31;
	private static final int DAY_IN_SEPT=30;
	private static final int DAY_IN_OCT=31;
	private static final int DAY_IN_NOV=30;
	private static final int DAY_IN_DEC=31;
	
	private static final int DAYS[]={DAY_IN_JAN,DAY_IN_FEB,DAY_IN_MAR,DAY_IN_APR,DAY_IN_MAY,DAY_IN_JUN,DAY_IN_JUL,DAY_IN_AUG,DAY_IN_SEPT,DAY_IN_OCT,DAY_IN_NOV,DAY_IN_DEC};
	
	public static int getDateDifference(MyDate startDate,MyDate endDate)
	{
		if(sameDay(startDate, endDate) && sameMonth(startDate, endDate) && sameYear(startDate, endDate))
		{
			return 0;
		}
		else if(sameMonth(startDate, endDate) && sameYear(startDate, endDate))
		{
			return endDate.getDd()-startDate.getDd();
		}
		else if(sameYear(startDate, endDate) && !sameMonth(startDate, endDate))
		{
			return remainingDaysInMonth(startDate)+intervingDaysInMonth(startDate, endDate)+leadingDaysInMonth(endDate);
		}
		else
		{
			return remainingDaysInYear(startDate)+intervingDaysInYear(startDate, endDate)+leadingDaysInYear(endDate);
		}
		
	}
	private static int remainingDaysInYear(MyDate startDate) {
		
		int countDaysInYear=remainingDaysInMonth(startDate);
		for(int index=startDate.getMm()+1;index<DAYS.length;index++)
		{
			if(isFebruary(index) && leapYear(startDate.getYyyy()))
					countDaysInYear+=DAYS[index-1]+1;
			else
				countDaysInYear+=DAYS[index-1];
		}
		return countDaysInYear;
	}
	private static int intervingDaysInYear(MyDate startDate, MyDate endDate) {
		
		int countDaysInMonth=0;
		for(int yearIndex=startDate.getYyyy()+1;yearIndex<endDate.getYyyy();yearIndex++)
		{
			if(leapYear(yearIndex))
				countDaysInMonth+=DAY_IN_LEAPYEAR;
			else
				countDaysInMonth+=DAY_IN_YEAR;
		}
			
		return countDaysInMonth;
	
	}
	private static int leadingDaysInYear(MyDate endDate) 
	{
		int countLeadingDays=0;
		for(int index=0;index<endDate.getMm();index++)
		{
			if(isFebruary(index) && leapYear(endDate.getYyyy()))
			countLeadingDays+=DAYS[index]+1;
			else
				countLeadingDays+=DAYS[index];
		}
		countLeadingDays+=leadingDaysInMonth(endDate);
		return countLeadingDays;
	}
	private static int leadingDaysInMonth(MyDate endDate) 
	{
		
		return endDate.getDd();
	}
	private static int intervingDaysInMonth(MyDate startDate, MyDate endDate) 
	{
	
		int countDaysInMonth=0;
		for(int monthIndex=startDate.getMm()+1;monthIndex<endDate.getMm();monthIndex++)
		{
			if(isFebruary(monthIndex) && leapYear(endDate.getYyyy()))
				countDaysInMonth+=DAYS[monthIndex-1]+1;
			else	
			countDaysInMonth+=DAYS[monthIndex-1];
		}
		return countDaysInMonth;
	}
	private static int remainingDaysInMonth(MyDate startDate) 
	{
		if(isFebruary(startDate.getMm()) && leapYear(startDate.getYyyy()))
			return DAYS[startDate.getMm()-1]+1-startDate.getDd();
		else
			return DAYS[startDate.getMm()-1]-startDate.getDd();
	}
	private static boolean sameDay(MyDate startDate,MyDate endDate)
	{
		if(endDate.getDd()==startDate.getDd())
		{
			return true;
		}
		return false;
	}
	private static boolean sameMonth(MyDate startDate,MyDate endDate)
	{
		if(endDate.getMm()==startDate.getMm())
		{
			return true;
		}
		return false;
	}
	private static boolean sameYear(MyDate startDate,MyDate endDate)
	{
		if(endDate.getYyyy()==startDate.getYyyy())
		{
			return true;
		}
		return false;
	}
	private static boolean isFebruary(int month)
	{
		if(month==FEB)
			return true;
		else
			return false;
	}
	private static boolean leapYear(int yearIndex)
	{
		boolean leap = false;
        if(yearIndex % 4 == 0)
        {
            if( yearIndex % 100 == 0)
            {
             if ( yearIndex % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            else
                leap = true;
        }
        else
            leap = false;
	
        return leap;
	}
}
