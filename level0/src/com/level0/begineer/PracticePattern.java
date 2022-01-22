package com.level0.begineer;

public class PracticePattern {
	
	public  void printPattern(int n) {
		int num=1;
	for(int i=0;i<n;i++){
		for(int j=1;j<=i;j++) {
			System.out.print(num+" ");
			
			num=num+1;
		} 
		System.out.println();
	}		
		
	}

}
