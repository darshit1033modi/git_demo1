package com.jsp.string;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String s = "language";
		String s1 = "";
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(!s1.contains(ch+"")) {
				s1 += ch;
			}
		}
		System.out.println(s1);
	}

}
