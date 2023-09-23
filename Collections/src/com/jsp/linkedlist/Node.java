package com.jsp.linkedlist;

public class Node {
	
	Object ele;
	Node next;
	
	public Node(Object ele, Node next) {
		super();
		this.ele = ele;
		this.next = next;
	}
	
	public Node(Object e) {
		ele = e;
	}
}
