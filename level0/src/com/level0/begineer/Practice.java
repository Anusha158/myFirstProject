package com.level0.begineer;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Stream;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Practice {

	public static void main(String[] args) {

	}

	/*
	 * public static void duplicate(int numbers[]) { Arrays.sort(numbers); int
	 * previous = numbers[0] - 1;
	 * 
	 * int dupCount = 0; System.out.println(previous); for (int i = 0; i <
	 * numbers.length; ++i) { if (numbers[i] == previous) { ++dupCount; } else {
	 * previous = numbers[i]; }//{ 7, 2, 6, 1, 4, 7, 4, 5, 4, 7, 7, 3, 1 }; }
	 * System.out.println("There were " + dupCount + " duplicates in the array."); }
	 */

	public void Ocurrence(int a[]) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {

			for (int j = 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}

			}
			if (count > 1) {
				System.out.println(a[i]);
			}

		}
	}
	// 1.Reverse string

	public void Rev() {
		String a = "Abhay";
		char[] c = a.toCharArray();
		StringBuilder b = new StringBuilder();

		for (int i = c.length - 1; i >= 0; i--) {
			b.append(c[i]);
		}
		System.out.println(b);
	}

	// 2.check palindrome String

	/*
	 * for ( int i = length - 1; i >= 0; i-- ) rev = rev + str.charAt(i);
	 * 
	 * if (str.equals(rev)) System.out.println(str+" is a palindrome"); else
	 * System.out.println(str+" is not a palindrome");
	 * 
	 * }
	 */
	boolean checkPalindromeString(String input) {
		boolean result = true;
		int length = input.length();
		for (int i = 0; i < length / 2; i++) {
			if (input.charAt(i) != input.charAt(length - i - 1)) {
				result = false;
				break;
			}
		}
		return result;
	}

	// 3.Array to sort
	public void SortDemo() {
		int a[] = { 4, 2, 1 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}

	// 4.{1,3,5,6} target=7 give the index
	public int[] TwoSums(int n[], int target) {
		for (int i = 0; i <= n.length; i++) {
			for (int j = i + 1; j <= n.length; j++) {
				if (target - n[i] == n[j]) {
					return new int[] { i, j };
				}
			}
		}

		throw new IllegalArgumentException("No two sum solution");

	}
	// 5.Reverse String ang rev numbersInput: s = ["h","e","l","l","o"]
	// Output: ["o","l","l","e","h"]

	public void revChar() {
		char[] c = { 'r', 's', 't', 'u', 'v' };
		char[] s = new char[c.length];
		int j = 0;
		// StringBuilder b=new StringBuilder();
		for (int i = c.length - 1; i >= 0; i--) {

			s[j] = c[i];
			j++;

		}
		// s=b.toCharArray();
		System.out.println("Rev character=" + Arrays.toString(s));
	}

	// 6.Remove vowels from String
	public static String removeVowels(final String string) {
		final String vowels = "AaEeIiOoUu";
		final StringBuilder builder = new StringBuilder();
		for (final char c : string.toCharArray())
			if (vowels.indexOf(c) < 0)// or -1 if it is not present
				builder.append(c);
		return builder.toString();

		// return string.replaceAll("[AaEeIiOoUu]", "");
	}
	/*
	 * //7.A pair (i,j) is called good if nums[i] == nums[j] and i < j.
	 * 
	 * Return the number of good pairs.
	 */

	public void numIdenticalPairs(int[] nums) {
		int c = 0;
		System.out.println("entered...");
		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < nums.length; j++) {

				if (i < j && nums[i] == nums[j]) {
					System.out.println(i + "," + j);
					c++;
				}
			}

		}
		System.out.println("Number of good pair=" + c);
	}

	/*
	 * 8. Input: n = 5 Output: ["1","2","Fizz","4","Buzz"]
	 */
	public List<String> fizzBuzz(int n) {

		List<String> as = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {

			if (i % 3 == 0) {
				as.add("fizz");
			} else if (i % 5 == 0) {
				as.add("Buzz");
			} else if (i % 5 == 0 && i % 3 == 0) {
				as.add("fizzBuzz");
			} else {
				as.add(Integer.toString(i));
			}

		}
		System.out.println("fizzBuzz" + as);
		return as;

	}

