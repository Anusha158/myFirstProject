package com.level0.java8.lambda;

public class MainJava8 {

	public static void main(String[] args) {
		//MainJava8 obj=new MainJava8();
		
		PracticeJava8 obj=new PracticeJava8();
		//obj.oddNumbers();
		//obj.generateRandomNumber();
		//obj.toUpperDemo();
		//obj.reverseNumber();
		//obj.avg();
		//obj.search();
		//obj.duplicateEl();
	//	obj.toFindSecondLarge();
		// Lambda Runnable
		Runnable task2 = () -> { System.out.println("Task #2 is running"); };
		 
		// start the thread
  new Thread(task2).start();
  obj.SumNmDivisibletwo();
obj.groupingBy();

	}

}
