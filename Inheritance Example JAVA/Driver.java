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
		Professor pro1 = new Professor(89, "123 Main St.", true, "Basket weaving");
		Professor pro2 = new Professor(90, "123 Main St.", true, "Basket weaving");

		System.out.println(pro1.equals(pro2));

	}
}