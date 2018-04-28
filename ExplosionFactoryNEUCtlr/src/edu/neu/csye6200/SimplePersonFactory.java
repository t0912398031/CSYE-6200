package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class SimplePersonFactory {
	enum SimplePersonCriteria {
		STUDENT, EMPLOYEE
	}

	private SimplePersonFactory() {

	}

	public static AbstractPersonAPI getObject(SimplePersonCriteria criteria) {
		AbstractPersonAPI obj = null;
		if (criteria == SimplePersonCriteria.STUDENT) {
			obj = new Student();
		} else if (criteria == SimplePersonCriteria.EMPLOYEE) {
			obj = new Employee();
		}
		return obj;
	}

	public static AbstractPersonAPI getObject(SimplePersonCriteria criteria, int id, String firstName, String lastName,
			int age, double metric) {
		AbstractPersonAPI obj = null;
		if (criteria == SimplePersonCriteria.STUDENT) {
			obj = new Student(id, firstName, lastName, age, metric);
		} else if (criteria == SimplePersonCriteria.EMPLOYEE) {
			obj = new Employee(id, firstName, lastName, age, metric);
		}
		return obj;
	}

	public static void demo() {
		System.out.println("\n\t" + SimplePersonFactory.class.getName() + ".demo() starting...");

		/**
		 * Instantiate the Employee objects
		 * using Simple Person Factory
		 */
		AbstractPersonAPI e1 = SimplePersonFactory.getObject(SimplePersonCriteria.EMPLOYEE, 1, "Jim", "Peterson", 27,
				14.25);
		AbstractPersonAPI e2 = SimplePersonFactory.getObject(SimplePersonCriteria.EMPLOYEE, 1, "Janet", "Crane", 26,
				13.55);
		List<AbstractPersonAPI> newEmployees = new ArrayList<>();
		newEmployees.add(e1);
		newEmployees.add(e2);

		/**
		 * Instantiate the Student objects
		 */
		AbstractPersonAPI s1 = SimplePersonFactory.getObject(SimplePersonCriteria.STUDENT, 1, "Dan", "Peters", 17, 4.0);
		AbstractPersonAPI s2 = SimplePersonFactory.getObject(SimplePersonCriteria.STUDENT, 2, "Jane", "Seymore", 16,
				3.82);
		List<AbstractPersonAPI> newStudents = new ArrayList<>();
		newStudents.add(s1);
		newStudents.add(s2);

		/**
		 * Show the state of Northeastern University
		 */
		System.out.println("hiring " + newEmployees.size() + " new employees.");
		for (AbstractPersonAPI p : newEmployees) {
			p.show();
		}

		System.out.println("Enrolling " + newStudents.size() + " new students.");
		for (AbstractPersonAPI p : newStudents) {
			p.show();
		}
		System.out.println("\n" + SimplePersonFactory.class.getName() + ".demo() done!");
	}
}
