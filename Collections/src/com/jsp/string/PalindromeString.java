package com.jsp.string;

public class PalindromeString {
	
	public static boolean isPalindrome(String s) {
		char[] a = s.toCharArray();
		int i=0; 
		int j=a.length-1;
		
		while(i < j) {
			if(a[i] != a[j]) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {

		String s = "malayalam";
		System.out.println(isPalindrome(s));
		
	}

}
