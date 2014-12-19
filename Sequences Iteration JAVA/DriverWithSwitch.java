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

public class DriverWithSwitch {
	public static final void main (String [] args) {
		int menuChoice = 0;
		int subscript = 0;
		int i = 1;

		menuChoice = displayMenu();

		while (menuChoice != 4) {
			System.out.print("Enter the desired subscript: ");
			subscript = KeyboardReader.readInt();

			switch (menuChoice) {
				case 1:
					System.out.println("\nFibonacci numbers\n");
					//Put loop to display all of the requested Fibonacci numbers here (what is the appropriate structure and why?)
					for (i = 1; i <= subscript; i++)
						System.out.println("Element " + i + ": " + SequenceManager.fibonacci(i));

					break;

				case 2:
					System.out.println("\nTriangular numbers\n");
					//Put loop to display all of the requested Triangular numbers here (what is the appropriate structure and why?)
					for (i = 1; i <= subscript; i++)
						System.out.println("Element " + i + ": " + SequenceManager.triangular(i));

					break;

				case 3:
					System.out.println("\nOdd cubes\n");
					//Put loop to display all of the requested odd cubes here (what is the appropriate structure and why?)
					for (i = 1; i <= subscript; i++)
						System.out.println("Element " + i + ": " + SequenceManager.oddCubes(2 * i - 1));
			}

			menuChoice = displayMenu();
		}
	}

	public static int displayMenu () {
		System.out.println("\n1. Print the nth element of the Fibonacci");
		System.out.println("2. Print the nth element Triangular number");
		System.out.println("3. Print the nth odd cube");
		System.out.println("4. Exit");

		System.out.print("\nEnter menu choice: ");
		int choice = KeyboardReader.readInt();

		//Put data validating loop here (what is the appropriate structure and why?)

		while (choice > 4 || choice < 1) {
			System.out.print("Invalid data entered. Please enter 1, 2, 3, or 4: ");
			choice = KeyboardReader.readInt();
		}

		return choice;
	}
}