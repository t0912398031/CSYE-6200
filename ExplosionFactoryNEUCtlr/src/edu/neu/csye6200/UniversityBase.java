package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class UniversityBase extends AbstractSchoolAPI {
	int id;
	String name;
	private List<AbstractPersonAPI> employees;
	private List<AbstractPersonAPI> students;
	
	private void init(int id, String name) {
		this.id = id;
		this.name = name;
		this.employees = new ArrayList<>();
		this.students = new ArrayList<>();
	}
	
	public UniversityBase() {
		super();
		init(1, "Default University");
	}

	public UniversityBase(int id, String name) {
		super();
		init(id, name);
	}

	public List<AbstractPersonAPI> getEmployees() {
		return employees;
	}

	public void setEmployees(List<AbstractPersonAPI> employees) {
		this.employees = employees;
	}

	public List<AbstractPersonAPI> getStudents() {
		return students;
	}

	public void setStudents(List<AbstractPersonAPI> students) {
		this.students = students;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addEmployee(AbstractPersonAPI employee) {
		this.employees.add(employee);
	}

	public void addStudent(AbstractPersonAPI student) {
		this.students.add(student);
	}
	
	public String getEmployeesInfo() {
		StringBuilder info = new StringBuilder("Employees: ");
		info.append(this.employees.size() + " employees employed.\n");
		for (AbstractPersonAPI employee : employees) {
			info.append(employee.toString() + "\n");
		}
		return info.toString();
	}
	
	public void showEmployees() {
		System.out.println(this.getEmployeesInfo());
	}
	
	public String getStudentsInfo() {
		StringBuilder info = new StringBuilder("Employees: ");
		info.append(this.students.size() + " students enrolled.\n");
		for (AbstractPersonAPI student : this.students) {
			info.append(student.toString() + "\n");
		}
		return info.toString();
	}
	
	public void showStudents() {
		System.out.println(this.getStudentsInfo());
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("[" + this.getId() +"] " + this.getName() + " \n");
		info.append(this.getEmployeesInfo());
		info.append(this.getStudentsInfo());
		return info.toString();
	}
	
	@Override
	public void show() {
		System.out.println(toString());
	}

	public static void demo() {
		
	}
}
