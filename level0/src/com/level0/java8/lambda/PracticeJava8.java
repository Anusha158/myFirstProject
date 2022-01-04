package com.level0.java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PracticeJava8  {
	
	public void oddNumbers() {
		List<Integer> ol=Arrays.asList(1,2,3,4,5,6,7);
		
		ol.stream().filter(i->i%2==0).forEach(System.out::println);
		}
	
	public void generateRandomNumber() {
	     
	         Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
	 
	         randomNumbers.limit(20)
	              .forEach(System.out::println);
	     
	}
	/*
	 * The map() intermediate operation converts each element in the stream into
	 * another object via the given function.
	 */

	public void toUpperDemo() {
	     
		List<String> grp=Arrays.asList("bird","flowers","fruits","Animals");
        grp.stream().map(s->s.toUpperCase()).sorted()
             .forEach(System.out::println);
        
        boolean result=grp.stream().anyMatch((s)->s.startsWith("f"));
        System.out.println("Item found"+result);
		/*
		 * The findFirst() method will return the first element from the stream and then
		 * it will not process any more elements.
		 */
        
        String fnmae=grp.stream().filter(s->s.startsWith("f")).findFirst().get();
        System.out.println(fnmae);

    
}
	public void findmax() {
		// Get Min or Max Number
		Integer maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
		                    .max(Comparator.comparing(Integer::valueOf))
		                    .get();
		 
		Integer minNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
		                    .min(Comparator.comparing(Integer::valueOf))
		                    .get();
		 
		System.out.println("maxNumber = " + maxNumber);
		System.out.println("minNumber = " + minNumber);
	}
	public void reverseNumber() {
		List<Integer> l= Arrays.asList(5,4,2,3);
		l=l.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	System.out.println(l);
	//find sum of array
	
	System.out.println("total"+l.stream().map(i->i*2). reduce(0, (c,e)->c+e));
	}
	
	public void avg() {
		List<Integer> s=Arrays.asList(1,2,3,4,5);
		Double avg=s.stream().mapToInt(i->i).average().getAsDouble();
		System.out.println(avg);
		
		
	}
	/*
	 * Given a list of strings, write a method that returns a list of all strings
	 * that start with the letter 'a' (lower case) and have exactly 3 letters. TIP:
	 * Use Java 8 Lambdas and Streams API's.
	 */	
	public void search() {
		List<String> list=Arrays.asList("bird","flowers","fruits","Animals","anu");
	list=list.stream().map(i->i.toLowerCase()).filter(i->i.startsWith("a")).filter(i->i.length()==3).collect(Collectors.toList());
	System.out.println(list);
	}
	public void duplicateEl() {
		List<String> list=Arrays.asList("fruits","flowers","fruits","Animals","birds");
		Set<String> items = new HashSet<>();

		
		list.stream().filter(n -> !items.add(n))
        .collect(Collectors.toSet())
        .forEach(System.out::println);
	
	}
	
	public void toFindSecondLarge() {
		List<Integer> l= Arrays.asList(5,4,2,3);
		l.stream().sorted().limit(2).skip(1).forEach(System.out::println);
		l.stream().sorted(Comparator.reverseOrder()).limit(2).skip(1).forEach(System.out::println);
	}

	public void SumNmDivisibletwo() {
		List<Integer> l= Arrays.asList(5,4,2,3);
		Integer sum=l.stream().filter(i->i%2==0).reduce(0, (c,e)->c+e);
		System.out.println(sum);
	}

//GROUPINGbY
	public void groupingBy() {
        List<String> items =
                Arrays.asList("apple", "apple", "banana",
                        "apple", "orange", "banana", "papaya");

        Map<String, Long> result =
                items.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(), Collectors.counting()
                        )
                );

        System.out.println("groupby result"+result);


		
	}
	
	
	
	

}