//9.Binary Serach
	public void BinarySearch() {
		int numArray[] = { 5, 10, 15, 20, 25, 30, 35, 39 };
		System.out.println("The input array: " + Arrays.toString(numArray));
		// key to be searched
		int key = 30;
		System.out.println("\nKey to be searched=" + key);
		// set first to first index
		int first = 0;
		// set last to last elements in array
		int last = numArray.length - 1;
		System.out.println("last" + last);
		// calculate mid of the array
		int mid = (first + last) / 2;
		// while first and last do not overlap
		System.out.println("mid" + mid);
		while (first <= last) {
			// if the mid < key, then key to be searched is in the first half of array
			if (numArray[mid] < key) {
				first = mid + 1;
				System.out.println("first" + first);
			} else if (numArray[mid] == key) {
				// if key = element at mid, then print the location
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				// the key is to be searched in the second half of the array
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		// if first and last overlap, then key is not present in the array
		if (first > last) {
			System.out.println("Element is not found!");
		}
	}
	// 10. How Many Numbers Are Smaller Than the Current Number

	public void smallerNumbersThanCurrent(int[] nums) {

		int n[] = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			int c = 0;
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] > nums[j]) {
					c++;
					System.out.println(nums[i] + "," + nums[j]);
				}
			}
			n[i] = c;
		}
		System.out.println(Arrays.toString(n));
	}

//11.find single number in array(XOR)

	public int singleNumber(int[] nums) {
		int a = 0;
		for (int i : nums) {
			a ^= i;
		}
		return a;
	}

//12.MAJORITY ELEMNET IN ARRAY
	public int majorityElement() {
		int nums[] = { 2, 2, 1, 1, 1, 1, 1, 1, 2, 2 };
		Arrays.sort(nums);
		System.out.println(nums.length / 2);
		return nums[nums.length / 2];
	}

//13.  Write a program to convert Array to List? (Solution)
	public void ConvertArrayToArrayList() {

		String citynames[] = { "Boston", "Dallas", "New York", "Chicago" };

		/* Array to ArrayList conversion */
		ArrayList<String> citylist = new ArrayList<String>(Arrays.asList(citynames));

		// or Collections.addAll(arraylist, array);

		for (String str : citylist) {
			System.out.println(str);
		}
	}
	/*
	 * 14.You are climbing a staircase. It takes n steps to reach the top.
	 * 
	 * Each time you can either climb 1 or 2 steps. In how many distinct ways can
	 * you climb to the top?
	 */

	public int climbStairs(int n) {
		if (n == 1) {
			return 1;
		}
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}

	// 15. Subtract the Product and Sum of Digits of an Integer
	public void subtractProductAndSum() {
		int n = 234, s = 0, p = 1, i;
		while (n > 0) {
			i = n % 10;
			s = s + i;
			p = p * i;
			n = n / 10;
			System.out.println("sum" + s + "product" + p);

		}
		int diff = p - s;
		System.out.println("difference=" + diff);
	}

//16.Check if the Sentence Is Pangram(contains all alphabets)
	public boolean checkIfPangram(String sentence) {

		if (sentence.length() < 26 || sentence == null)
			return false;

		for (char i = 97; i <= 122; i++) {
			if (!sentence.contains(String.valueOf(i)))
				return false;
		}
		return true;
	}

//17.448. Find All Numbers Disappeared in an Array
	public void findDisappearedNumbers(int[] nums) {
		List<Integer> al = new ArrayList();
		HashSet hs = new HashSet();
		int n = nums.length;
		for (int i : nums) {
			hs.add(i);
		}

		for (int i = 1; i <= n; i++) {
			// System.out.println());
			if (!hs.contains(i)) {
				al.add(i);

			}
		}

		System.out.println("as List=" + al);

	}

	public void removeDuplicates() {
		// System.out.println(Arrays.toString(nums));
		// List<Integer> l=new ArrayList<Integ
		int[] nums1 = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		Integer[] boxedArray = Arrays.stream(nums1) // IntStream
				.boxed() // Stream<Integer>
				.toArray(Integer[]::new);

		Set dup = new HashSet(Arrays.asList(boxedArray));
		// Collections.addAll(dup, nums);
		System.out.println("dplicate removed" + dup.size());
		dup.forEach(System.out::println);
	}

