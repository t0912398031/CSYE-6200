package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student extends Person implements Comparable<Student> {
	private Double gpa;

	public Student() {
		super();
		this.gpa = 1.0;
	}

	public Student(int id, String firstName, String lastName, int age, double gpa) {
		super(id, firstName, lastName, age);
		this.gpa = gpa;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		StringBuilder info = new StringBuilder(super.toString());
		info.append(", is a student having a GPA of: ").append(this.getGpa());
		return info.toString();
	}
	
	
	/**
	 * Student LAST NAME comparator static method
	 * @param o1		Student object #1 for comparison
	 * @param o2		Student object #2 for comparison
	 * @return		integer result of comparison
	 */
	public static int compareByLastName(Student o1, Student o2) {
		return o1.getLastName().compareToIgnoreCase(o2.getLastName());
	}
	
	/**
	 * Student FIRST NAME comparator static method
	 * @param o1		Student object #1 for comparison
	 * @param o2		Student object #2 for comparison
	 * @return		integer result of comparison
	 */
	public static int compareByFirstName(Student o1, Student o2) {
		return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
	}
	
	/**
	 * Student AGE comparator static method
	 * @param o1		Student object #1 for comparison
	 * @param o2		Student object #2 for comparison
	 * @return		integer result of comparison
	 */
	public static int compareByAge(Student o1, Student o2) {
		return Integer.compare(o1.getAge(),o2.getAge());
	}
	
	/**
	 * Student comparator Lambda expressions
	 * @param s1		Student object #1 for comparison
	 * @param s2		Student object #2 for comparison
	 * @return		integer result of comparison
	 */
	public static Comparator<Student> compareStudentsByID = (s1,s2) -> s1.getId().compareTo(s2.getId());
	public static Comparator<Student> compareStudentsByAge = (s1,s2) -> s1.getAge().compareTo(s2.getAge());
	public static Comparator<Student> compareStudentsByFirstName = (s1,s2) -> s1.getFirstName().compareToIgnoreCase(s2.getFirstName());
	public static Comparator<Student> compareStudentsByLastName = (s1,s2) -> s1.getLastName().compareToIgnoreCase(s2.getLastName());
	public static Comparator<Student> compareStudentsByGPA = (s1,s2) -> s2.getGpa().compareTo(s1.getGpa());

	/**
	 * Implement Comparable so Student can be sorted in Natural order (by GPA)
	 */
	@Override
	public int compareTo(Student o) {
//		return o.gpa.compareTo(this.gpa);	// hi to low
		return this.gpa.compareTo(o.gpa);	// low to hi
	}
	
	public static void demo() {
		System.out.println("\n\t" + Student.class.getName() + "demo() starting...");
//		List<Student> students = new ArrayList<>();
//		students.add(new Student(1, "Don", "Peters", 27, 3.2));
//		students.add(new Student(1, "Dan", "Peterson", 17, 4.0));
//		students.add(new Student(1, "Dean", "Petersen", 37, 2.5));
		List<Student> students = new ArrayList<>();
		students.add(new Student(44, "barack", "obama", 56, 3.2));
		students.add(new Student(45, "donald", "trump", 71, 2.25));	
		students.add(new Student(12, "zachary", "taylor", 65, 4.0));	
		students.add(new Student(2, "john", "adams", 90, 3.0));	
		students.add(new Student(1, "george", "washington", 67, 2.5));
		
		/*
		 * Sort the collection of Student objects by Natural order
		 * (Student class implements Comparable interface)
		 */
		System.out.println(students.size() + " students in the following collection: 1. SORTED BY GPA.");
		Collections.sort(students);
		for (Student s : students) {
			System.out.println(s);
		}
		
		System.out.println(students.size() + " students in the following collection: 2. SORTED BY GPA.");
		students.sort(null);		// no comparator, natural order: student implements Comparable
		students.forEach(System.out::println);

		System.out.println(students.size() + " students in the following collection: 3. SORTED BY FIRST NAME.");
		students.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
			}
		});
		students.forEach(System.out::println);
				
		System.out.println(students.size() + " students in the following collection: 4. SORTED BY LAST NAME.");
		students.sort(Student::compareByLastName); // use a static comparator in class
		students.forEach(System.out::println);
		
		System.out.println(students.size() + " students in the following collection: 5. SORTED BY AGE.");
		students.sort(Student::compareByAge); // use a static comparator in class
		students.forEach(System.out::println);
		
		System.out.println(students.size() + " students in the following collection: 6. SORTED BY FIRST NAME.");
		Collections.sort(students, Student::compareByFirstName); // use a static comparator in class
		students.forEach(System.out::println);
		
		System.out.println(students.size() + " students in the following collection: 7. SORTED BY LAST NAME.");
		Collections.sort(students, Student::compareByLastName); // use a static comparator in class
		students.forEach(System.out::println);
		
		System.out.println(students.size() + " students in the following collection: 8. SORTED BY AGE.");
		Collections.sort(students, Student::compareByAge); // use a static comparator in class
		students.forEach(System.out::println);
		System.out.println("\n" + Student.class.getName() + "demo() done!");
	}
	/*
	 * CONSOLE OUTPUT:
Person: Dan Peters, age: 17, id: 1, is a student having a GPA of: 4.0
Person: Don Peters, age: 27, id: 1, is a student having a GPA of: 3.2
Person: Dean Peters, age: 37, id: 1, is a student having a GPA of: 2.5
3 students in this collection.

Person: Dean Peters, age: 37, id: 1, is a student having a GPA of: 2.5
Person: Don Peters, age: 27, id: 1, is a student having a GPA of: 3.2
Person: Dan Peters, age: 17, id: 1, is a student having a GPA of: 4.0
3 students in this collection.

	 */
}
