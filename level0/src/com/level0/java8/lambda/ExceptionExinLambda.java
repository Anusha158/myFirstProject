package com.level0.java8.lambda;

import java.util.function.BiConsumer;

public class ExceptionExinLambda {

	public static void main(String args[]) {
	
	int a=1;int b=2; 
	add(a,b,(k,s) ->System.out.println(k+s));
	}

	public static void add(int a,int b,BiConsumer<Integer,Integer> consumer) {
		
				consumer.accept(a, b);
	}
	
}
