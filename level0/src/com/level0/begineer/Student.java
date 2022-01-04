package com.level0.begineer;
import java.io.*;
import java.util.*;

public class Student implements Comparable<Student>,Comparator<Student>{
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	private int rollno;
	private String name;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Student rn) {
		// TODO Auto-generated method stub
		return this.rollno - rn.rollno;/*logic
										 * if(this.rollno==rn.rollno) return 0;
										 *  else if(this.rollno>rn.rollno) return 1; 
										 *  else return -1;
										 */  
	}
	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}
	
	
	 
	
}
