package assignment1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import org.joda.time.DateTime;

public class Student {
	public String name;
	public int age;
	public Date dob;
	public int id;
	public String username;
	public List<Module> modules;
	public List<CourseProgramme> course;

	public Student(String name, int age, String dob, int id,
			List<CourseProgramme> course) {
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
		this.username = getUsername();
		this.course=course;
		this.modules = new ArrayList<Module>();
		 int count = 0; 	
		 while (course.size() > count) {
			 CourseProgramme j	= course.get(count);
			 modules.addAll(j.getModule());
		         count++;
		      }

	
	
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

}
