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

class EncryptedPassword extends Password {

	private final static String ENCRYPTION_METHOD;

	static {
		ENCRYPTION_METHOD = "PERMUTATION";
	}

	public EncryptedPassword(String password){
		super(password);
	}

	public boolean matches(String password){

		new EncryptedPassword(password);

		return super.matches(password);
	}

	public String toString(){
		return "Decrypted Password is " + decrypt();
	}

	public String decrypt(){
		Encryption e = new Encryption();
		return e.decrypt(super.getPassword());
	}

	public static String getEncryptionMethod(){
		return ENCRYPTION_METHOD;
	}
}