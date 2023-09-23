package com.jsp.string;

public class SumElelmentsInArray {
	
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3};
		
		int[] b = new int[a.length];
		
		b[0] = a[0];
		for(int i=1; i<a.length; i++) {
			b[i] = a[i] + b[i-1];
		}
		for(int n : b) System.out.println(n);
	}

}
