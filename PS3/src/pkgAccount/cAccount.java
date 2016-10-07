package pkgAccount;

import java.util.Date;

public class cAccount {

	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;

	public cAccount() {
	super();

	
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	@SuppressWarnings("deprecation")
	public int getDate() {
		return dateCreated.getDate();
	}
	public double getMonthlyInterestRate() {
		return annualInterestRate/12;
	}
	
	
	public double withdraw(double Withdraw) {
		return balance - Withdraw; 
	}
	
	public double deposit(double Deposit, int i) {
		return balance + Deposit;
	}

	public void deposit(int i) {
		// TODO Auto-generated method stub
		
	}
}
	
	
