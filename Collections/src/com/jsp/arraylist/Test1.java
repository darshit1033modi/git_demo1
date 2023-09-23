package com.jsp.arraylist;

import java.util.ArrayList;
import java.util.Collections;


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

public class Test1 {
	
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList<>();
		
		Student s1 = new Student(1, "Darshit", 24);
		Student s2 = new Student(4, "Jash", 26);
		Student s3 = new Student(5, "Raj", 21);
		Student s4 = new Student(2, "Jenish", 29);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		
	
		Collections.sort(list, new AgeComparator());
		
		list.forEach(e -> System.out.println(e));
		
	}

}
