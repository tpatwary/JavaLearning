package com.Data;

public class StringConvert {
	static String number = "200";

	static String salary = "125000.00";

	public static void main(String[] args) {
		// convert String ino >int
		int a = Integer.parseInt(number);
		System.out.println(a);
// convert String into > double
		double b = Double.parseDouble(salary);
		System.out.println(b);
	// convert int into > String	
		int x = 5;
		String value = String.valueOf(x);
		System.out.println(value);
		
		// Convert double into >String
		double y = 10.22;
		//stem.out.println(y);
		String valueofd = String.valueOf(y);
		System.out.println(valueofd);
		
		
	}

}
