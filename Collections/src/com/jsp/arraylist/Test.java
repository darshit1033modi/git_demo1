package com.jsp.arraylist;

class OutOfRangeException extends RuntimeException {
	
}

class ArrayList {
	
	Object[] a = new Object[5];
	private int index = 0;
	
	public void add(Object e) {
		if(index >= a.length) increase();
		a[index++] = e;
	}
	
	public void add(int in, Object e) {
		if(in <= -1 || in >= size()) throw new OutOfRangeException();
		for(int i=size()-1; i>=in; i--) {
			a[i+1] = a[i];
		}
		a[in] = e;
		index++;
	}
	
	public void remove(int in) {
		if(in <= -1 || in >= size()) throw new OutOfRangeException();
		for(int i=in+1; i<size(); i++) {
			a[i-1] = a[i];
		}
		a[--index] = null;
	}
	
	private void increase() {
		Object[] temp = new Object[((a.length*3)/2)+1];
		for(int i=0; i<a.length; i++) temp[i] = a[i];
		a = temp;
 	}
	
	public int size() {
		return index;
	}
	
	public Object get(int in) {
		if(in <= -1 || in >= size()) throw new OutOfRangeException();
		return a[in];
	}	
	
}

public class Test{
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(70);
		list.add(50);
		list.add(30);
		list.add(2, 40);
		list.remove(3);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
