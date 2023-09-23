package com.jsp.string;

public class Test2 {
	
	public static void main(String[] args) {
		
//		System.out.print("hi");
//		System.out.println("Hello");
//		
//		System.out.println("Hi");
//		
////		int i=1;
////		while(i <= 10) {
////			if(i == 5) continue;
////			System.out.println(i);
////			i++;
////		}
//		
//		for(int i=1; i<=10; i++) {
//			if(i == 5) continue;
//			System.out.println(i);
//			
//		}
//		
//		int a=19;
//		int b = a++ - --a + a++ - a--;
//		System.out.println(b);
//		System.out.println(a);
//		
		
		String s1 = "hello worllo";
		String s2 = "";
		
		for(int i=0; i<s1.length(); i++) {
			
			if(s1.charAt(i) == 'l' && s1.charAt(i+1) == 'l' && s1.charAt(i+2) == 'o') {
				s2 += "xx";
				i += 2;
			}
			else {
				s2 += s1.charAt(i);
			}
		}
		System.out.println(s2);
		
		
	}

}
