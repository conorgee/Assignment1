package assignment1;
import java.text.ParseException;
import java.text.*;
import java.util.*;

import org.joda.time.DateTime;

import assignment1.Module;

public class Lecturer {
	public String name;
	public int age;
	public Date dob;
	public int id;
	public String username;
	public List<Module> modules;
	public CourseProgramme course;

	public Lecturer(String name, int age, String dob, int id, List<Module> modules,
			CourseProgramme courses)  {
		super();
		this.name = name;
		this.age = age;
		try {
			this.dob=new SimpleDateFormat("dd/MM/yyyy").parse(dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		this.id = id;
		this.username= getUsername();
		this.modules = modules;
		this.course = courses;
	}
	public String getUsername() {
		
		return ""+name+""+age;
		
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public List<Module> getModules() {
		return modules;
	}
	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	public CourseProgramme getCourse() {
		return course;
	}
	public void setCourse(CourseProgramme course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Lecturer [name=" + name + ", age=" + age + ", dob=" + dob + ", id=" + id + ", username=" + username
				+ ", modules=" + modules + ", course=" + course + "]";
	}

}
