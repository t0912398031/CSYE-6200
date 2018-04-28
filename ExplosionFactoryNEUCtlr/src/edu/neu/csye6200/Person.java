package edu.neu.csye6200;

public class Person extends AbstractPersonAPI {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	
	public Person() {
		super();
		this.init(1, "John", "Doe", 1);
	}

	public Person(int id, String firstName, String lastName, int age) {
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

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("Person: ");
		info.append(this.getFirstName());
		info.append(" ").append(this.getLastName());
		info.append(", age: ").append(this.getAge());
		info.append(", id: ").append(this.getId());
		return info.toString();
	}
	
	@Override
	public void show() {
		System.out.println(this.toString());
	}

}
