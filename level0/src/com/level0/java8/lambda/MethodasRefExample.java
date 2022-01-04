package com.level0.java8.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodasRefExample {

	public static void main(String[] args) {
		List<Integer> values=Arrays.asList(2,3,4);
		
		
		
		Thread t=new Thread(MethodasRefExample::printMessage);//methodReference same as ()->System.out.println("Hello"));
				
			t.start();	
			values.forEach(MethodasRefExample::print);
			
			//values.forEach(MethodasRefExample::printValue);
		
	}
	public static void printMessage() {
		System.out.println("Hello");
	}
	public static void print(int i) {
	System.out.print(" "+i*2);
	}
	/*
	 * public static void printValue(int i) { System.out.print(String.valueOf(i)); }
	 */
}
