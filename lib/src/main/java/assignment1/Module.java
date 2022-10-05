package assignment1;
import java.util.*;

public class Module {

	public String name;
	public List<Student> students;
	public List<Lecturer> lecturer;
	public CourseProgramme course;

	public Module(String name, List<Student> students, List<Lecturer> lecturer,
			CourseProgramme course) {
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


	public List<Student> getStudents() {
		return students;
	}


	public void setStudents(List<Student> students) {
		this.students = students;
	}


	public List<Lecturer> getLecturer() {
		return lecturer;
	}


	public void setLecturer(List<Lecturer> lecturer) {
		this.lecturer = lecturer;
	}


	public CourseProgramme getCourse() {
		return course;
	}


	public void setCourse(CourseProgramme course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "Module [name=" + name + ", students=" + students + ", lecturer=" + lecturer + ", course=" + course
				+ "]";
	}



	

}
