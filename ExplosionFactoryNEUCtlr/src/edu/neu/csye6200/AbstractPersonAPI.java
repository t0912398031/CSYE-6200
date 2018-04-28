package edu.neu.csye6200;

public abstract class AbstractPersonAPI {
	/**
	 * API
	 */
	public abstract void show();
}

/**
 * Given the API specified in the above abstract class AbstractPersonAPI:
 * 
 * 1. Implement a Person class that inherits the AbstractPersonAPI
 * 2. Implement a Student class derived from the Person class.
 * 3. Implement an Employee class derived from the Person class.
 *
 * Perform all the following by filling in the blanks in the following code fragment:
 * 
 * NOTE: the following code fragment is found in Person.java:
 
public class Person  [a]  [b]  {
	[c] int id;
	[d] String firstName;
	[e] String lastName;
	[f] int age;
	
	[g] [h]() {
		super();
		this.init(1, "John", "Doe", 1);
	}

	[i] [j](int id, String firstName, String lastName, int age) {
		super();
		this.init(id, firstName, lastName, age);
	}

	private void init(int id, String firstName, String lastName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
 . . .
  * NOTE: the following code fragment is found in Student.java:
  
public class Student [k]  [l]  {
	[m] Double gpa;

	[n] [o]() {
		super();
		this.gpa = 1.0;
	}

	[p] [q](int id, String firstName, String lastName, int age, double gpa) {
		super(id, firstName, lastName, age);
		this.gpa = gpa;
	}

	public Double getGpa() {
		return gpa;
	}

	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}

 . . .
   * NOTE: the following code fragment is found in Employee.java:

     public class Employee [r]  [s]  {
	[t] Double wage;

	[u] [v]() {
		super();
		this.wage = 1.0;
	}

	[w] [x](int id, String firstName, String lastName, int age, double wage) {
		super(id, firstName, lastName, age);
		this.wage = wage;
	}

	public Double getWage() {
		return wage;
	}

	public void setWage(Double wage) {
		this.wage = wage;
	}
	
	@Override
	public String [y]() {
		StringBuilder info = new StringBuilder(super.toString());
		info.append(", gainfully employed earning a Wage of: $").append(this.getWage());
		return info.toString();
	}
 . . .
 */

/**
 * ANSWER KEY class Person 
 * 
[a]
\s*extends\s*
[b]
\s*AbstractPersonAPI\s*

[c]
\s*private\s*
[d]
\s*private\s*
[e]
\s*private\s*
[f]
\s*private\s*

[g]
\s*public\s*
[h]
\s*Person\s*

[i]
\s*public\s*
[j]
\s*Person\s*

 */

/**
 * ANSWER KEY class Student 
 * 
[k]
\s*extends\s*
[l]
\s*Person\s*

[m]
\s*private\s*

[n]
\s*public\s*
[o]
\s*Student\s*

[p]
\s*public\s*
[q]
\s*Student\s*

 */

/**
 * ANSWER KEY class Employee 
 * 
[r]
\s*extends\s*
[s]
\s*Person\s*

[t]
\s*private\s*

[u]
\s*public\s*
[v]
\s*Employee\s*

[w]
\s*public\s*
[x]
\s*Employee\s*

[y]
\s*toString\s*

 */

