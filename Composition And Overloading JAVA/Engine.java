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
public class Engine {
	private int cylinders;
	private double literDisplacement;

	public Engine () {
		this.cylinders = 4;
		this.literDisplacement = 1.5;
	}

	public Engine (int cylinders, double literDisplacement) {
		this.cylinders = cylinders;
		this.literDisplacement = literDisplacement;
	}

	public int getCylinders () {
		return cylinders;
	}

	public void setCylinders (int c) {
		cylinders = c;
	}

	public double getLiterDisplacement () {
		return literDisplacement;
	}

	public void setLiterDisplacement (double ld) {
		literDisplacement = ld;
	}

	public void removeAndInstallEngine(int c, double ld) {
		cylinders = c;
		literDisplacement = ld;
	}

	public void removeAndInstallEngine(double ld) {
		literDisplacement = ld;
	}
}