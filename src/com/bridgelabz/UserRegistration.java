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
	 * UC1
	 * As a User need to enter a valid First Name
     * First name starts with Cap and has minimum 3 characters
	 */
	
	
		public static boolean checkFirstName(String fName) {
			String  userRegistrationRegEx = "[A-Z]{1}[a-z]{2,6}";
			Pattern patternObj = Pattern.compile(userRegistrationRegEx);
			if(fName == null) {
				return false;
			}
			Matcher matcherObj = patternObj.matcher(fName);
			
			return matcherObj.matches();
			
		}
	
	
	public static void main(String[] args) {
		System.out.println("---------UserRegistration-------------");
		
		String fName ="Ananth";
		boolean isfName = checkFirstName(fName);
		if(isfName)
			System.out.println(fName+"is an vaild FirstName");
		else
			System.out.println(fName+"is an Invaild FirstName");
		

	}

}
