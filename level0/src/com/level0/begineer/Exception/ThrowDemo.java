package com.level0.begineer.Exception;
//used for custom/user defined Exception
public class ThrowDemo {
	public static void main(String[] args)  {
	
		int age=15;
	
		try {
			if (age < 18) {
				throw new youngAgeException("Access denied - You must be at least 18 years old.");
			}
			else {
				System.out.println("Access granted - You are old enough!");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	
	}
	
}
		 



	

class youngAgeException extends Exception {

		public youngAgeException(String string) {
			// TODO Auto-generated constructor stub
			super(string);
		}
	
}


