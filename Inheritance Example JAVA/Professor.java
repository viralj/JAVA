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
public class Professor extends Human {
	private boolean tenure;
	private String degree;

	public Professor () {
		//super();
		tenure = false;
		degree = "Not specified";
		System.out.println("In Professor default constructor");
	}

	public Professor (int a, String add, boolean t, String d) {
		//Explicit call to the super class constructor
		super(a, add);

		tenure = t;
		degree = d;
	}

	public void prepareForClass() {
		System.out.println("I am preparing for class");
	}

	public void pontificate() {
		System.out.println("I am pontificating");
	}

	public void sleep() {
		System.out.println("I am a professor and I am sleeping");
	}

	public String toString () {
		return super.toString() + " Tenure: " + tenure + " Degree: " + degree;
	}

	public boolean equals (Object o) {
		if (o == null) {
			return false;
		}

		if (this == o) {
			return true;
		}

		//2 professors are the same if they have the same tenure status

		if (o instanceof Professor) {
			return (super.equals(o)) && (this.tenure == ((Professor)o).tenure) && (this.degree.equals(((Professor)o).degree));
		}

		return false;
	}
}