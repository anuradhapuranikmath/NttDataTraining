package com.nttdata.List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetExample {
	
	
	public static void main(String[] args) {
		TreeSet<Student> hasSet=new TreeSet<>();
		hasSet.add(new Student(103, "manu"));
		hasSet.add(new Student(103, "tanu"));
		hasSet.add(new Student(345, "tinu"));
		hasSet.add(new Student(234, "sonu"));
		hasSet.add(new Student(234, "sonu"));
		
		Iterator<Student> itr=hasSet.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
