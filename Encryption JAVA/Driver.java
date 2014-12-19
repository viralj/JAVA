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

	public static void main(String[] args){

		//get username and password from user and assign to varible
		System.out.print("Please enter a user name: ");
		String u = KeyboardReader.readLine();

		System.out.print("Please enter a password: ");
		String p = KeyboardReader.readLine();

		Encryption enc = new Encryption();



		System.out.println();
		System.out.println("Password reference pointing to an EncryptedPassword object");
		System.out.println("------------------------------------------------------------");

		Password encPass = new EncryptedPassword(p);
		System.out.println("Encrypted Password: " + enc.encrypt(p));
		System.out.println(encPass.getEncryptionMethod());
		System.out.println("Password is: " + p);
		System.out.print("Please enter the password: ");
		p = KeyboardReader.readLine();
		System.out.println("Password entered correctly? " + encPass.matches(p));


		System.out.println();
		System.out.println("Password reference pointing to UserNamePassword object");
		System.out.println("-------------------------------------------------------");

		UserNamePassword up = new UserNamePassword(u, p);

		System.out.println("Encrypted Password: " + enc.encrypt(p));
		System.out.println(encPass.getEncryptionMethod());
		System.out.println(u + " password is: " + p);
		System.out.print("Please enter the password: ");
		p = KeyboardReader.readLine();
		System.out.println("Password entered correctly? " + up.matches(p));



		System.out.println();
		System.out.println("EncryptedPassword reference pointing to an EncryptedPassword object");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Encrypted Password: " + enc.encrypt(p));
		System.out.println(up.getEncryptionMethod());
		System.out.println("password is: " + p);
		System.out.print("Please enter the password: ");
		p = KeyboardReader.readLine();
		System.out.println("Password entered correctly? " + encPass.matches(p));


		System.out.println();
		System.out.println("UserNamePassword reference pointing to UserNamePassword object");
		System.out.println("---------------------------------------------------------------");
		System.out.println("Encrypted Password: " + enc.encrypt(p));
		System.out.println(up.getEncryptionMethod());
		System.out.println(u + " password is: " + p);
		System.out.print("Please enter the user name: ");
		u = KeyboardReader.readLine();
		System.out.print("Please enter the password: ");
		p = KeyboardReader.readLine();
		System.out.println("Password entered correctly? " + up.matches(u, p));


	}

}