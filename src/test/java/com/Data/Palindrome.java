package com.Data;

public class Palindrome {

	public static void main(String[] args) {

		String value = "mom";

		String rev = "";

		for (int i = value.length() - 1; i >= 0; i--)
			rev = rev + value.charAt(i);
		if (value.equalsIgnoreCase(rev))
			System.out.println("This is Palindrome :" + rev);
		else
			System.out.println("This is not Palindrome : " + rev);

	}

}
