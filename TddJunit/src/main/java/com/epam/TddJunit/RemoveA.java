package com.epam.TddJunit;

public class RemoveA {

	public static String remove(String string) {
		String res ="";
		int stringLength = string.length();
		if(stringLength >= 1 && string.charAt(0) != 'a' && string.charAt(0) != 'A') {
			res += string.charAt(0);
		}
		if(stringLength >= 2 && string.charAt(1) != 'a' && string.charAt(1) != 'A') {
			res += string.charAt(1);
		}
		if(stringLength > 2) {
			res += string.substring(2);
		}
		return res;
	}

}
