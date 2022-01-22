package com.level0.begineer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionsDemo c=new CollectionsDemo();
		c.Lst();
		//System.out.println(c.fact(6));
		CollectionsDemo b1=new CollectionsDemo(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	      CollectionsDemo b2=new CollectionsDemo(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	      CollectionsDemo b3=new CollectionsDemo(103,"Operating System","Galvin","Wiley",6);  
	      
	      
	      //Adding Books to hash table  
	      LinkedHashSet<CollectionsDemo> hs=new LinkedHashSet<CollectionsDemo>();  
	      
	      hs.add(b1);  
			hs.add(b2); hs.add(b3);
			
			/*
						 * Java LinkedHashSet class contains unique elements only like HashSet. Java
						 * LinkedHashSet class provides all optional set operation and permits null
						 * elements. Java LinkedHashSet class is non synchronized. Java LinkedHashSet
						 * class maintains insertion order.
						 */

	      
	       
	      for(CollectionsDemo b:hs){  
	      System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);  
	      }  
	//	c.PqDemo();
	   //   c.SetDemo();
	     // c.MapDemo();
	      ArrayList<Student> st=new ArrayList<Student>();
	      st.add(new Student(12,"anu"));
	      st.add(new Student(9,"abhay"));
	      st.add(new Student(8, "pranaya"));
	      st.add(new Student(5, "bhanu"));
	     	//sorting with rollno 
			/*
			 * Collections.sort(st);
			 * 
			 * for(Student t:st) { System.out.println(t.getName()+","+t.getRollno()); }
			 */
	      
	      //sorig with name and comparator
	      Collections.sort(st,new Student());
	     System.out.println("Sorting basednon name");
	      for(Student t:st) {
		      System.out.println(t.getName()+","+t.getRollno());
		      }
		     
	      //Practice Program
	      Practice p =new Practice();
	      PracticePattern ppattern=new PracticePattern();
	      int[] values = { 7, 2, 6, 1, 4, 7, 4, 5, 4, 7, 7, 3, 1 };
	       //p.duplicate(values);
	     // p.Ocurrence(values);
	     // p.Rev();
	     // p.revChar();
	     String s1= p.removeVowels("Anusha");
	     System.out.println(s1);
	   System.out.println(p.checkPalindromeString("aba"));  
	   //p.SortDemo();
	   int [] nums={8,1,2,2,3};
	  // p.numIdenticalPairs(nums);
	   int n[]={1,3,5,6};
	   //int r[]=p.TwoSums(n, 7);
	  // System.out.println("result of twoSums"+Arrays.toString(r));
	      p.fizzBuzz(5);
	      p.BinarySearch();
	     p.smallerNumbersThanCurrent(nums);
	     
	     
	     int [] nums1= {4,1,2,1,2};
	    int ans1= p.singleNumber(nums1);
	    System.out.println("single number"+ans1);
	    int e= p.majorityElement();
	    System.out.println("majority elemrny="+e);
	    
	//    p.subtractProductAndSum();
	   boolean a= p.checkIfPangram("leetcode");
	   System.out.println(a);
	   int[] dp= {1,1};
	  p.findDisappearedNumbers(dp);
	   int[] nums_rdp= {4,3,2,1};
	   p.removeDuplicates();
	   
	   int ind[]= {4,5,6,7,0,2,1,3};
	   //p.restoreString("codeleet",ind);
	  boolean res= p.containsDuplicate(nums_rdp);
	  System.out.println("contain duplicate"+res);
	 // p.plusOne(nums_rdp);
	  String str="leetcode";
	 // p.firstUniqChar(str);
  p.removeString();
	 int ind1= p.strStr("hello","ll");
	 System.out.println("index="+ind1);
	//p.lengthOfLastWord("hello world");
	//p.OcurrenceString("anusha");
	int cnt=p.trailingZeroes(10);
	System.out.println(cnt);
	p.SecondLargset();
	int r[]={3,2};
	int f=p.thirdMax(r);
//	System.out.println("third largest"+f);
	
	int[] k= {0};
	int missingNum=p.missingNumber(k);
	//System.out.println(missingNum);
	
	boolean b=p.wordPattern("abba", "dog cat cat dog");
	//System.out.println("word pattern"+b);
	
	//p.countOccurence();
	
	boolean resFour=p.isPowerOFour(5);
	System.out.println(resFour+ " resFour");
	
	char[] s = {'h','e','l'};
	//p.reverseString(s);
	int[] n1= {4,9,5};
	int[] n2= {9,4,9,8,4};
	
	
	//p.intersection(n1, n2);
	int[] Zero= {0,1,0,3,12};
	//p.moveZeroes(Zero);
	
	String h="123";
	
	String t="11";
	
	//boolean resSub=p.isSubsequence(h, t);
	//System.out.println("is Subsequence="+resSub);
	
	String sum=p.addStrings(h, t);
	System.out.println(sum);
	
	String segment="Hello, my name is John";
	int count=p.countSegments(segment);
	System.out.println(count);
	
	boolean ans=p.repeatedSubstringPattern("abab");
	System.out.println(ans);
	//p.countDivisible(4);
	//p.numWaterBottles(5, 5);
	//p.listPractice();

	//p.mapPrct();
	//p.setPractice();
	/*
	 * int tonum[]= {7, 1, 3, 2, 4, 5, 6}; p.twoSwap(tonum); String
	 * ballonscount="nlaebolko"; int
	 * ballonsCount=p.maxNumberOfBalloons(ballonscount);
	 * System.out.println(ballonsCount); p.stringDemo();
	 * p.getSmallestAndLargest("welcometojava", 3); p.firstNonOcuurence();
	 * p.swapWithoutVariable(); boolean result=Practice.twoarraysEqual();
	 * System.out.println(result+"=equal arrays");
	 */
	
	ppattern.printPattern(5);
	}

	
	

}
