package com.jsp.stack;

public class Test {
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		s.push(10);
		s.push(30);
		s.push(15);
		s.push(50);
		s.push(40);
		
		while(!s.isEmpty()) System.out.println(s.pop());
		
	}

}
