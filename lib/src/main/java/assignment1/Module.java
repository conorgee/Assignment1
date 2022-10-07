package assignment1;
import java.util.*;

public class Module {

	public String name;
	public List<Student> students;
	public List<Lecturer> lecturer;
	public List<CourseProgramme> course;

	public Module(String name, List<Student> students, List<Lecturer> lecturer,
			List<CourseProgramme> course) {
		super();
		this.name = name;
		this.students = students;
		this.course = course;
		this.lecturer = lecturer;
	}


	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}


	public void setLecturer(List<Lecturer> lecturer) {
		this.lecturer = lecturer;
	}



	public void setCourse(List<CourseProgramme> course) {
		this.course = course;
	}
	
	public String getLecturer() {
		String ii = "";
		Lecturer s;
		for (int i = 0; i < lecturer.size(); i++) {
          s= lecturer.get(i);
          ii+=s.getName()+", ";
          }
		return ii;
	}
	
	public String getStudent() {
		String ii = "";
		Student s;
		for (int i = 0; i < students.size(); i++) {
          s= students.get(i);
          ii+=s.getName()+", ";
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

	@Override
	public String toString() {
		return "Module [name=" + name + ", students=" + getStudent() + ", lecturer=" + getLecturer() + ", course=" + getCourse()
				+ "]\n";
	}






}
