package assignment1;
import java.util.*;
import org.joda.time.*;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import assignment1.Module;

public class CourseProgramme {
	public String name;
	public List<Module> module;
	public List<Student> student;
	public DateTime startDate;
	public DateTime endDate;

	
	public CourseProgramme(String name, List<Module> module, List<Student>  student,
			DateTime startDate,DateTime endDate) {
		super();
		this.name = name;
		this.module = module;
		this.student = student;
		this.startDate =startDate;
		this.endDate = endDate;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public void setModule(List<Module> module) {
		this.module = module;
	}




	public void setStudent(List<Student> student) {
		this.student = student;
	}


	public DateTime getStartDate() {
		return startDate;
	}


	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}


	public DateTime getEndDate() {
		return endDate;
	}


	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}

	public List<Module> getModule() {
		return module;
	}

	public String getModuleString() {
		String ii = "";
		Module s;
		for (int i = 0; i < module.size(); i++) {
          s= module.get(i);
          ii+=s.getName()+", ";
          }
		return ii;
	}
	
	public String getStudent() {
		String ii = "";
		Student s;
		for (int i = 0; i < student.size(); i++) {
          s= student.get(i);
          ii+=s.getName()+", ";
          }
		return ii;
	}
	

	
	@Override
	public String toString() {
		return "CourseProgramme [name=" + name + ", module=" + getModuleString() + ", student=" + getStudent() + ", startDate="
				+ startDate + ", endDate=" + endDate + "]";
	}


	
}
