package com.jsp.comparator;

import java.util.Comparator;

public class AgeComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return ((Student)o1).age - ((Student)o2).age;
	}

}
