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
 
public class House {
	//Instance variables
	private double bathrooms;
	private int bedrooms;
	private int squareFootage;
	private boolean garage;

	//Default constructor
	public House () {
		bathrooms = 1.5;
		bedrooms = 3;
		squareFootage = 1000;
		garage = false;
	}

	//Alternate 4-argument constructor

	public House (double bath, int bed, int sf, boolean garage) {
		bathrooms = bath;
		bedrooms = bed;
		squareFootage = sf;
		this.garage = garage;
	}

	//addBathroom is an instance method
	//
	//public is the access specifier
	//void is the return type
	//addBathroom is the identifier (the method name)
	//The next three lines are the body
	//{
	//	bathrooms++;
	//}
	public void addBathroom () {
		bathrooms++;
	}

	public void renovate (int sf) {
		squareFootage = squareFootage + sf;
		//More typically written as squareFootage += sf;
	}

	public void convertBedToBath () {
		bathrooms++;
		bedrooms--;
	}

	public void setGarageStatus (boolean g) {
		//this.garage = garage;
		garage = g;
	}

	public double getNumberOfRooms () {
		return bedrooms + bathrooms;
	}

	public void displaySpecs () {
		System.out.println("The number of bedrooms: " + bedrooms);
		System.out.println("The number of bathrooms: " + bathrooms);
		System.out.println("The square footage: " + squareFootage);
		System.out.println("Has a garage: " + garage);
	}

	//A getter and a setter for the bathrooms instance variable

	public double getBathrooms () {
		return bathrooms;
	}

	public void setBathrooms (double bath) {
		bathrooms = bath;
	}

	//A getter and a setter for the garage instance variable

	public boolean getGarage () {
		return garage;
	}

	public void setGarage (boolean g) {
		garage = g;
	}
}