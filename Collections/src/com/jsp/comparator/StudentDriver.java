package com.jsp.comparator;

import java.util.Arrays;

class Student {
	
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}

public class StudentDriver {
	
public static void main(String[] args) {
		
		Student s1 = new Student(2, "Darshit", 24);
		Student s2 = new Student(5, "Jash", 21);
		Student s3 = new Student(4, "Arjun", 27);
		Student s4 = new Student(3, "Raj", 17);
		Student s5 = new Student(1, "Reddy", 40);
		
		Student[] s = {s1, s2, s3, s4, s5};
		
		System.out.println("--------based on id--------");
		Arrays.sort(s, new IdComparator());
		
		for(Student n : s) System.out.println(n);
		
		System.out.println("--------based on age--------");
		Arrays.sort(s, new AgeComparator());
		
		for(Student n : s) System.out.println(n);
		
		System.out.println("--------based on name--------");
		Arrays.sort(s, new NameComparator());
		
		for(Student n : s) System.out.println(n);
		
		
	}

}
