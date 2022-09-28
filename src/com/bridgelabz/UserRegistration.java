/**
 * 
 */
package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Iam_A
 *
 */
public class UserRegistration {

	/**
	 * UC8
	 *RShould clear all email samples provided separately
    **/
	
	
		public static boolean checkEMail(String mail) {
			String  userRegistrationRegEx = "(?=.*[@#$&])(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,16}";
			Pattern patternObj = Pattern.compile(userRegistrationRegEx);
			if(mail == null) {
				return false;
			}
			Matcher matcherObj = patternObj.matcher(mail);
			
			return matcherObj.matches();
			
		}
	
	
	public static void main(String[] args) {
		System.out.println("---------User Registration Password Verification-------------");
		String mail ="";
		boolean isMail = checkEMail(mail);
		if(isMail)
			System.out.println(mail+"\s is an vaild Email");
		else
			System.out.println(mail+"\s is an Invaild Email");
		

	}

}
