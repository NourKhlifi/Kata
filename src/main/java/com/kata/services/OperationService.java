package com.kata.services;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.kata.models.Account;
import com.kata.models.Deposit;
import com.kata.models.Operation;
import com.kata.models.Withdrawal;

@Service
public class OperationService {

	public void doDeposit(Account account, double amount, Date date) {
		account.addToBalance(amount);
		Operation deposit = new Deposit(amount,date,account.getBalance());
		account.addToHistory(deposit);
	}
	public void doWithdrawal(Account account, double amount, Date date) {
		account.addToBalance(-amount);
		Operation withdrowal = new Withdrawal(-amount,date,account.getBalance());
		account.addToHistory(withdrowal);
	}

	
	
}
