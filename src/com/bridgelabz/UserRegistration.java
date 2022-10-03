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
	 * UC3
	 * As a User need to enter a valid email
	 * E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl	& co) and 2 optional (xyz & in) with precise @ and . positions
	 */
	
	
		public static boolean checkEMail(String mail) {
			String  userRegistrationRegEx = "^[a-z]{1,}(.[a-z]{1,})+[@][bl]+.co(.in)";
			Pattern patternObj = Pattern.compile(userRegistrationRegEx);
			if(mail == null) {
				return false;
			}
			Matcher matcherObj = patternObj.matcher(mail);
			
			return matcherObj.matches();
			
		}
	
	
	public static void main(String[] args) {
		System.out.println("---------UserRegistration Email Verification-------------");
		String mail ="abc.xyz@bl.co.in";
		boolean isEMail = checkEMail(mail);
		if(isEMail)
			System.out.println(mail+"\s is an vaild Email");
		else
			System.out.println(mail+"\s is an Invaild LastName");
		

	}

}
