package com.jsp.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList<>();
		
		for(int i=10; i<=20; i++) {
			list.add(i);
		}
	
//		Iterator i = list.iterator();
//		while(i.hasNext()) {
//			Integer n = (Integer)i.next();
//			if(n % 2 != 0) {
//				i.remove();
//			}
//		}
//		System.out.println(list);
		
		ListIterator ls = list.listIterator(list.size());
		
		while(ls.hasPrevious()) {
			System.out.println(ls.previous());
		}
		
	}

}
