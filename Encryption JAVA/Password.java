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

abstract class Password {


    private String password;
	private final static String ENCRYPTION_METHOD;


	static {
		ENCRYPTION_METHOD = "CLEAR TEXT";
	}

	public Password(String password){
		this.password = password;
	}

	public String getPassword(){
		return this.password;
	}

	public boolean matches(String password){
		if (this.password.equals(password))
		    return true;
		else
        	return false;
	}

	public String toString(){
		return "Password is " + this.password;
	}

	public static String getEncryptionMethod(){

		return ENCRYPTION_METHOD;
	}

	abstract String decrypt();
}