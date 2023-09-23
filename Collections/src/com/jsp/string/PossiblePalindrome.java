package com.jsp.string;

public class PossiblePalindrome {
	
	public static boolean isPalindrome(String s, int start, int end) {
		char[] a = s.toCharArray();
		int i=start; 
		int j=end;
		
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
		
		for(int i=0; i<s.length()-1;i++) {
			for(int j=i+1; j<s.length(); j++) {
				if(isPalindrome(s, i, j)) {
					System.out.println(s.substring(i, j+1));
				}
			}
		}
		
	}

}
