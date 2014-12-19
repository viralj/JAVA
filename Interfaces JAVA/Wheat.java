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
public class Wheat implements Farmable {
	private static double tonsWheat;

	//Static initializer block follows
	static {
		tonsWheat = 4.5;
	}

	public Wheat () {
		tonsWheat += 1.5;
	}

	public void harvest() {
		System.out.println("Tons of wheat taken to town and sold: " + tonsWheat);
		tonsWheat = 0.0;
	}

	public void stock(double addToStock) {
		tonsWheat += addToStock;
	}
}