//18.  Rotate Array

//18.Restore String
	public void restoreString(String s, int[] indices) {
		char[] arr = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			System.out.println(indices[i]);
			arr[indices[i]] = s.charAt(i);
		}

		System.out.println(String.valueOf(arr));
	}

//19.
	public boolean containsDuplicate(int[] nums) {
	
		
	for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 1; j < i; j++) {
				if (nums[i] == nums[j])

					return true;

			}

		}

		return false;

	}

//20.
	public void plusOne(int[] digits) {

		int n = digits.length;
		System.out.println(n - 1);

		digits[n - 1]++;
		System.out.println(Arrays.toString(digits));

	}

	/*
	 * public void moveZeroes(int[] nums) {
	 * 
	 * for(int i=0;i<=nums.length-1;i++) { if(nums[i]!=0) { nums }
	 * 
	 * }
	 * 
	 * }
	 */
//21.
	public void firstUniqChar(String s) {
		char[] c = s.toCharArray();
		System.out.println("inside uniqChar");
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();

		for (char ch : c) {
			if (mp.containsKey(ch)) {
				System.out.println("inside loops");
				int counter = mp.get(ch);
				mp.put(ch, ++counter);
			} else {
				mp.put(ch, 1);
			}
		}

		for (char c1 : mp.keySet()) {
			if (mp.get(c1) == 1) {
				System.out.println(c1 + "" + s.indexOf(c1));
			}
			break;
		}

		/*
		 * mp.forEach((k,v) -> System.out.println("Key = " + k + ", Value = " + v));
		 */
	}

//22
	public void SecondLargset() {
		int[] arr = { 1, 5, 9, 7 };
		int l = arr.length;
		System.out.println(l);
		Arrays.sort(arr);
		System.out.println("secondLargeset=" + arr[l - 2]);
	}
//23.Date] format

	public void dateexample() {
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date(0));
		System.out.println(date); // 06-23-2020
	}

