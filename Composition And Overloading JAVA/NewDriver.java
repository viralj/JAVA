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

public class NewDriver {
	public static final void main (String [] args) {
		System.out.println("Enter the car color: ");
		String c = KeyboardReader.readLine();

		System.out.println("Enter the number of cylinders: ");
		int cyl = KeyboardReader.readInt();

		System.out.println("Enter the engine size: ");
		double ld = KeyboardReader.readDouble();

		//Using the alternate 3-arg constructor
		Car car1 = new Car (c, cyl, ld);

		//Using the alternate 2-arg constructor
		Car car2 = new Car (c, new Engine(cyl, ld));

		//Using the default constructor
		Car car3 = new Car ();

		car1.printCarSpecs();

		System.out.println("Enter new engine size: ");
		ld = KeyboardReader.readDouble();

		car1.getMotor().removeAndInstallEngine(ld);

		car1.printCarSpecs();
	}
}