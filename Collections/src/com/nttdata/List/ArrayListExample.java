package com.nttdata.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		LinkedList<Student> arraylist=new LinkedList<>();
		Student s1=new Student(101,"anu");
		arraylist.add(s1);
		arraylist.add(new Student(103, "tanu"));
		arraylist.add(new Student(190, "manu"));
		arraylist.add(new Student(345, "tinu"));
		arraylist.add(new Student(234, "sonu"));
		
		arraylist.add(2, new Student(23, "monu"));
	   // Collections.sort(arraylist);
		
		System.out.println("Sorting based on Id");
		Collections.sort(arraylist, new SortById());
		ListIterator<Student> itr=arraylist.listIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("==========================================================================================");
		System.out.println(" Sorting based on Name");
		
		Collections.sort(arraylist, new SortByName());
        ListIterator<Student> itr1=arraylist.listIterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}  
		
	}

}
