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
 
public class Car {
	private String color;
	private Engine motor;

	public Car () {
		color = "white";
		motor = new Engine();
	}

	public Car (String c, Engine m) {
		color = c;
		motor = m;
	}

	public Car (String c, int cy, double ld) {
		color = c;
		//Can't do the next two lines - compiler error
		//cylinders = cy;
		//literDisplacement = ld;
		motor = new Engine(cy, ld);
	}

	public Engine getMotor () {
		return motor;
	}

	public void setMotor (Engine m) {
		motor = m;
	}

	public void paint (String newColor) {
		color = newColor;
	}

	public void printCarSpecs () {
		System.out.println("The color of the car is: " + color);
		System.out.println("The engine size in liters is: " + motor.getLiterDisplacement());
		System.out.println("The number of cylinders is: " + motor.getCylinders());
	}
}