package com.kata.models;

import java.util.Date;

public class Operation {
	
	
	private double amount;
	private Date date;
	private double balanceAfterOperation;
	
	
	
	public double getBalanceAfterOperation() {
		return balanceAfterOperation;
	}



	public void setBalanceAfterOperation(double balanceAfterOperation) {
		this.balanceAfterOperation = balanceAfterOperation;
	}





	    
	public Operation(double amount, Date date, float balanceAfterOperation) {
		super();
		this.amount = amount;
		this.date = date;
		this.balanceAfterOperation = balanceAfterOperation;
	}



	public void print()
	{
		
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
