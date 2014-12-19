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

public class Encryption {
private static final int[] encrypt = {2, 9, 3, 4, 6, 8, 1, 0};
private static final int[] decrypt = new int[8];
private static final int minLength = 10;

public static String encrypt (String password)    {
    if(password.length()<minLength) {
        return password;

    }   else {
		char[] arrayEncrypted = password.toCharArray();
		char[]encryptionResult = new char[password.length()];
        for (int i =0; i < encrypt.length; i++){
			encryptionResult[i] = (arrayEncrypted[encrypt[i]]);
		}
		return String.valueOf(encryptionResult);
    }
}

public static String decrypt (String password)    {
    if (password.length()<minLength)    {
        return password;

    }   else {
        char[] arrayDecrypted = password.toCharArray();
        for (int i = 0; i < arrayDecrypted.length; i++) {
            arrayDecrypted[i] = (char) (arrayDecrypted[i]);
        }
        return String.valueOf(arrayDecrypted);
    }
}

public static boolean isValidLength (String password) {
    if (password.length()<minLength)    {
        return true;

    }   else    {
        return false;
    }
}

public static int getMinLength(){
    return minLength;
}

}