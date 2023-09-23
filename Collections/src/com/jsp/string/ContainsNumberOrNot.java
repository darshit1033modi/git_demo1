package com.jsp.string;

public class ContainsNumberOrNot {
	
	public static void main(String[] args) {
		
		String s = "good morning";
		boolean flag = false;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			
			if(ch >= '0' && ch <= '9') flag = true;
		}
		if(flag) System.out.println("Contains Number");
		else System.out.println("Not Contains Number");
		
	}

}
