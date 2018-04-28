package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DemoSort {

	public void sortIntegersNaturalOrder () {	
		List<Integer> numbers = new ArrayList<>(Arrays.asList(3,1,5,2,4));
		System.out.println(numbers.size() + " unsorted numbers in sequential container.");
		/*
		 * Show each element on Console
		 * (standard out, i.e. std out)
		 */
		for (Integer s : numbers) {
			System.out.print(s + ", ");
		}
		System.out.println();

		Collections.sort(numbers); 	// sort, natural order using Comparable interface implemented in Integer class
		System.out.println(numbers.size() + " natural order sorted numbers in sequential container.");
		for (Integer s : numbers) {
			System.out.print(s + ", ");
		}
		System.out.println();
	}

	public void alphabetizeStrings () {	
		List<String> names = new ArrayList<>(Arrays.asList("dan",  "Al", "Sue"));
		System.out.println(names.size() + " unsorted names in sequential container.");
		/*
		 * Show each element on Console
		 * (standard out, i.e. std out)
		 */
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();

		Collections.sort(names); 	// sort, natural order using Comparable interface implemented in String class
		System.out.println(names.size() + " natural order sorted names in sequential container.");
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();
		
		/*
		 * Use sort method with a Comparator (an anonymous inner class)
		 * The implementation of this Comparator class
		 * specifies a customized sort of String elements in Alphabetical (ignoring case) order.
		 */
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String string1, String string2) {
				return string1.compareToIgnoreCase(string2);
			}
		});
		System.out.println(names.size() + " alphabetized names (ignored case) in sequential container.");
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();
	}	

	public void sortStringsNaturalOrder () {	
		List<String> names = new ArrayList<>(Arrays.asList("dan",  "Al", "Sue"));
		System.out.println(names.size() + " unsorted names in sequential container.");
		/*
		 * Show each element on Console
		 * (standard out, i.e. std out)
		 */
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();

		Collections.sort(names); 	// sort, natural order using Comparable interface implemented in String class
		System.out.println(names.size() + " natural order sorted names in sequential container.");
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();
	}

	public void sortStringsNaturalOrder2 () {	
		List<String> names = new ArrayList<>(Arrays.asList("dan",  "Al", "Sue"));
		System.out.println(names.size() + " unsorted names in sequential container.");
		/*
		 * Show each element on Console
		 * (standard out, i.e. std out)
		 */
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();

		
		/*
		 * ArrayList has a sort method too.
		 * 
		 * void 	sort(Comparator<? super E> c)
		 * Sorts this list according to the order induced by the specified Comparator.
		 * 
		 *  we are NOT specifying a Comparator, so use null and use natural order.
		 *  sort, natural order using Comparable interface implemented in String class
		 */
		names.sort(null);
		System.out.println(names.size() + " natural order sorted names in sequential container.");
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();
	}
	

	public void sortStringsIgnoreCase () {	
		List<String> names = new ArrayList<>(Arrays.asList("dan",  "Al", "Sue"));
		System.out.println(names.size() + " unsorted names in sequential container.");
		/*
		 * Show each element on Console
		 * (standard out, i.e. std out)
		 */
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();

		/*
		 * Use sort method with a Comparator (an anonymous inner class)
		 * The implementation of this Comparator class
		 * specifies a customized sort of String elements in Alphabetical (ignoring case) order.
		 */
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String string1, String string2) {
				return string1.compareToIgnoreCase(string2);
			}
		});
		System.out.println(names.size() + " alphabetized names (ignored case) in sequential container.");
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();
	}

	public void sortStringsIgnoreCase2 () {	
		List<String> names = new ArrayList<>(Arrays.asList("dan",  "Al", "Sue"));
		System.out.println(names.size() + " unsorted names in sequential container.");
		/*
		 * Show each element on Console
		 * (standard out, i.e. std out)
		 */
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();
		

		/*
		 * Use ArrayList sort method with a Comparator (an anonymous inner class)
		 * The implementation of this Comparator class
		 * specifies a customized sort of String elements in Alphabetical (ignoring case) order.
		 */
		names.sort(new Comparator<String>() {

			@Override
			public int compare(String string1, String string2) {
				return string1.compareToIgnoreCase(string2);
			}
		});
		System.out.println(names.size() + " alphabetized names (ignored case) in sequential container.");
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();
	}
	
	public void sortIntegers() {
		/*
		 * Add primitive "int" values to ArrauList container.
		 * 
		 * Java performs Auto Boxing
		 * by wrapping each primitive "int" in the Integer class.
		 * 
		 * Primitive types are NOT supported by Collections so
		 * Boxing of each primitive "int" is required.
		 * 
		 * Therefore, we MUST specify Integer as type because 
		 * each primitive "int" is auto-boxed 
		 * (i.e. wrapped or contained) in an Integer class.
		 * 
		 */
		List<Integer> numbers = new ArrayList<>();
		
		
		/*
		 * adding Integer object already containing primitive int value
		 */
		numbers.add(new Integer(5));
		numbers.add(new Integer(1));
		
		/*
		 * Java performs auto-boxing when adding primitive int.
		 * (by automatically wrapping primitive int in Integer class)
		 */
		numbers.add(3);
		numbers.add(2);
		numbers.add(4);
		
		System.out.println(numbers.size() + " unsorted numbers in List sequential container.");
		for (Integer n : numbers) {
			System.out.print(n + ", ");
		}
		System.out.println();
		
		/*
		 * Sort list of Integers in natural order
		 * Integer class has a natural order (default sort) because
		 * Integer class implements Comparable interface
		 * which means Integer class implements the
		 * 
		 * 		int compareTo(SomeType object);
		 * 
		 * method specified in the Comparable interface.
		 * 
		 */
		Collections.sort(numbers);	// this sort method uses the Integer class implementation of the Comparable interface and does NOT use a Comparator
		
		System.out.println(numbers.size() + " sorted ascending numbers in List sequential container.");
		for (Integer n : numbers) {
			System.out.print(n + ", ");
		}
		System.out.println();
		
		numbers.add(9);
		numbers.add(7);
		numbers.add(6);
		numbers.add(8);
		
		System.out.println(numbers.size() + " unsorted numbers in List sequential container.");
		for (Integer n : numbers) {
			System.out.print(n + ", ");
		}
		System.out.println();
		
		/*
		 * ArrayList has a sort method too.
		 * 
		 * void 	sort(Comparator<? super E> c)
		 * Sorts this list according to the order induced by the specified Comparator.
		 */
		numbers.sort(null);		// we are NOT specifying a Comparator, so use null
		
		System.out.println(numbers.size() + " sorted ascending numbers in List sequential container.");
		for (Integer n : numbers) {
			System.out.print(n + ", ");
		}
		System.out.println();
		
		/*
		 * Use sort method with a Comparator (an anonymous inner class)
		 * The implementation of this Comparator class
		 * specifies a customized sort of integers in descending order.
		 */
		numbers.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer integer1, Integer integer2) {
				return integer2.compareTo(integer1);		// sort in decending order
			}
		});
		
		System.out.println(numbers.size() + " sorted descending numbers in List sequential container.");
		for (Integer n : numbers) {
			System.out.print(n + ", ");
		}
		System.out.println();
		

	}

	public void sortStringss() {
		/*
		 * Add String values ArrayList sequential container.
		 * 
		 * Arrays.asList converts an array of values to a fixed List sequential container using the same (memory containing the) values.
		 * Adding fixed List to ArrayList in constructor (copying all elements) gives us a grow-able sequential container.
		 * 
		 */
		List<String> names = new ArrayList<>(new ArrayList<>(Arrays.asList("Orange", "Apple", "Peach" )));
		System.out.println(names.size() + " unsorted names in sequential container.");
		/*
		 * Show each element on Console
		 * (standard out, i.e. std out)
		 */
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();
		
		/*
		 * Sort list of Strings in natural order
		 * String class has a natural order (default sort) because
		 * String class implements Comparable interface
		 * which means String class implements the
		 * 
		 * 		int compareTo(SomeType object);
		 * 
		 * method specified in the Comparable interface.
		 * 
		 */
		Collections.sort(names);	// this sort method uses the String class implementation of the Comparable interface and does NOT use a Comparator
		
		System.out.println(names.size() + " sorted names (natural order) in sequential container.");
		for (String n : names) {
			System.out.print(n + ", ");
		}
		System.out.println();

		/*
		 * add more names to List
		 */
		names.add("Grape");
		names.add("Banana");
		names.add("Plum");
		names.add("pear");	// NOTE: String.compareTo() sorts UpperCase 'P' before LowerCase 'p'
		
		/*
		 * ArrayList has a sort method too.
		 * 
		 * void 	sort(Comparator<? super E> c)
		 * Sorts this list according to the order induced by the specified Comparator.
		 */
		names.sort(null);		// we are NOT specifying a Comparator, so use null and use natural order.
	
		/*
		 * Advanced way to print all elements of container to console (std out):
		 * 
		 * Using forEach() method on each container to perform operation on each element.
		 * 
		 *  void 	forEach(Consumer<? super E> action)
		 *  Performs the given action for each element of the Iterable
		 *  until all elements have been processed or the action throws an exception.
		 *  
		 *  Consumer is a Functional interface, i.e.  specifies a single method:
		 *  
		 *  void 	accept(T t)
		 *  Performs this operation on the given argument.
		 *  
		 *  Using Lambda:
		 *  Lambda is a compact specification functionality 
		 *  (e.g. operation, method or function) 
		 *  which can be used like data.
		 *  
		 *  Basic Lambda syntax:
		 *  
		 *  (parameters ...) -> { one or more statements in body; };
		 *  
		 *  A Lambda can be provide an implementation for any 
		 *  Functional interface 
		 *  (e.g. Comparable, Consumer, Runnable, Comparator, etc.).
		 *  
		 *  		Consumer<String> printHorizontal = (e) -> System.out.println(e +", "); 
		 *  
		 *      The above is a Lambda implementation for the Consumer interface for String 
		 *      which Prints the String parameter (e) to standard out (std out) using System.out.println(e + ", ").
		 *      
		 */
		System.out.println(names.size() + " sorted names (natural order) in sequential container.");
		Consumer<String> printHorizontal = (e) -> System.out.println(e +", "); 
		names.forEach(printHorizontal);
		
		
		/*
		 * Use sort method with a Comparator (an anonymous inner class)
		 * The implementation of this Comparator class
		 * specifies a customized sort of String elements in Alphabetical (ignoring case) order.
		 */
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String string1, String string2) {
				return string1.compareToIgnoreCase(string2);
			}
		});
		System.out.println(names.size() + " sorted names (alphabetical, ignoring case order) in sequential container.");
		names.forEach(printHorizontal);
		
		/*
		 * Use sort method with a Comparator (a Lambda implementation)
		 * The implementation of this Comparator class
		 * specifies a customized sort of String elements in reversed alphabetized (ignoring case) order.
		 */
		System.out.println(names.size() + " sorted reverse alphabetized names in sequential container.");
		Comparator<String> reverseAlphabetizedStrings = (s1,s2) -> s2.compareToIgnoreCase(s1);
		names.sort(reverseAlphabetizedStrings);		// we are NOT specifying a Comparator, so use null
	}

	public void alphabetizeNames () {	
		List<String> names = new ArrayList<>(Arrays.asList("dan",  "Al", "Sue"));
		System.out.println(names.size() + " unsorted names in sequential container.");
		/*
		 * Show each element on Console
		 * (standard out, i.e. std out)
		 */
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();

		Collections.sort(names); 	// sort, natural order using Comparable interface implemented in String class
		System.out.println(names.size() + " natural order sorted names in sequential container.");
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();
		
		names.add("Don");	// add name to sequential container
		System.out.println(names.size() + " unsorted names in sequential container.");
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();

		/*
		 * ArrayList has a sort method too.
		 * 
		 * void 	sort(Comparator<? super E> c)
		 * Sorts this list according to the order induced by the specified Comparator.
		 */
		names.sort(null);		// we are NOT specifying a Comparator, so use null and use natural order.
		System.out.println(names.size() + " natural order sorted names in sequential container.");
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();
		
		/*
		 * Use sort method with a Comparator (an anonymous inner class)
		 * The implementation of this Comparator class
		 * specifies a customized sort of String elements in Alphabetical (ignoring case) order.
		 */
		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String string1, String string2) {
				return string1.compareToIgnoreCase(string2);
			}
		});
		System.out.println(names.size() + " alphabetized names (ignored case) in sequential container.");
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();
		
		names.add("sam");	// add name to sequential container
		names.add("Darrin");	// add name to sequential container
		names.add("alicia");	// add name to sequential container
		System.out.println(names.size() + " unsorted names in sequential container.");
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();


		/*
		 * Use sort method with a Comparator (a Lambda implementation)
		 * 
		 * Comparator Interface:
		 * 		int 	compare(T o1, T o2)
		 * 		Compares its two arguments for order.
		 * 
		 * The implementation of this Comparator class
		 * specifies a customized sort of String elements in reversed alphabetized (ignoring case) order.
		 *  
		 *  Using Lambda:
		 *  Lambda is a compact specification functionality 
		 *  (e.g. operation, method or function) 
		 *  which can be used like data.
		 *  
		 *  Basic Lambda syntax:
		 *  
		 *  (parameters ...) -> { one or more statements in body; };
		 *  
		 *  A Lambda can be provide an implementation for any 
		 *  Functional interface 
		 *  (e.g. Comparable, Consumer, Runnable, Comparator, etc.).
		 *  
		 *  		Comparator<String> alphabetizeIgnoreCase = (s1,s2) -> s1.compareToIgnoreCase(s2);
		 *  
		 *      The above is a Lambda implementation for the Comparator interface for String 
		 *      which compares two String parameters (s1,s2) but ignore case in comparison.
		 *      
		 */
		Comparator<String> alphabetizeIgnoreCase = (s1,s2) -> s1.compareToIgnoreCase(s2);
		names.sort(alphabetizeIgnoreCase);		// sort with a Comparator specifying  order.
		System.out.println(names.size() + " alphabetic order Strings (ignoring case)");
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();

		System.out.println(names.size() + " reverse alphabetic order Strings (ignoring case)");
		names.sort((s1,s2) -> s2.compareToIgnoreCase(s1));	// another Lambda implementation for Comparator.
		for (String s : names) {
			System.out.print(s + ", ");
		}
		System.out.println();
	}
	
	
	public static void demo() {
		System.out.println("\n\t" + DemoSort.class.getName() + "demo() starting...");
		/*
		 * Use default constructor.
		 * This default constructor is implicitly provided by compiler (javac)
		 * when there are no constructors are declared.
		 */
		DemoSort obj = new DemoSort();

		obj.sortIntegersNaturalOrder();
		obj.alphabetizeStrings();
		
		obj.sortStringsNaturalOrder();
//		obj.sortStringsIgnoreCase2();
		obj.sortStringsIgnoreCase();
//		obj.sortStringsIgnoreCase2();
		
//		obj.sortIntegers();
		obj.sortStringss();
//		obj.alphabetizeNames();
		
		System.out.println("\n" + DemoSort.class.getName() + "demo() done!");
	}

}
