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
	 * UC5
	 *As a User need to follow pre-defined Password rules.
	 *Rule1 minimum 8 Characters 
	 * NOTE – All rules must be passed
    **/
	
	
		public static boolean checkPassword(String password) {
			String  userRegistrationRegEx = "(?=.*[a-z])(?=.*[A-Z]).{8,16}";
			Pattern patternObj = Pattern.compile(userRegistrationRegEx);
			if(password == null) {
				return false;
			}
			Matcher matcherObj = patternObj.matcher(password);
			
			return matcherObj.matches();
			
		}
	
	
	public static void main(String[] args) {
		System.out.println("---------User Registration Password Verification-------------");
		String password ="PassworD";
		boolean isPassword = checkPassword(password);
		if(isPassword)
			System.out.println(password+"\s is an vaild Password");
		else
			System.out.println(password+"\s is an Invaild Password");
		

	}

}
