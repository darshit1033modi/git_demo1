package com.jsp.string;

public class Test {
	
	public static void main(String[] args) {
		
		String s = "KNOWLEDGE";
		String s1 = "";
		
		for(int i=s.length()/2; i<s.length(); i++) {
			char ch = s.charAt(i);
			s1 += ch+"";
		}
		for(int i=(s.length()/2)-1; i>=0; i--) {
			char ch = s.charAt(i);
			s1 += ch+"";
		}
		System.out.println(s1);
	}

}
