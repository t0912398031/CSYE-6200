package edu.neu.csye6200;

public class Student extends Person {
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
}
