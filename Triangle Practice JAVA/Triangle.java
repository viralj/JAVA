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
public class Triangle {
	private double side1;
	private double side2;
	private double side3;
	private boolean iAmARightTriangle;
	public static final String SHAPE = "Triangle";

	public Triangle () {
		side1 = 3.0;
		side2 = 4.0;
		side3 = 5.0;
		iAmARightTriangle = true;
	}

	public Triangle (double s1, double s2, double s3) {
		setSide3ToLargest(s1, s2, s3);

		if (impossibleTriangle()) {
			side1 = 3.0;
			side2 = 4.0;
			side3 = 5.0;
		}

		iAmARightTriangle = determineIfRightTriangle();
	}

	public static String returnShapeInformation () {
		return "Shape: Triangle\n3-sided polygon";
	}

	private void setSide3ToLargest(double s1, double s2, double s3) {
		if (s1 >= s2 && s1 >= s3) {
			side3 = s1;
			side1 = s2;
			side2 = s3;
		}
		else
			if (s2 >= s1 && s2 >= s3) {
				side3 = s2;
				side1 = s1;
				side2 = s3;
			}
			else {
				side3 = s3;
				side1 = s1;
				side2 = s2;
			}
	}

	public double calculatePerimeter () {
		return side1 + side2 + side3;
	}

	public double calculateArea () {
		if (iAmARightTriangle)
			return calculateSimpleArea();
		else
			return calculateHeronArea();
	}

	private double calculateSimpleArea() {
		return 0.5 * side1 * side2;
	}

	private double calculateHeronArea() {
		double s = 0.5 * (side1 + side2 + side3);

		return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	}

	public void printBasicTrigValues (String adjacentSide) {
		if (!iAmARightTriangle)
			System.out.println("Sorry, trigonometry is too hard if there is no right angle!");
		else
			if (adjacentSide.equals("Side1")) {
				System.out.println("COS: " + side1 / side3);
				System.out.println("SIN: " + side2 / side3);
				System.out.println("TAN: " + side2 / side1);
			}
			else {
				System.out.println("COS: " + side2 / side3);
				System.out.println("SIN: " + side1 / side3);
				System.out.println("TAN: " + side1 / side2);
			}
	}

	private boolean determineIfRightTriangle() {
		if (side3 == Math.sqrt(Math.pow(side1, 2) + Math.pow(side2,2)))
			return true;

		return false;
	}

	public String toString () {
		return ("Shape: " + SHAPE + "\nSide1: " + side1 + "\nSide2: " + side2 + "\nSide3: " + side3 + "\nRight triangle (true/false): " + iAmARightTriangle);
	}

	private boolean impossibleTriangle () {
		if (side1 <= 0.0 || side2 <= 0.0 || side3 <= 0.0)
			return true;

		if (side1 + side2 <= side3)
			return true;

		return false;
	}
}