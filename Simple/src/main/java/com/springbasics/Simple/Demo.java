package com.springbasics.Simple;

public class Demo {

	public static void main(String args[]) {
		String str="Anusha";
		str="Arun";
		
		System.out.println(str);
		System.out.println(revString(str));
	}
		
		static String revString(String str) {
			
			StringBuilder sb=new StringBuilder();
			for(int i=str.length()-1;i>=0;i--) {
				sb.append(str.charAt(i));
			}
		return sb.toString();
		}
	}



