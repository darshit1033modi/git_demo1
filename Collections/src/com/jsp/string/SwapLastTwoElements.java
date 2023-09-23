package com.jsp.string;

public class SwapLastTwoElements {
	
	public static void main(String[] args) {
		
		String s = "ababcd";
		String s1 = "";
		
		char l = s.charAt(s.length()-1);
		char sl = s.charAt(s.length()-2);
		
		for(int i=0; i<s.length()-2; i++) {
			char ch = s.charAt(i);
			s1 += ch+"";
		}
		s1 += l + "" + sl + "";
		System.out.println(s1);
	}

}
