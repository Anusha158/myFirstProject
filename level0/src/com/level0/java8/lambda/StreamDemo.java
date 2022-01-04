package com.level0.java8.lambda;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<Person> pl = Arrays.asList(new Person("bharath", "bala", 34), 
				new Person("Anusha", "bharath", 31),
				new Person("Abhay", "bharath", 5)

		);
pl.stream()
.filter(p->p.getLastName().startsWith("bh"))
.forEach(p-> System.out.println(p.getFirstName()));

System.out.println("Age less than 30");
pl.stream().filter(p->p.getAge()<30).forEach(p-> System.out.println(p.getFirstName()));

	}

}
