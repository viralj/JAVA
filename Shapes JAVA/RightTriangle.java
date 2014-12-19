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
public class RightTriangle implements Shapes {
	private double base;
	private double height;

	public RightTriangle (double b, double h) {
		base = b;
		height = h;
	}

	public double area() {
		return 0.5 * base * height;
	}

	public double distanceAround() {
		return base + height + Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
	}
}