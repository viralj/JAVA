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

public class Catfish implements Farmable {
	private static int numFish;

	//Static initializer block follows
	static {
		numFish = 7;
	}

	public Catfish () {
		numFish++;
	}

	public void harvest() {
		System.out.println("Number of catfish taken to town and sold: " + numFish);
		numFish = 0;
	}

	public void stock(double addToStock) {
		numFish += addToStock;
	}
}