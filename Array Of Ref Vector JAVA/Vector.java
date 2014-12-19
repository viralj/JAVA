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

public class Vector {
	double magnitude;
	double direction;

	public Vector () {
		magnitude = 0.0;
		direction = 0.0;
	}

	public Vector (double m, double d) {
		magnitude = m;
		direction = d;
	}

	public double calculateHorizontalComponent () {
		return magnitude * Math.cos(direction);
	}

	public double calculateVerticalComponent () {
		return magnitude * Math.sin(direction);
	}

	public Vector sumVectorWith(Vector toAdd) {
		return calculateVectorGivenComponents(calculateHorizontalComponent() + toAdd.calculateHorizontalComponent(),
			calculateVerticalComponent() + toAdd.calculateVerticalComponent());
	}

	public String toString () {
		return "Magnitude: " + magnitude + "  Direction: " + direction;
	}

	public static Vector calculateVectorGivenComponents (double hComp, double vComp) {
		return new Vector (Math.sqrt(hComp * hComp + vComp * vComp), Math.atan(vComp/hComp));
	}

	//Write a method that accepts a system of vectors (i.e. an array of vectors)
	//and calculates and returns the sum of the vectors in the system

	public static Vector calculateSystemSum (Vector [] vecs) {
		double horCompSum = 0.0;
		double verCompSum = 0.0;

		for (int i = 0; i < vecs.length; i++) {
			horCompSum += vecs[i].calculateHorizontalComponent();
			verCompSum += vecs[i].calculateVerticalComponent();
		}

		return calculateVectorGivenComponents(horCompSum, verCompSum);
	}
}