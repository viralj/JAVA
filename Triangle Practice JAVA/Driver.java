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

public class Driver {
	public static final void main (String [] args) {
		System.out.print("Enter first side of triangle: ");
		double s1 = KeyboardReader.readDouble();

		System.out.print("Enter second side of triangle: ");
		double s2 = KeyboardReader.readDouble();

		System.out.print("Enter third side of triangle: ");
		double s3 = KeyboardReader.readDouble();

		Triangle t = new Triangle(s1, s2, s3);

		System.out.println(t.toString());

		System.out.println("The area of your triangle is: " + t.calculateArea());
		System.out.println("The perimeter of your triangle is: " + t.calculatePerimeter());
		t.printBasicTrigValues("Side2");
	}
}