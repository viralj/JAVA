/*
 *	Author Name: Viral Joshi
 *
 *	Join me on 	 github		: /viralj
 *				 facebook	: /viral4ever
 *				 google+	: /+ViralJoshi
 *				 twitter	: /viralhj
 *				 linkedin	: /in/viralj
 *
 *
 */

public class SavingsAccount {
	private double rate;
	private double balance;

	public SavingsAccount () {
		rate = 0.015;
		balance = 0.0;
	}

	public SavingsAccount (double r, double b) {
		rate = r;
		balance = b;
	}

	public void makeDeposit (double addAmount) {
		balance += addAmount;
	}

	public void makeWithdrawal (double subtractAmount) {
		balance -= subtractAmount;
	}

	public double calcYearEnd () {
		return balance * (1 + rate);
	}
}