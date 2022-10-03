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
	 * UC2
	 * As a User need to enter a valid Last Name
     * Last name starts with Cap and has minimum 3 characters
	 */
	
	
		public static boolean checkLastName(String lName) {
			String  userRegistrationRegEx = "[A-Z]{1}[a-z]{2,}";
			Pattern patternObj = Pattern.compile(userRegistrationRegEx);
			if(lName == null) {
				return false;
			}
			Matcher matcherObj = patternObj.matcher(lName);
			
			return matcherObj.matches();
			
		}
	
	
	public static void main(String[] args) {
		System.out.println("---------UserRegistration-------------");
		
		String lName ="Nair";
		boolean islName = checkLastName(lName);
		if(islName)
			System.out.println(lName+"is an vaild LastName");
		else
			System.out.println(lName+"is an Invaild LastName");
		

	}

}
