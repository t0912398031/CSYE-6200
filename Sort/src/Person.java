package edu.neu.csye6200;

public class Person extends AbstractPersonAPI {
	private Integer id;
	private String firstName;
	private String lastName;
	private Integer age;
	
	public Person() {
		super();
		this.init(1, "John", "Doe", 1);
	}

	public Person(Integer id, String firstName, String lastName, Integer age) {
		super();
		this.init(id, firstName, lastName, age);
	}

	private void init(Integer id, String firstName, String lastName, Integer age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
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
