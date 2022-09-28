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
	 * UC7
	 *Rule3– Should have at least 1 numeric number in the password - 
	 *NOTE – All rules must be passed
    **/
	
	
		public static boolean checkPassword(String password) {
			String  userRegistrationRegEx = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,16}";
			Pattern patternObj = Pattern.compile(userRegistrationRegEx);
			if(password == null) {
				return false;
			}
			Matcher matcherObj = patternObj.matcher(password);
			
			return matcherObj.matches();
			
		}
	
	
	public static void main(String[] args) {
		System.out.println("---------User Registration Password Verification-------------");
		String password ="PassworD7";
		boolean isPassword = checkPassword(password);
		if(isPassword)
			System.out.println(password+"\s is an vaild Password");
		else
			System.out.println(password+"\s is an Invaild Password");
		

	}

}
