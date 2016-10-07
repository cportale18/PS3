package pkgAccount;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAccount {
	

	@Test
	public void testDeposit() {
		cAccount acc = new cAccount();
		acc.deposit(500);
		assertEquals(500,0);
	}
	
	public void testWithdraw() {
		cAccount acc = new cAccount();
		acc.withdraw(20);
		assertEquals(480,500);
	}

	public void Account(int id, int balance, double annualInterestRate) {
		id = 1122;
		balance = 20000;
		annualInterestRate = .045;
		
	}
	
	public void toWithdraw() {//throws InsufficientFundsException{
		cAccount acc = new cAccount();
		acc.withdraw(2500);
		assertEquals(17500,20000);
	
	}
	
	public void toDeposit() {
		cAccount acc = new cAccount();
		acc.deposit(3000);
		assertEquals(20500,17500);
	}
}


