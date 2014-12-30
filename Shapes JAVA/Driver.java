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
   
   
	/*
	 * Main method
	 */
	public static final void main (String [] args) {
		
		System.out.print("How many shapes will be entered: "); //asking user for shapes
		int num = KeyboardReader.readInt();

		Shapes [] s = new Shapes[num]; //creating array for shapes

		for (int i = 0; i < s.length; i++) {
			System.out.print("Is shape " + (i + 1) + " a rectangle or triangle (R/T): ");
			char choice = KeyboardReader.readChar();

			while (choice != 'R' && choice != 'r' && choice != 'T' && choice != 't') {
				System.out.print("Invalid data. Please enter R, r, T, or t: ");
				choice = KeyboardReader.readChar();
			}

			if (choice == 'R' || choice == 'r') {
				System.out.print("Enter the length: ");
				double l = KeyboardReader.readDouble();

				System.out.print("Enter the width: ");
				double w = KeyboardReader.readDouble();

				s[i] = new Rectangle(l, w);
			}
			else {
				System.out.print("Enter the base: ");
				double b = KeyboardReader.readDouble();

				System.out.print("Enter the height: ");
				double h = KeyboardReader.readDouble();

				s[i] = new RightTriangle(b, h);
			}
		}

		System.out.println("The total area is: " + totalArea(s));
		System.out.println("The total perimeter is: " + totalPerimeter(s));
	}

	public static double totalArea (Shapes [] s) {
		double accum = 0.0;

		for (int i = 0; i < s.length; i++)
			accum += s[i].area();

		return accum;
	}

	public static double totalPerimeter (Shapes [] s) {
		double accum = 0.0;

		for (int i = 0; i < s.length; i++)
			accum += s[i].distanceAround();

		return accum;
	}
}
