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
		/*
		Vector v1 = new Vector (3, Math.PI / 6);
		Vector v2 = new Vector (4.5, Math.PI / 4);

		System.out.println("Vector sum: " + v1.sumVectorWith(v2));
		*/
		int numVectors = 0;
		double mag = 0.0, dir = 0.0;

		System.out.print("Enter number of vectors in system: ");
		numVectors = KeyboardReader.readInt();

		while(numVectors < 3){
			System.out.println();
			System.out.print("Min 3 number of vectors in system: ");
			numVectors = KeyboardReader.readInt();
		}

		//Declare and instantiate the array
		Vector [] v = new Vector [numVectors];

		//Instantiate the vectors (i.e. the array elements)
		for (int i = 0; i < v.length; i++) {
			System.out.print("Enter magnitude for vector " + (i + 1) + ": ");
			mag = KeyboardReader.readDouble();

			System.out.print("Enter direction for vector " + (i + 1) + ": ");
			dir = KeyboardReader.readDouble();

			v[i] = new Vector (mag, dir);
		}


		//Print out the sum of the first and third vectors
		System.out.println();
		System.out.println("Vector sum: " + v[0].sumVectorWith(v[2]));

		System.out.println();
		System.out.println("Sum of the system: " + Vector.calculateSystemSum(v));
	}
}