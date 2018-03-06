package com.kata.tests;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.kata.models.Account;
import com.kata.models.Deposit;
import com.kata.models.Withdrawal;
import com.kata.services.OperationService;
import static com.kata.formatters.DateFormatter.*;


@RunWith(SpringRunner.class)
@SpringBootTest
public class OperationServiceTests {
	
	@Autowired
	private OperationService operationService;
	private Account account;
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	
    public OperationService getOperationService() {
		return operationService;
	}
	public void setOperationService(OperationService operationService) {
		this.operationService = operationService;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	@Before
    public void setUp() {
        account = new Account();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown() {
        System.setOut(System.out);
    }

	@Test public void calculateBalanceAfterDepositTest() {
		getOperationService().doDeposit(account,100, date("10-01-2018"));
		assertTrue(account.getBalance() == 100);
	}

	@Test public void calculateBalanceAfterWithdrawTest() {
		getOperationService().doWithdrawal(account,1000, date("15-01-2018"));
		assertTrue(account.getBalance() == -1000);
	}
	
	@Test public void printDepositOperationTest() {
		getOperationService().doDeposit(account,100, date("10-01-2018"));
		account.getHistory().get(0).print();
		assertEquals("|     Deposit       |  10-01-2018  |     +100,00     |     +100,00     |", outContent.toString());
	}
	@Test public void printWithdrawOperationTest() {
		getOperationService().doWithdrawal(account,1000, date("15-01-2018"));
		account.getHistory().get(0).print();
		assertEquals("|     Withdraw      |  15-01-2018  |     -1000,00     |     -1000,00     |", outContent.toString());
	}
}
