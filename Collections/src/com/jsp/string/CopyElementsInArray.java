package com.jsp.string;

public class CopyElementsInArray {
	
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3};
		
		int[] b = new int[a.length*2];
		
		for(int i=0; i<a.length; i++) {
			b[i] = a[i];
			b[i+a.length] = a[i];
		}
		for(int n : b) System.out.print(n);
	}

}