//24.Remove duplicate adjacent String
	public void removeString() {
		StringBuilder str = new StringBuilder("cbbca");
		int n = str.length();

		for (int i = 0; i < str.length() - 1; i++) {

			if (str.charAt(i) == str.charAt(i + 1)) {
				// System.out.println("inside removeString loop");
				str.delete(i, i + 2);
				i = Math.max(-1, i - 2);
				System.out.println(i);

				// break;

			}

		}

		System.out.println("After remove" + str);
	}

	public int strStr(String haystack, String needle) {

		if (haystack.contains(needle)) {

			return haystack.indexOf(needle);

		} else if (needle.isEmpty())
			return 0;
		else
			return -1;

	}

	public void lengthOfLastWord(String s) {
		String s3 = "Hello world";
		String[] lw = s3.split(" ");
		System.out.println(Arrays.toString(lw));
		System.out.println(lw[lw.length - 1]);
		System.out.println(lw[lw.length - 1].length());

	}

	/*
	 * public void isPrime() { int j=2,n=5,c=0; while(j<n) { int s=0; for(int
	 * i=2;i<=n;i++) { if(j%i==0) { c++; } } if(c==2) { s=s+1;
	 * System.out.println("prime"+j);
	 * 
	 * 
	 * }
	 * 
	 * 
	 * j++; System.out.println("count"+s); }
	 */
	public void OcurrenceString(String str) {

		// char[] s=str.toCharArray();
		for (int i = 0; i < str.length(); i++) {

			int count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				// System.out.println(str.charAt(i)+""+str.charAt(j));
				if (str.charAt(i) == str.charAt(j)) {

					count++;
				}

			}

			if (count > 1) {
				System.out.println("duplicate string" + str.charAt(i));
			}
		}

	}

	/*
	 * public void trailingZeros(int n) { int f=1; for(int i=1;i<=n;i++) { f=f*i; }
	 * System.out.println("factorial"+f);
	 * 
	 * int k=0;
	 * 
	 * if(f==0) System.out.println(k);
	 * 
	 * String f1=String.valueOf(f); //char[] ch=f1.toCharArray();
	 * 
	 * for(int j=0;j<f1.length();j++) { if(f1.charAt(j)=='0') {
	 * System.out.println("contains Zero"); k++; } }
	 * System.out.println("no of zeros"+k); }
	 */

	/*
	 * TRAILING ZEROS IN FACTORIAL OF NUMBER //But since 5×2 = 10, I need to account
	 * for all the products of 5 and 2. //Looking at the factors in the above
	 * expansion, there are many more numbers that are multiples of 2 (2, 4, 6, 8,
	 * 10, 12, 14,...) than are multiples of 5 (5, 10, 15,...). That is, if I take
	 * all the numbers with 5 as a factor, I'll have way more than enough even
	 * numbers to pair with them to get factors of 10 (and another trailing zero on
	 * my factorial). So to find the number of times 10 is a factor, all I really
	 * need to worry about is how many times 5 is a factor in all of the numbers
	 * between 1 and 23. 100!=(100/5)+(100/25)+(100/125)
	 * 
	 */public int trailingZeroes(int n) {
		int cnt = 0;
		for (int i = 5; n / i >= 1; i *= 5) {
			cnt += n / i;
		}
		return cnt;
	}

	public int thirdMax(int[] nums) {
		/*
		 * int l=nums.length; Arrays.sort(nums); if(l<3) System.out.println(nums[l-1]) ;
		 * else System.out.println("third largets"+nums[l-3]);
		 */

		Set<Integer> set = new TreeSet<Integer>();
		for (int i : nums) {
			set.add(i);
		}
		List<Integer> li = new ArrayList<>(set);
		Collections.reverse(li);
		if (li.size() > 2)
			return li.get(2);
		else
			return Collections.max(li);

	}

	public int missingNumber(int[] nums) {
		int n = nums.length;
		TreeSet<Integer> t = new TreeSet<Integer>();

		for (int i : nums) {
			t.add(i);
		}

		for (int j = 0; j <= n; j++) {
			if (!t.contains(j)) {
				return j;
			}
		}
		return 0;
	}

	public boolean wordPattern(String pattern, String s) {
		Map<String, Character> mapping = new HashMap<>();
		Map<Character, Character> mapped = new HashMap<>();
		String[] list = s.split(" ");
		if (pattern.length() != list.length)
			return false;
		for (int i = 0; i < pattern.length(); i++) {
			if (mapping.containsKey(list[i])) {
				if (mapping.get(list[i]) != pattern.charAt(i))
					return false;
			} else if (mapped.containsKey(pattern.charAt(i)))
				return false;
			else {
				mapping.put(list[i], pattern.charAt(i));
				mapped.put(pattern.charAt(i), pattern.charAt(i));
			}
		}
		return true;
	}

// occurrences of each character in a string in java?
	public void countOccurence() {
		String str = "Java J2EE Java JSP J2EE";
		char[] c = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (char ch : c) {

			if (map.containsKey(ch)) {

				map.put(ch, map.get(ch) + 1);
			} else {

				map.put(ch, 1);
			}
		}
		System.out.println(str + ":" + map);
	}

	public boolean isPowerOFour(int n) {
		return (Math.log10(n) / Math.log10(4)) % 1 == 0;
	}
public void reverseString(char[] s) {
        int j=0;
        
        char[] c=new char[s.length];
        for(int i=s.length-1;i>=0;i--){
           c[j]=s[i];
           j++;
        }
        System.out.println(Arrays.toString(c));
        
    }
public void intersection(int[] nums1, int[] nums2) {
    Set<Integer> set = new HashSet<>();
    for (int i : nums1) {
        set.add(i);
    }

    List<Integer> result = new ArrayList<>();

    for (int i : nums2) {
        if(set.contains(i)){
            result.add(i);
            set.remove(i);
        }
    }
    
    //set1.retailAll(set2);

    int[] ints = new int[result.size()];
    for (int i = 0; i < result.size(); i++) {
        ints[i]=result.get(i);
    }
    System.out.println(Arrays.toString(ints));
}
public boolean isPerfectSquare(int num) {
	return false;
    
}
public void moveZeroes(int[] nums) {
    
	
	int nonZero=0;
	for(int i=0;i<nums.length;i++) {
		if(nums[i]!=0) {
			nums[nonZero++]=nums[i];
			
		}
	}
		for(int j=nonZero;j<nums.length;j++) {
			
				nums[j]=0;
				
			}
		
	
	System.out.println(Arrays.toString(nums));
}

