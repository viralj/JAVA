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

import java.util.Scanner;

class Library{

	class Book{

		protected String title;
		protected Person author;
		protected int numOfPages;

		public Book(){
			this.title = "Java CookBook";
			this.numOfPages = 858;
			this.author = new Person();
		}

		public Book(String title, Person author, int numOfPages){
			this.title = title;
			this.author = author;
			this.numOfPages = numOfPages;

		}

		public void printInfo(){

			System.out.println("Book title: " + title);
			System.out.println("Book author: " + author.toString());
			System.out.println("Book pages: " + numOfPages);
			System.out.println("");

		}

	}

	protected Book[] inventory ;
	protected Person director;
	protected String libraryName;

	public static Scanner s = new Scanner(System.in);

	public Library(){
		this.libraryName = "ABC Library";
		constructInitialInventory();
	}

	public Library(String libraryName, Person director){
		this.libraryName = libraryName;
		this.director = director;

		constructInitialInventory();

	}


	public void printLibraryID(){
		System.out.println("Information for : " + this.libraryName);
		System.out.println("--------------------------------------------------");
	}

	public void printInventory(){

		for(int i = 0; i<inventory.length; i++){
			inventory[i].printInfo();
		}
	}

	public void constructInitialInventory(){


		System.out.print("How many books are in the library? ");
		int booksNum = s.nextInt();
		s.nextLine();

		inventory = new Book[booksNum];

		System.out.println("");

		for(int i = 0; i< booksNum; i++){
			System.out.print("Enter title for book " + (i+1) +": ");
			String bookT = s.nextLine();

			System.out.print("Enter author for book " + (i+1) +": ");
			String bookA = s.nextLine();

			System.out.print("Enter author's years of authorship : ");
			int bookAA = s.nextInt();

			System.out.print("Enter number of pages in book " + (i+1) +": ");
			int bookP = s.nextInt();

			s.nextLine();

			System.out.println("");

			inventory[i] = new Book(bookT, new Person(bookA, bookAA), bookP);
		}

	}


	public static void main(String[] args){

		System.out.print("Enter library name: ");
		String lName = s.nextLine();

		System.out.print("Enter director name: ");
		String director = s.nextLine();

		System.out.print("Enter years of experience: ");
		int exp = s.nextInt();


		Library l = new Library(lName, new Person(director, exp));

		System.out.print("");
		l.printLibraryID();
		l.printInventory();
	}
}
