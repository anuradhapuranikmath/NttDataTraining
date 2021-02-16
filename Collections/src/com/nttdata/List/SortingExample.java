package com.nttdata.List;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList();
		list.add("Hello");
		list.add("Good");
		list.add("Morning");
		
		Collections.sort(list);
		
		for (String string : list) {
			System.out.println(string);
		}
		
	}

}
