package com.jsp.comparable;

import java.util.Arrays;

class Student implements Comparable {
	
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
	
	@Override
	public int compareTo(Object o) {
		return this.name.compareTo(((Student)o).name);
	}
	
}


public class StudentDriver{
	public static void main(String[] args) {
		
		Student s1 = new Student(2, "Darshit", 24);
		Student s2 = new Student(5, "Jash", 21);
		Student s3 = new Student(4, "Arjun", 27);
		Student s4 = new Student(3, "Raj", 17);
		Student s5 = new Student(1, "Reddy", 40);
		
		Student[] s = {s1, s2, s3, s4, s5};
		
		Arrays.sort(s);
		
		for(Student n : s) System.out.println(n);
		
	}
}