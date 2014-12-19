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
 
public abstract class Human {
	private int age;
	private String address;

	public abstract void sleep();

	public Human () {
		age = 21;
		address = "Non specified";
		System.out.println("In Human default constructor");
	}

	public Human (int a, String add) {
		age = a;
		address = add;
	}

	public void attendClass() {
		System.out.println("I am attending class");
	}

	public String toString () {
		return "Age: " + age + " Address: " + address;
	}

	public boolean equals (Object o) {
		if (o == null) {
			return false;
		}

		if (this == o) {
			return true;
		}

		//2 Humans are the same if they have the same age and address

		if (o instanceof Human) {
			return (this.age == ((Human)o).age) && (this.address.equals(((Human)o).address));
		}

		return false;
	}
}