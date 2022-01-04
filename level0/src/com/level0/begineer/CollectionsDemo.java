package com.level0.begineer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class CollectionsDemo<E> {

		
	int id;  
	  String name,author,publisher;  
	  int quantity;
	
	public void Lst() {
		
		// TODO Auto-generated method stub.list store only String data.
		 List<String> al=new ArrayList<String>();//creating arraylist   is 
		 List al3=new ArrayList();
		 /*
			 * //Standard Java arrays are of a fixed length. After arrays are created, they
			 * cannot grow or shrink, which means that you must know in advance how many
			 * elements an array will hold. lst allow duplicate elements.
			 * thraed safe ie synchronized.
			 */ 
			/*
			 * al.add("Ravi");//adding object in arraylist al.add("Vijay"); al.add("Ravi");
			 * al.add("Ajay");
			 */    
	      System.out.println("Initial size of ArrayList al: " + al.size());

		  List<String> al2=new LinkedList<String>();//creating linkedlist    is doubly linked list
		  al2.add("James");//adding object in linkedlist    
		  al2.add("Serena");    
		  al2.add("Swati");    
		  al2.add("Junaid"); 
		  
		  al2.set(2, "Ravi");
		 // System.out.println();
		    al3.add("anu");
		    al3.add(10);
		   // employee e1=new employee();
		  System.out.println("arraylist: "+al);  
		  System.out.println("linkedlist: "+al2);
		  System.out.println("get element at 2"+al2.get(2));
		  Object o=al3.get(1);
		  System.out.println("generic collection"+o);
		al2.forEach( s->System.out.println(s));
		  
		  
		/*
		 * Iterator<String> it = al.iterator();
		 * 
		 * while(it.hasNext()) {
		 * 
		 * System.out.println(it.next());
		 * 
		 * }
		 */	}
	//	  Recursive function to find 
		  public static long fact(int n) {
			      if (n <= 1)
			         return 1;
			      else
			         return n * fact(n - 1);
			   }
		   
			
		  
			    
			  public CollectionsDemo(int id, String name, String author, String publisher, int quantity) {  
			      this.id = id;  
			      this.name = name;  
			      this.author = author;  
			      this.publisher = publisher;  
			      this.quantity = quantity;  
			    
			  }  
			   
			      public CollectionsDemo() {
				// TODO Auto-generated constructor stub
			}



				
			   public void PqDemo() {
					  PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
					  for(int i=10;i>0;i--) {
						 // System.out.println(i);
						  pq.add(i);
					  }
					  
					 // priority queue output 10 9 8 7 6 5 4 3 2 1
					//  priorityqueue sorts the elemrnt
					  //output 1 2 3 4 5 6 7 8 9 10
					  System.out.println("priorityQueue after pek"+pq.peek());//head of the queue
					 pq.poll();//Remove the head
					  System.out.println();
				   
			   }
			   public void SetDemo() {
				   
				   HashSet hs=new HashSet();
				   HashSet hs2=new HashSet();
				   hs.add('a');
				   hs.add(4);
				   hs2.add(hs);
				   System.out.println(hs);
				   
				  System.out.println("After converted to Array"+hs.toString());
				  
				  if(hs.contains(5)) {
					  System.out.println("element is present");
				  }else
					  System.out.println("element unavailables");
				  Iterator itr=hs.iterator();
				  while(itr.hasNext()) {
					  System.out.println(itr.next());
				  }
			   }
			   public void MapDemo() {
				   
				   HashMap<Integer,String> hm=new HashMap<Integer,String>();
				   hm.put(1, "one");
				   hm.put(2, "two");
				   hm.put(3, "three");
				   hm.put(4, "four");
				   
			        Iterator<Map.Entry<Integer, String>> itr = hm.entrySet().iterator();
			         
					/*
					 * while(itr.hasNext()) { Map.Entry<Integer, String> entry = itr.next();
					 * System.out.println("Key = " + entry.getKey() + ", Value = " +
					 * entry.getValue()); }
					 */
			        hm.forEach((k,v) -> System.out.println("Key = "
			                + k + ", Value = " + v));
			         


			   }
			   
			   

		
	
	

}

