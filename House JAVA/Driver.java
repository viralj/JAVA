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
		//Declare and instantiate a House
		House house = new House();
		House h2 = new House (3.0, 4, 2000, true);

		System.out.print("Enter number of bathrooms: ");
		double bath = KeyboardReader.readDouble();

		System.out.print("Enter number of bedrooms: ");
		int bed = KeyboardReader.readInt();

		System.out.print("Enter the square footage: ");
		int sf = KeyboardReader.readInt();

		System.out.print("Enter 'true' if it has a garage, 'false' otherwise: ");
		boolean g = KeyboardReader.readBoolean();

		House h3 = new House(bath, bed, sf, g);

		house.addBathroom();

		house.displaySpecs();
		System.out.println();
		h2.displaySpecs();
		System.out.println();
		h3.displaySpecs();

		System.out.println();
		double totalRooms = house.getNumberOfRooms() + h2.getNumberOfRooms() + h3.getNumberOfRooms();

		System.out.println("Total rooms: " + totalRooms);

		h3.setBathrooms(7);
	}
}