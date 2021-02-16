package com.nttdata.List;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
	
	public static void main(String[] args) {
		
		TreeMap<Integer, Student> map=new TreeMap<>();
		
		map.put(101,new Student(103, "tanu"));
		map.put(123,new Student(190, "manu"));
		map.put(323,new Student(345, "tinu"));
		map.put(303,new Student(234, "sonu"));
		
		
		for(Map.Entry  m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		if(map.containsKey(101))
		{
			System.out.println(" The value is :"+map.get(101)+"");
		}
		
	}

}
