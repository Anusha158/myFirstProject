package com.level0.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class JavaPerson7 {

	public static void main(String[] args) {
		List<Person> pl=Arrays.asList(new Person("bharath","bala",34),
				new Person("Anusha","bharath",31),
				new Person("Abhay","bharath",5)

				);
		Collections.sort(pl, new Comparator<Person>() {
			public int compare(Person p1, Person p2) {

				return p1.getFirstName().compareTo(p2.getFirstName());}
		});
		

		System.out.println("list according name begin witb a");
		for(Person p:pl) {
			System.out.println(p.getFirstName());
		}

		/*
		 * if(name.startsWith("A")) { System.out.println("NAME WITH A is"+name);
		 * 
		 * }
		 */

	}

}


