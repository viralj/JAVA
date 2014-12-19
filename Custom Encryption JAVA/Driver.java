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

public class Driver{

	public static void main(String[] args){


		System.out.print("Please enter the password: ");

		String password = KeyboardReader.readLine();

		while(Encryption.isValidLength(password)){
			System.out.println();
			System.out.println("Sorry, the password must be at least "+ Encryption.getMinLength() +" characters.");
			System.out.print("Please enter a valid password: ");
			password = KeyboardReader.readLine();

		}
		System.out.println();
		System.out.println("Encrypted password: " + Encryption.encrypt(password));
		System.out.println("Decrypter password: " + Encryption.decrypt(Encryption.encrypt(password)));
		System.out.println();
	}

}