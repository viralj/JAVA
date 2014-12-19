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

class Polynomial {

	private static double quadratic_co;
	private static double linear_co ;
	private static double constant;

	public Polynomial(){
		constructPolynomial();
	}

	public static void constructPolynomial(){

		System.out.println();
		System.out.print("Enter the coefficient of the quadratic term: ");
		quadratic_co = KeyboardReader.readDouble();

		System.out.print("Enter the coefficient of the liner term: ");
		linear_co = KeyboardReader.readDouble();

		System.out.print("Enter the constant term: ");
		constant = KeyboardReader.readDouble();

		System.out.println();

		displaySelf();

		System.out.println();

		System.out.print("Enter the function argument: ");
		double arg = KeyboardReader.readDouble();
		System.out.println("f("+arg+") = " + functionValue(arg));

	}

	public static double functionValue(double arg){

		return quadratic_co*(arg*arg) + linear_co*arg + constant;

	}

	public static void displaySelf(){

		System.out.println("Entered polynomial: f(x) = " + quadratic_co +"x^2 + "+  linear_co+"x + " + constant);
	}

}