package com.capgemini.client;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.capgemini.model.Student;


public class ClientTest {

	public static void main(String[] args) {
		Map<Integer, Student> map=new HashMap<Integer, Student>();
		map.put(321, new Student("Urmi", 22));
		map.put(879, new Student("Juin", 23));
		map.put(564, new Student("Pramita", 28));
		
		/*Set<Entry<Integer,Student>> entrySet=map.entrySet();
		for(Entry<Integer, Student> entry:entrySet)
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}*/
		
		map.forEach((k,v)->System.out.println(k+"\t"+v));
		
		
		
		
	}

}
