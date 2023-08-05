package com.validation;

public class Validation {

	private static String validation;
	public static String Checkdata(String name,String email,String message)
	{
		if(name.length()>2)
		{
			System.out.println("valid name");
			if(email.endsWith(".com"))
			{
				if(message.length()>2 && message.length()<200)
				{
					validation="validinformation";
				}
			}
		}
		else
		{
			validation="invalidinformation";
		}
		
		return validation;
	}
}
