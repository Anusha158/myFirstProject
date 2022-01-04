package com.level0.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class CollectionWithlambda {
	public static void main(String[] args) {
		List<Person> pl = Arrays.asList(new Person("bharath", "bala", 34), 
				new Person("Anusha", "bharath", 31),
				new Person("Abhay", "bharath", 5)

		);
		System.out.println("Using lambda");
		pl.forEach(p->System.out.println(p));
		
		//Collection with methodasReference
		System.out.println("using methodasEference foreach loop");
		pl.forEach(System.out::println);
	}
	


}
