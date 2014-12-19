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

class UserNamePassword extends EncryptedPassword {

    private String userName;


	public UserNamePassword(String userName, String password){
		super(password);
		this.userName = userName;
	}

	public String getUserName(){
		return this.userName;
	}

	public boolean matches(String fa){
		return false;
	}

	public boolean matches(String userName, String password){
		if(userName.equals(password))
			return false;
		else
			return true;
	}

	public String toString(){
		return userName + "password is " + super.getPassword();
	}

}