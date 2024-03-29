package project1;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String name;
	private int dobYear;
	private int dobMonth;
	private int dobDay;
	private int vacInterval=3;
	private int vacFreq=6;
	private List<Alarm> alarms;
	
	
	public Student() {
		this.alarms = new ArrayList<>();
		this.addRegisterAlarm();
		this.addVaccineAlarm();
	}
	
	
	public Student(String name, int dobYear, int dobMonth, int dobDay, int vacInterval, int vacFreq) {
		super();
		this.name = name;
		this.dobYear = dobYear;
		this.dobMonth = dobMonth;
		this.dobDay = dobDay;
		this.vacInterval = vacInterval;
		this.vacFreq = vacFreq;
		this.alarms = new ArrayList<>();
		this.addRegisterAlarm();
		this.addVaccineAlarm();
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDobYear() {
		return dobYear;
	}
	public void setDobYear(int dobYear) {
		this.dobYear = dobYear;
	}
	public int getDobMonth() {
		return dobMonth;
	}
	public void setDobMonth(int dobMonth) {
		this.dobMonth = dobMonth;
	}
	public int getDobDay() {
		return dobDay;
	}
	public void setDobDay(int dobDay) {
		this.dobDay = dobDay;
	}
	public List<Alarm> getAlarms() {
		return alarms;
	}
	
	public int getVacInterval() {
		return vacInterval;
	}
	public void setVacInterval(int vacInterval) {
		this.vacInterval = vacInterval;
	}
	public int getVacFreq() {
		return vacFreq;
	}
	public void setVacFreq(int vacFreq) {
		this.vacFreq = vacFreq;
	}
	public Alarm addRegisterAlarm() {
		Alarm regAlarm = new RegistrationAlarm(dobYear, dobMonth, dobDay);
		this.alarms.add(regAlarm);
		return regAlarm;
	}
	public Alarm addVaccineAlarm() {
		Alarm vacAlarm = new VaccineAlarm(dobYear, dobMonth, dobDay, vacInterval, vacFreq);
		this.alarms.add(vacAlarm);
		return vacAlarm;
	}
	
	public void showAlarm() {
		System.out.println("\n I am "+this.getName()+"\n");
		this.getAlarms().stream().forEach(n->n.alarm());
	}
	
	

}