/*
 * positions of the remaining characters. (i.e., "ace" is a subsequence of
 * "abcde" while "aec" is not).
 */
public boolean isSubsequence(String s, String t) {
	int i=0,j=0;
	
	while(i<s.length()&&j<t.length()) {
		if(s.charAt(i)==t.charAt(j)) {
			i++;
		}
		j++;
		
	}
	
	
	
	
	return i==s.length();
    
}
public String addStrings(String num1, String num2) {
	
	int n1=Integer.parseInt(num1);
	int n2=Integer.parseInt(num2);
	int sum=n1+n2;
	
	return String.valueOf(sum);
    
}
public int countSegments(String s) {

    String st=s.trim();
if(st.matches("")) {
	return 0;
}

return st.split(" ").length;
}
public boolean repeatedSubstringPattern(String str) {
    int n = str.length();
    for (int count = n / 2; count >= 1; count --) {
        if (n % count == 0) {
            int num = n / count;
            StringBuilder sb = new StringBuilder();
            String cand = str.substring(0, count);
            for (int j = 0; j < num; j ++) {
                sb.append(cand); 
            }
            if (sb.toString().equals(str)) 
                return true;
        }
    }
    return false;
}
public void countDivisible(int k) {
	int a[]= {2, 6, 1, 7, 8};
	int count=0;
	for(int i=0;i<a.length;i++) {
		
		for(int j=i+1;j<a.length;j++) {
			
			int prod=a[i]*a[j];
			if(prod%k==0) {
				
				count++;
			}
			
		}
		
	}
	
	
	System.out.println(count);
}

    public void numWaterBottles(int numBottles, int numExchange) {
      
            int totalbottles=numBottles;
          while(numBottles>=numExchange) {
            	int bottleOnExchnage=numBottles/numExchange;
            	totalbottles+=bottleOnExchnage;
              numBottles=bottleOnExchnage+(numBottles%numExchange);
              
            	
            }
            System.out.println(totalbottles); 
        }
    	
   
    public void listPractice() {
    	 List<Integer> al=new ArrayList<Integer>();
         Scanner scanner = new Scanner(System.in);
int lines=scanner.nextInt();
 
int n = scanner.nextInt();

 for(int i=0;i<n;i++) {
	 
	 al.add(scanner.nextInt());
 }
 
 //System.out.println(al);
 String action=scanner.next();
 if(action.equals("insert"))
 //insert
 {
	 int index=scanner.nextInt();
	 int value=scanner.nextInt();
 al.add(index, value);


 }
 
 if(action.equals("delete"))
	
	 {
	 System.out.println("enter element to be inserted");
		 int index=scanner.nextInt();
		 al.remove(index);
	 }
 System.out.println(al);
 scanner.close();
    }
    
    public void mapPrct() {
    	
    	HashMap<String,Integer> phmap=new HashMap<String,Integer>();
    	Scanner in = new Scanner(System.in);
    	int n=in.nextInt();
    	in.nextLine();
    	for(int i=0;i<n;i++)
    	{
    		String name=in.nextLine();
    		int phone=in.nextInt();

    		in.nextLine();
    		phmap.put(name,phone);
    	}
		
		  Iterator<Map.Entry<String,Integer>> itr = phmap.entrySet().iterator();
		  System.out.println(phmap); System.out.println("enter person name");
		 



    	while(in.hasNext()) {
    		
    		
    		String s=in.nextLine();
    		if(phmap.containsKey(s)) {
    			System.out.println(s+" "+phmap.get(s));
    		}
				
			else
			{
				
				System.out.println("not found");
			}
		}
	
	}
    
    
    public void setPractice() {
    	Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int count=0;
    	Set<String> leftSet=new HashSet<String>(t);
    	Set<String> rightSet=new HashSet<String>(t);
    	 
         String [] pair_left = new String[t];
         String [] pair_right = new String[t];
         for (int i = 0; i < t; i++) {
             pair_left[i] = s.next();
             pair_right[i] = s.next();
         }
         for(int i = 0; i < t; i++) {
         if(!leftSet.contains(pair_left[i])||!rightSet.contains(pair_right[i])) {
        	 count++;
        	 leftSet.add(pair_left[i]);
        	 rightSet.add(pair_right[i]);
        	 
        	 System.out.println(count);
         }else
         {
        	
        	 System.out.println(count);
         }
         
         
         s.close();
    }
    }
    
    public void twoSwap(int arr[]) {
    	int t,count=0;
    	for(int i=0;i<arr.length-1;i++) {
    		if(arr[i]!=i+1) {
    			System.out.println(i+1);
    	t=arr[i];
    	arr[i]=arr[t-1];
    			arr[t-1]=t;
    			count++;
    			System.out.println(Arrays.toString(arr)+" "+count);
    		}
    		else {
    			System.out.println(Arrays.toString(arr)+" "+count);
    		}
    		
    	}
    }
   public int maxNumberOfBalloons(String text) {
       int bcount=0,acount=0,lcount=0,ocount=0,ncount=0;
        
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)=='b')bcount++;
            else if		(text.charAt(i)=='a')acount++;
            	else if		(text.charAt(i)=='l')lcount++;
            		else if		(text.charAt(i)=='o')ocount++;
            		else if(text.charAt(i)=='n')ncount++;
            		
           
        }
       lcount=lcount/2;
       ocount=ocount/2;
       
       return Math.min(bcount, Math.min(acount, Math.min(lcount, Math.min(ocount, ncount))));
       
      
    }public boolean checkMagazine(String magazine, String note) {
    	 Map<String, Integer> magazineMap;
    	    Map<String, Integer> noteMap;
    	    
    	   
    	        String[] magazineWords = magazine.split(" ");
    	        magazineMap = new HashMap<String, Integer>();
    	        for(String word : magazineWords){
    	            if(!magazineMap.containsKey(word)){
    	                magazineMap.put(word, 1);
    	            }
    	            else{
    	                magazineMap.put(word, magazineMap.get(word) + 1);
    	            }
    	        }
    	        String[] noteWords = note.split(" ");
    	        noteMap = new HashMap<String, Integer>();
    	        for(String n : noteWords){
    	            if(!noteMap.containsKey(n)){
    	                noteMap.put(n, 1);
    	            }
    	            else{
    	                noteMap.put(n, noteMap.get(n) + 1);
    	            }
    	        }
    	    
    	    
    	   
    	        for(String key : noteMap.keySet()){
    	            if(!magazineMap.containsKey(key)){
    	                return false;
    	            }
    	            else{
    	                if(magazineMap.get(key) < noteMap.get(key)){
    	                    return false;
    	                }
    	            }
    	        }
    	        return true;
    	    

        }
    
    public void stringDemo() {
    	String s1="hello";
    	String s2="world";
    	
    	int l1=s1.length();
    	int l2=s2.length();
    	
    System.out.println(l1+l2);
    int comp=s1.compareTo(s2);
    if(comp<0) {
    	System.out.println("yes");
    }else
    	System.out.println("NO");
    
//System.out.println(s1.compareTo(s2));//compares two strings lexicographically .
String s3=s1.replace(s1.subSequence(0, 1), s1.substring(0, 1).toUpperCase());
String s4=s2.replace(s2.subSequence(0, 1), s2.substring(0, 1).toUpperCase());
System.out.println(s3+" "+s4);
    }
    public void getSmallestAndLargest(String str, int k) {
    	SortedSet<String> sets=new TreeSet<String>();
        for(int i=0;i<=str.length()-k;i++){
            sets.add(str.substring(i,i+k));
        }
        System.out.println(sets.first());
        System.out.println(sets.last());
    }
    
    public void firstNonOcuurence() {
    	
    	//char c[]=new char[5];
    	char c[]= {'t','o','t','a','l'};
    	

    	Map<Character, Integer> map = new HashMap<>();

		for (char ch : c) {

			if (map.containsKey(ch)) {

				map.put(ch, map.get(ch) + 1);
			} else {

				map.put(ch, 1);
			}
		}
		for(char ch:c) {
			if(map.get(ch)==1) {
				System.out.println(ch);
				break;
			}
		}
	}
    	//Streams/millions  of data	
	public void SecondLargest() {
		Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
	Optional<Integer> secondlargest=randomNumbers.sorted(Comparator.reverseOrder()).limit(2).skip(1).findFirst();
	} 
	//swap without 3 variable
	void swapWithoutVariable()
	{
		int a=16,b=20;
		
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("a="+a+" "+"b="+b);
	}	
}  





