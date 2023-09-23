package com.jsp.hashmap;

import java.util.Scanner;
import java.util.TreeMap;

class contact{
	String name;
	long mobile;
	public contact(String name, long mobile) {
		super();
		this.name = name;
		this.mobile = mobile;
		
	}
	@Override
	public String toString() {
		return "contact [name=" + name + ", mobile=" + mobile + "]";
	}
	
	
}
class ContactBook{
TreeMap	tm=new TreeMap();
public void addContact(contact c) {
	tm.put(c.name, c.mobile);
	System.out.println("sucessfully added.......");
	System.out.println("CName:- "+c.name+" CMob:-"+c.mobile);
}

public void removeContact(String cname) {
	if(tm.isEmpty()) {
		System.out.println("First add the contact.");
	}
	else {
		if(tm.containsKey(cname)) {
			tm.remove(cname);
		}
		else {
			System.out.println("No exist this contact");
		}
	}
}

public  void Search(String cname) {
	if(tm.isEmpty()) {
		System.out.println("no such contact avalible in there");
	}
	else {
		if(tm.containsKey(cname) ) {
			
			System.out.println("we found ur contact");
//			System.out.println("Enter the Replace Name or Number");
//			Scanner sc=new Scanner(System.in);
//			tm.put(sc.nextLine(), sc.nextLong() );
		}
		else {
			System.out.println("please check userName or Password.");
		}
	}
}

public void update(String cname) {
	
	  Search(cname);
	if(tm.containsKey(cname)) {
		System.out.println("Enter the Replace Name or Number");
		Scanner sc=new Scanner(System.in);
		tm.put(cname, sc.nextLong() );
	}
}
public void Show() {
	System.out.println(tm.values());
}
}
public class MapTest {
	
	public static void main(String[] args) {
		ContactBook cb = new ContactBook();
	 boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("1. AddContact\n"
				+ "2. Delete Contact\n"
				+ "3.show contact\n"
				+"4. SearchContact\n"
				+ "5. updateContact"); 
		while(flag) {
	System.out.println("choose the option:- ");
	int opt=sc.nextInt();
	
	switch (opt) {
	case 1: {
		
		sc.nextLine();
		System.out.println("enter the Name:- ");
		String cnameString=sc.nextLine();
		System.out.println("Enter contect Number:- ");
		long cno=sc.nextLong();
		
		cb.addContact(new contact(cnameString, cno));
		
	}
	break;
	case 2:{
		sc.nextLine();
		System.out.println("Enter The Name to remove:-");
		String cname=sc.nextLine();
		cb.removeContact(cname);
	}break;
	case 3:{
		//System.out.println(cb.Show());
		cb.Show();
	}break;
	case 4:{
		sc.nextLine();
		System.out.println("Enter name for search:-");
		String search=sc.nextLine(); 
		
		cb.Search(search);
		
	}
	break;
	
	case 5:{
		
		sc.nextLine();
		System.out.println("Enter name for updation:-");
		String upd=sc.nextLine(); 
		cb.update(upd);
		
	}
	   break;
	default:
		throw new IllegalArgumentException("Unexpected value: " + opt);
	}
	}}
}

