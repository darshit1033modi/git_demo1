package com.jsp.linkedlist;

public class Linkedlist {
	
	private Node first;
	private int count = 0;
	
	public void add(Object ele) {
		if(first == null) {
			first = new Node(ele);
			count++;
			return;
		}
		Node curr = first;
		while(curr.next != null) {
			curr = curr.next;
		}
		curr.next = new Node(ele, null);
		count++;
	}
	
	public void add(int index, Object ele) {
		if(index == 0) {
			first = new Node(ele, first);
			count++;
			return;
		}
		Node curr = first;
		for(int i=1; i<index; i++) {
			curr = curr.next;
		}
		curr.next = new Node(ele, curr.next);
		count++;
	}
	
	public int size() {
		return count;
	}
	
	public Object get(int index) {
		if(index == 0) {
			return first.ele;
		}
		Node curr = first;
		for(int i=1; i<=index; i++) {
			curr = curr.next;
		}
		return curr.ele;
	}
	
	public void set(int index, Object ele) {
		if(index == 0) {
			first.ele = ele;
		}
		Node curr = first;
		for(int i=1; i<=index; i++) {
			curr = curr.next;
		}
		curr.ele = ele;
	}
	
	public void remove(int index) {
		if(index == 0) {
			first = first.next;
			count--;
			return;
		}
		Node curr = first;
		for(int i=1; i<index; i++) {
			curr = curr.next;
		}
		
		curr.next = curr.next.next;
		count--;
		
	}

}
