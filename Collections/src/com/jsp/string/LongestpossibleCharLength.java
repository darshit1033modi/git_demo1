package com.jsp.string;

public class LongestpossibleCharLength {
	
	public static void main(String[] args) {
		
		String s = "yyyyyyyyyyyybbBBBBBByyyyyyyyy";
		char[] a = s.toCharArray();
		int i = 0;
		int count = 1;
		int largest = 0;
		
		while(i < a.length) {
			count = 1;
			while(i <a.length-1 && a[i+1] == a[i]) {
				count++;
				if(largest < count) largest = count;
				i++;
			}
			i++;
		}
		
		System.out.println(largest);
	}

}
