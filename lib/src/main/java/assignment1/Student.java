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
	public ArrayList<String> modules = new ArrayList<String>();
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
	public String getModules() {
		String ii = "";
		String s;
		for (int i = 0; i < modules.size(); i++) {
          s= modules.get(i);
          ii+=s+", ";
          }
		return ii;
	}

	public String getCourse() {
		String ii = "";
		CourseProgramme s;
		for (int i = 0; i < course.size(); i++) {
          s= course.get(i);
          ii+=s.getName()+", ";
          }
		return ii;
	}

	public void setModules(ArrayList<String> modules) {
		this.modules = modules;
	}
	public void setCourse(List<CourseProgramme> course) {
		this.course = course;
	}
	@Override
	public String toString() {
		modules.clear();
		int count = 0; 
		 while (course.size() > count) {
			 
			 CourseProgramme j	= course.get(count);
			 modules.add(j.getModuleString());
		         count++;
		      }
		return "Student [name=" + name + ", age=" + age + ", dob=" + dob + ", id=" + id + ", username=" + username
				+ ", modules=" + getModules() + " course=" + getCourse() + "]\n";
	}
	

}
