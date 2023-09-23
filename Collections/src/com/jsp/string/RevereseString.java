package com.jsp.string;

public class RevereseString {
	
	public static String reverse(String s) {
		
		char[] a = s.toCharArray();
		int i=0;
		int j=a.length-1;
		
		while(i < j) {
			char temp = a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		return new String(a);
	}
	
	public static void main(String[] args) {
		
		String s = "java";
		String s1 = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			s1 += s.charAt(i);
		}
		System.out.println(s1);
		System.out.println("------------------");
		System.out.println(reverse(s));
	}

}
