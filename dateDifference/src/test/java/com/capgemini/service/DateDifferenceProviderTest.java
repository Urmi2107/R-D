package com.capgemini.service;

import org.junit.Assert;
import org.junit.Test;

import com.capgemini.pojo.MyDate;

public class DateDifferenceProviderTest {
	@Test
	public void getDateDifferenceTest_1()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(06, 04, 2011));
		
		Assert.assertEquals(0, result);
	}
	@Test
	public void getDateDifferenceTest_2()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(18, 04, 2011));
		
		Assert.assertEquals(12, result);
	}
	@Test
	public void getDateDifferenceTest_3()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(18, 05, 2011));
		
		Assert.assertEquals(42, result);
	}
	@Test
	public void getDateDifferenceTest_4()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(18, 06, 2011));
		
		Assert.assertEquals(73, result);
	}
	@Test
	public void getDateDifferenceTest_5()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(18, 12, 2011));
		
		Assert.assertEquals(256, result);
	}
	@Test
	public void getDateDifferenceTest_6()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(18, 12, 2012));
		
		Assert.assertEquals(622, result);
	}
	@Test
	public void getDateDifferenceTest_7()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(18, 12, 2013));
		
		Assert.assertEquals(987, result);
	}
	@Test
	public void getDateDifferenceTest_8()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(18, 12, 2113));
		
		Assert.assertEquals(37511, result);
	}
	@Test
	public void getDateDifferenceTest_9()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(18, 12, 2413));
		
		Assert.assertEquals(147084, result);
	}
	@Test
	public void getDateDifferenceTest_10()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06, 04, 2011),new MyDate(18, 12, 2813));
		
		Assert.assertEquals(293181, result);
	}
	@Test
	public void getDateDifferenceTest_11()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06, 01, 2011),new MyDate(06, 03, 2011));
		
		Assert.assertEquals(59, result);
	}
	@Test
	public void getDateDifferenceTest_12()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06, 01, 2012),new MyDate(06, 03, 2012));
		
		Assert.assertEquals(60, result);
	}
	@Test
	public void getDateDifferenceTest_13()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06, 02, 2012),new MyDate(06, 03, 2012));
		
		Assert.assertEquals(29, result);
	}
	@Test
	public void getDateDifferenceTest_14()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(22, 01, 2012),new MyDate(15, 11, 2012));
		
		Assert.assertEquals(298, result);
	}
	@Test
	public void getDateDifferenceTest_15()
	{
		long result=DateDifferenceProvider.getDateDifference(new MyDate(06, 02, 2012),new MyDate(06, 12, 2012));
		
		Assert.assertEquals(304, result);
	}
}
