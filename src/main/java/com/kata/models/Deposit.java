package com.kata.models;

import java.util.Date;
import static com.kata.formatters.AmountFormatter.*;
import static com.kata.formatters.DateFormatter.*;
public class Deposit extends Operation {
	
	
	

	public Deposit(double amount, Date date, float balanceAfterOperation) {
		super(amount, date, balanceAfterOperation);
	}

	@Override
	public
	void print() {
		String output = "|     Deposit       |  "+stringOfDate(getDate())+"  |     "+amountOf(getAmount())+"     |     "+amountOf(getBalanceAfterOperation())+"     |";
		super.print();
		System.out.print(output);

		
	}

}
