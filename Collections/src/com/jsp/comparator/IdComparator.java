package com.jsp.comparator;

import java.util.Comparator;

public class IdComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		return (((Student)o1).id) - (((Student)o2).id);
	}

}
