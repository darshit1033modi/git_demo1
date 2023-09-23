package com.jsp.linkedlist;

public class Test {
	
	public static void main(String[] args) {
		
		Linkedlist list = new Linkedlist();
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(50);
		list.add(70);
		list.add(1, 30);
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

}
