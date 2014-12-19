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
public class Rectangle implements Shapes {
	private double length;
	private double width;

	public Rectangle (double l, double w) {
		length = l;
		width = w;
	}

	public double area() {
		return length * width;
	}

	public double distanceAround() {
		return 2 * length + 2 * width;
	}
}