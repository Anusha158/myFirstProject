package com.level0.begineer;

public class ThreadDemo extends Thread{
	static class Multi extends Thread{  
		public void run(){  
		
			 
		try {
			for(int i=0;i<=2;i++) {
			System.out.println("thread is running..."+i);
			sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}  
		public static void main(String args[]){  
		Multi t1=new Multi();  
		t1.start();  
		 }  
		}  
	static class Multi3 implements Runnable{  
		public void run(){  
		System.out.println("thread is running using Runnable...");  
		}  
		  
		public static void main(String args[]){  
		Multi3 m1=new Multi3();  
		Thread t1 =new Thread(m1);  
		t1.start();  
		 }  
		}  


}
