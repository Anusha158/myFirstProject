package com.springbasics.Simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
	
	  
	  ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	  Employee emp=(Employee)context.getBean("employee");
    System.out.println(emp.getName()+" "+emp.getEmpId()+" "+emp.getCategory()+""+emp.getCompany().getCmpnyName());
  }
}
