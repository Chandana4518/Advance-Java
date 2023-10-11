package com.xworkz.waste.util;

public class ValidationUtil {
	
	public static boolean validateString(String string)
	{
		if(string!=null&& !string.isEmpty()&& string.length()>=3&& string.length()<30)
		{
			return true;
		}
		System.err.println(string + " is Invalid,validation util...");
		return false;
		
	}
	public static boolean validateDouble(double Double)
	{
		if(Double>0&& Double<100000)
		{
			return true;
		}
		System.err.println(Double + "is Invalid,Validation Util...");
		return false;
		
	}

}
