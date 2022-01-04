package com.level0.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class UsingLambda {
	public static void main(String[] args) {
		List<Person> pl = Arrays.asList(new Person("bharath", "bala", 34), new Person("Anusha", "bharath", 31),
				new Person("Abhay", "bharath", 5)

		);
		// sort list using lambda xpression
		Collections.sort(pl, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

		// print All
		printConditinally(pl,p->true);

		// print with condition
		System.out.println("firstname with A");
		printConditinally(pl, p -> p.getFirstName().startsWith("A"));
		// with lammbda

		System.out.println("LastName with B");
		printConditinally(pl, p -> p.getFirstName().startsWith("B"));
		
		// without lambda
		
		/*
		 * printConditinally(pl, new Condition() { public boolean test(Person p) {
		 * return p.getLastName().startsWith("b"); } });
		 */

	}

	public static void printConditinally(List<Person> pl, Predicate<Person> predicate) {
		for (Person p : pl) {
			if (predicate.test(p)) //predicate interface is function as type which has inbuilt abstract method in it
				
				System.out.println(p);
		}
	}

	/*
	 * public static void printAll(List<Person> pl) { for(Person p:pl) {
	 * System.out.println(p.getFirstName());
	 * 
	 * }
	 * 
	 * }
	 */ /*
		 * interface Condition { boolean test(Person pl); }
		 */
}
