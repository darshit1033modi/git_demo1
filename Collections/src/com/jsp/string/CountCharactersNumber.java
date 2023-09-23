package com.jsp.string;

public class CountCharactersNumber {

	public static void main(String[] args) {
		
		String s = "aaabccdddddef";
		String s1 = "";
		char[] a = s.toCharArray();
		int i=0, count=1;
		
		while(i < a.length) {
			count = 1;
			while(i < a.length-1 && a[i+1] == a[i]) {
				count++;
				i++;
			}
			s1 = s1 + a[i] + count;
			i++;
		}
		System.out.println(s1);
	}
}
