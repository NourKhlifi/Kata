package com.kata.models;


import java.util.Date;
import static com.kata.formatters.AmountFormatter.*;
import static com.kata.formatters.DateFormatter.*;

public class Withdrawal extends Operation {

	

	public Withdrawal(double amount, Date date, float balanceAfterOperation) {
		super(amount, date, balanceAfterOperation);
	}

	@Override
	public void print() {
		super.print();
		String output = "|     Withdraw      |  "+stringOfDate(getDate())+"  |     "+amountOf(getAmount())+"     |     "+amountOf(getBalanceAfterOperation())+"     |";
		System.out.print(output);
	}

	
	
}
