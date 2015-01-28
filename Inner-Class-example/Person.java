class Person {

	public String name;
	public int yearsOfExperience;

	public Person(){
		this.name = "Oriley";
		this.yearsOfExperience = 10;
	}

	public Person(String name, int yearsOfExperience){
		this.name = name;
		this.yearsOfExperience = yearsOfExperience;
	}

	public String toString(){
		return this.name + " ( "+ yearsOfExperience +" years of experience)";
	}

}
