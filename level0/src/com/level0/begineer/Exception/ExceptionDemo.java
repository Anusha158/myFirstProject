package com.level0.begineer.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=null;
		int i=8,j,k=0;
		int n[]=new int[3];
		try {
		br=new BufferedReader(new InputStreamReader(System.in));
				j=Integer.parseInt(br.readLine());
			k=i/j;
		for(int p=0;p<=4;p++) {
			n[p]=p;
			//System.out.println(n);
		}
	}
		catch(IOException e) {//checked Exception
			System.out.println(e);
		}
		catch(ArithmeticException e) { //uncheckedException
			//System.out.println("dvide by zero");
            e.printStackTrace();

		}
		
		catch(ArrayIndexOutOfBoundsException e) { //unchevkedException
			System.out.println("length of Array 3");
		}
		catch(Exception e) { //hireachy this is the last exceptions
			System.out.println("unknown exceptions");
		}
		finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			/*
			 * all statement written in finally is always executed,you should close all your
			 * resorces in finally block
			 */
			
		}
		System.out.println(k);
	}

}
