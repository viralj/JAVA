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
public class Driver {
	public static final void main (String [] args) {
		Catfish cf = new Catfish();
		Wheat w = new Wheat();

		cf.stock(22);
		w.stock(7.8);

		cf.harvest();
		w.harvest();
	}
}