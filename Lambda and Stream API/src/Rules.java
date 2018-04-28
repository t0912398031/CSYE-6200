package edu.neu.csye6200;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Rules {

	private class Child implements Comparable<Child> {
		private Integer age = 0;
		private String name = null;
		
		public Child() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Child(Integer age, String name) {
			super();
			this.age = age;
			this.name = name;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(name);
			sb.append(", Age: ").append(age);
			return sb.toString();
		}
		@Override
		public int compareTo(Child o) {
			return this.getAge().compareTo(o.getAge());
		}
	}
	
	public void simpleFilterInt() {
		System.out.println("\n simpleFilterInt: . . .");
		List<Integer> ages = Arrays.asList(11,12,10,13,9,14,8,15,7,16,6,17,5,18,4,19,3,20,2,21,1,22);
		ages.forEach((n)-> System.out.print(n + " "));
		System.out.println(" : random set of ages.");
		ages.stream().sorted().forEach((n)-> System.out.print(n + " "));		
		System.out.println(" : sorted set of ages.");
		
		Predicate<Integer> age4AndUnder = (n)-> n < 4;
		Predicate<Integer> age7AndUnder = (n)-> n < 7;

		int target = 4;
		ages.stream().sorted().filter(age4AndUnder).forEach((n)-> System.out.print(n + " "));	
		System.out.println(" : set of ages at or below " + target);
		
		target = 7;
		ages.stream().sorted().filter(age7AndUnder).forEach((n)-> System.out.print(n + " "));		
		System.out.println(" : set of ages at or below " + target);

		System.out.println("\n done!");
	}
	
	public void simpleFilterByAge() {
		System.out.println("\n simpleFilterByAge: . . .");
		List<Child> people = Arrays.asList(
				new Child(12, "Jimmy"), 	new Child(14, "Jessie"), 
				new Child(23, "Sally"), 	new Child(12, "Jackie"), 
				new Child(62, "Lizzy"), 	new Child(27, "Laurie"), 
				new Child(32, "Markie"), 	new Child(12, "Cathy"), 
				new Child(12, "Johnny"), 	new Child(63, "Millie"), 
				new Child(48, "Bobby"), 	new Child(34, "Ruthy"), 
				new Child(26, "Billy"), 	new Child(53, "Stanley"), 
				new Child(40, "Evie"), 	new Child(41, "Mary"), 
				new Child(29, "Becky"), 	new Child(30, "Annie") 
				);
		people.forEach((n)-> System.out.print(n + " "));
		System.out.println(" : random set of ages.");
		people.stream().sorted().forEach((n)-> System.out.print(n + " "));		
		System.out.println(" : sorted set of ages.");

		Predicate<Child> age23AndUnder = (a)-> a.getAge().compareTo(23) <= 0;
		Predicate<Child> age40AndUnder = (a)-> a.getAge().compareTo(40) <= 0;
//		Predicate<Human> ageFirst3ONLY = ()-> { static int i=1; return i++ < 3; } ;

		int target = 23;
		people.stream().sorted().filter(age23AndUnder).forEach((n)-> System.out.print(n + " "));	
		System.out.println(" : set of ages at or below " + target);
		
		target = 40;
		people.stream().sorted().filter(age40AndUnder).forEach((n)-> System.out.print(n + " "));		
		System.out.println(" : set of ages at or below " + target);
		
//		target = 40;
//		people.stream().sorted().filter(age40AndUnder).filter(age40AndUnder).forEach((n)-> System.out.print(n + " "));		
//		System.out.println(" : set of ages at or below " + target);
		
		System.out.println("\n done!");
	}
	
	public static void demo() {
		System.out.println("\n\t" + Rules.class.getName() + ".demo() starting ...");
		Rules obj = new Rules();
		
		obj.simpleFilterInt();
		obj.simpleFilterByAge();
		System.out.println("\n\t" + Rules.class.getName() + ".demo() done!");
	}

}
