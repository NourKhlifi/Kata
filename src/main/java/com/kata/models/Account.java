package com.kata.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kata.comparators.OperationComparator;

public class Account {
	
	private static final String HEADER = "|     OPERATION     |     DATE     |     AMOUNT      |     BALANCE     |";

	private float balance;
	private List<Operation> history;
	
	
	public List<Operation> getHistory() {
		return history;
	}
	public void setHistory(List<Operation> history) {
		this.history = history;
	}
	public Account() {
		balance = 0F;
		history = new ArrayList<Operation>();
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public void addToHistory(Operation operation) {
	    history.add(operation);
	}

	public void printHistory() {
		System.out.println(HEADER);
		OperationComparator comparator = new OperationComparator();
		Collections.sort(history, comparator.reversed());
	    for(Operation o : history) {
	        o.print();
	        System.out.println();
	    }
	    }
	public void addToBalance(double d) {
		balance += d;
		
	}
	
	
}
