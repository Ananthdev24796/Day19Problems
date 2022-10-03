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
	 * UC4
	 * As a User need to follow pre-defined
	 * Mobile Format - E.g. 91 9919819801 - Country code follow by space and 10 digit number
    **/
	
	
		public static boolean checkPhoneNumber(String number) {
			String  userRegistrationRegEx = "[91]* [0-9]{10}";
			Pattern patternObj = Pattern.compile(userRegistrationRegEx);
			if(number == null) {
				return false;
			}
			Matcher matcherObj = patternObj.matcher(number);
			
			return matcherObj.matches();
			
		}
	
	
	public static void main(String[] args) {
		System.out.println("---------UserRegistration PhoneNumber Verification-------------");
		String number ="91 9043824796";
		boolean isNumber = checkPhoneNumber(number);
		if(isNumber)
			System.out.println(number+"\s is an vaild PhoneNumber");
		else
			System.out.println(number+"\s is an Invaild PhoneNumber");
		

	}

}
