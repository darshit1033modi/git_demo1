package com.jsp.string;

public class CountVowels {
	
	public static void main(String[] args) {
		
		String s = "hibernate";
		
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println(count);
		System.out.println("------------------");
		
		int count1 = 0;
		String vowel = "aeiouAEIOU";
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(vowel.contains(ch+"")) {
				count1++;
			}
		}
		System.out.println(count1);
	}

}
