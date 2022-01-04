package com.level0.begineer.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class ThrowsDemo {

	/*
	 * throws keyword is required only for checked exception and usage of throws
	 * keyword for unchecked exception is meaningless. throws keyword is required
	 * only to convince compiler and usage of throws keyword does not prevent
	 * abnormal termination of program. By the help of throws keyword we can provide
	 * information to the caller of the method about the exception.
	 */	
	public static void main(String[] args) throws IOException,SQLException {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		int i=8,j,k=0;
		
		
		br=new BufferedReader(new InputStreamReader(System.in));
				j=Integer.parseInt(br.readLine());
			k=i/j;

	System.out.println(k);
	}

}
