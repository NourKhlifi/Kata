package com.kata.comparators;

import java.util.Comparator;

import com.kata.models.Operation;

public class OperationComparator implements Comparator<Operation> {

	@Override
	public int compare(Operation o1, Operation o2) {
		return o1.getDate().compareTo(o2.getDate());
	}

}
