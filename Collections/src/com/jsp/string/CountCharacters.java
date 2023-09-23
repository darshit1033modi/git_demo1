package com.jsp.string;

public class CountCharacters {
	
	public static void main(String[] args) {
		
		String s = "java";
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			count++;
		}
		System.out.println(count);
	}

}
