package com.capgemini.myInterfaceImpl;

import java.util.Collections;
import java.util.List;

import com.capgemini.myInterface.MyInterface;

public class MyClass implements MyInterface{

	@Override
	public Integer getMaximum(List<Integer> numberList) {
		Integer max=Collections.max(numberList);
		return max;
	}

}
