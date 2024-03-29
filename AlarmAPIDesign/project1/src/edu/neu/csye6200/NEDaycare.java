package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class NEDaycare {
	
	private List<Student> studentList;
	private String name;
	
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addStu(String name, int dobYear, int dobMonth, int dobDay, int vacInterval, int vacFreq) {
		this.getStudentList().add(new Student(name, dobYear, dobMonth, dobDay, vacInterval, vacFreq));
	}
	
	public NEDaycare() {
		super();
		this.studentList = new ArrayList<>();
	}
	public static void demo() {
		NEDaycare neDaycare = new NEDaycare();
		neDaycare.addStu("Jay", 2015, 12, 21, 6, 3);
		neDaycare.addStu("Dan", 2016, 4, 21, 6, 3);
		neDaycare.getStudentList().stream().forEach(n->n.showAlarm());
	}
	

}
