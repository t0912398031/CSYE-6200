package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class NortheasternU extends UniversityBase {

	public NortheasternU() {
		super();
	}

	public NortheasternU(int id, String name) {
		super(id, name);
	}

	public static void demo() {
		System.out.println("\n\t" + NortheasternU.class.getName() + ".demo() starting...");
		
		/**
		 * Northeastern University controlling object
		 */
		UniversityBase neu = new NortheasternU(77,"Northeastern University");

		/**
		 * Instantiate the Employee objects
		 */
		Employee e1 = new Employee(1, "Jim", "Peterson", 27, 14.25);
		Employee e2 = new Employee(1, "Janet", "Crane", 26, 13.55);
		List<AbstractPersonAPI> newEmployees = new ArrayList<>();
		newEmployees.add(e1);
		newEmployees.add(e2);

		/**
		 * Instantiate the Student objects
		 */
		Student s1 = new Student(1, "Dan", "Peters", 17, 4.0);
		Student s2 = new Student(2, "Jane", "Seymore", 16, 3.82);
		List<AbstractPersonAPI> newStudents = new ArrayList<>();
		newStudents.add(s1);
		newStudents.add(s2);
		
		/**
		 * Add Employees to Northeastern University
		 */
		System.out.println("hiring " + newEmployees.size() + " new employees.");
		for (AbstractPersonAPI p : newEmployees) {
			neu.addEmployee(p);
		}
		
		/**
		 * Add Student to Northeastern University
		 */
		System.out.println("Enrolling " + newStudents.size() + " new students.");
		for (AbstractPersonAPI p : newStudents) {
			neu.addStudent(p);
		}
		
		/**
		 * Show the state of Northeastern University
		 */
		neu.show();
		
		System.out.println("\n" + neu.getClass().getName() + ".demo() done!");
	}

}
