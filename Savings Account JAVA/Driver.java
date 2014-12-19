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
 
import csci130.*;
import java.text.NumberFormat;

public class Driver {
	public static void main (String [] args) {
		SavingsAccount sa;
		double rate = 0.0, balance = 0.0, deposits = 0.0, withdrawals = 0.0;

		System.out.print("Enter the initial balance:  ");
		balance = KeyboardReader.readDouble();

		System.out.print("Enter the rate:  ");
		rate = KeyboardReader.readDouble();

		sa = new SavingsAccount (rate, balance);

		System.out.print("Enter total deposits:  ");
		deposits = KeyboardReader.readDouble();

		sa.makeDeposit(deposits);

		System.out.print("Enter total withdrawals:  ");
		withdrawals = KeyboardReader.readDouble();

		sa.makeWithdrawal(withdrawals);

		System.out.println("The balance at year end is:  " + sa.calcYearEnd());
		System.out.println("The balance at year end is:  " + NumberFormat.getCurrencyInstance().format(sa.calcYearEnd()));
		System.out.println();
	}
}
