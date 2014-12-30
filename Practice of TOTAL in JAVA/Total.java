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

public class Total {

	public static long total = 0;

	public Total() {

	}

	public final void addToTotal(int val) {
			total += val;
	}

	public final void subtractFromTotal(int val) {
			total -= val;
	}

	public final long incrementTotal() {
			return total += 1;
	}

	public final long decrementTotal() {
			return total -= 1;
	}

	public static final void main(String[] args) {
		Total running = new Total();

		System.out.println();
		System.out.println("Enter an initial value");
		running.addToTotal(KeyboardReader.readInt());

		System.out.println();

		System.out.println("Enter an amount to subtract from the initial value:");
		running.subtractFromTotal(KeyboardReader.readInt());

		System.out.println();
		System.out.println("Current total is : " + running.total);

		System.out.println();
		System.out.println("Now incrementing total");
		System.out.println("Current total is : " + running.incrementTotal());

		System.out.println();
		System.out.println("Now decrementing total");
		System.out.println("Current total is : " + running.decrementTotal());

	}
}
