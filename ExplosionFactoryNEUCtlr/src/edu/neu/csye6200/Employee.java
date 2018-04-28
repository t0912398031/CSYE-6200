package edu.neu.csye6200;

public class Employee extends Person {
	private Double wage;

	public Employee() {
		super();
		this.wage = 1.0;
	}

	public Employee(int id, String firstName, String lastName, int age, double wage) {
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
	public String toString() {
		StringBuilder info = new StringBuilder(super.toString());
		info.append(", gainfully employed earning a Wage of: $").append(this.getWage());
		return info.toString();
	}
}
