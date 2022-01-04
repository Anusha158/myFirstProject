package com.level0.java8.lambda;

import java.util.Comparator;

public class Person {
	private String firstName;
	private String LastName;
	private int age;
	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", LastName=" + LastName + ", age=" + age + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}

	
	   
	/*
	 * public int compareTo(Person firstName) {
	 * 
	 * return this.firstName.compareTo(firstName.firstName); }
	 */
	
	/*
	 * public int compare(Person p1, Person p2) { return
	 * p1.firstName.compareTo(p2.firstName);
	 * 
	 * }
	 */
	
	
	public class NameSorter implements Comparator<Person> 
	{
	    public int compare(Person p1, Person p2) 
	    {
	    	return p1.firstName.compareTo(p2.firstName);
	    }
	}
	 
	public class AgeSorter{
	
	 	Comparator<Person>   AgeSort=(p1,p2)->  p1.getAge()-p2.getAge();
	    
	}
}

