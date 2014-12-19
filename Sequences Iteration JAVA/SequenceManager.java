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

public class SequenceManager {
	public static double fibonacci (int subscript) {
		double sr5 = Math.sqrt(5);

		return Math.round(((1.0/sr5) * (Math.pow(((1+sr5)/2), subscript)) - (1.0/sr5) * (Math.pow(((1-sr5)/2), subscript))));
	}

	public static double triangular (int subscript) {
		return Math.round(subscript * (subscript + 1) /2);
	}

	public static double oddCubes (int subscript) {
		return Math.round(Math.pow(subscript, 3));
	}
}