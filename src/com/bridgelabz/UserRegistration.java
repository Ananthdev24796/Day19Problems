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
	 * UC9
	 *Should clear all email samples provided separately
    **/
	
	
		public static boolean checkEMail(String mail) {
			String  userRegistrationRegEx = "^[a-zA-Z0-9.+_-]+[@][a-zA-Z0-9]+(.[a-z]{2,})+(.[a-z]{2,})";
			Pattern patternObj = Pattern.compile(userRegistrationRegEx);
			if(mail == null) {
				return false;
			}
			Matcher matcherObj = patternObj.matcher(mail);
			
			return matcherObj.matches();
			
		}
	
	
	public static void main(String[] args) {
		System.out.println("---------User Registration Email Verification-------------");
		String mail ="abc.1xy@asd.co.au";
		boolean isMail = checkEMail(mail);
		if(isMail)
			System.out.println(mail+"\s is an vaild Email");
		else
			System.out.println(mail+"\s is an Invaild Email");
		

	}

}
