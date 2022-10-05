package assignment1;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.util.*;

import org.joda.time.DateTime;
import org.junit.jupiter.api.*;
import assignment1.Module;

class test {
//	Lecturer(String name, int age, String dob, int id, List<Module> modules,
	//List<CourseProgramme> courses) throws ParseException {
	

	@Test
	void testSetUP() {
		DateTime start1 = new DateTime(2013,8,14,0,0,0);
		DateTime end1 = new DateTime(2013,8,16,0,0,0);
		List<Student> students = new ArrayList<Student>();
		List<Module> modules = new ArrayList<Module>();
		List<Lecturer> lecturers = new ArrayList<Lecturer>();
		CourseProgramme literature = new CourseProgramme("literature",modules,students,start1,end1);
		Student john = new Student("John McGuinness", 23,"22/6/1999", 1, literature.getModule(),literature);
		Lecturer jim = new Lecturer("Jim McGuinness", 65,"22/6/1945", 1, literature.getModule(),literature);
		Module english = new Module("english",students, lecturers,literature);
		modules.add(english);
		students.add(john);
		lecturers.add(jim);
		
		assertEquals("John McGuinness23",john.getUsername());
	}
      @Test
	void testLecturer() {
		DateTime start1 = new DateTime(2013,8,14,0,0,0);
		DateTime end1 = new DateTime(2013,8,16,0,0,0);
		List<Student> students = new ArrayList<Student>();
		List<Module> modules = new ArrayList<Module>();
		List<Lecturer> lecturers = new ArrayList<Lecturer>();
		CourseProgramme literature = new CourseProgramme("literature",modules,students,start1,end1);
		Student john = new Student("John McGuinness", 23,"22/6/1999", 1, literature.getModule(),literature);
		Lecturer jim = new Lecturer("Jim McGuinness", 65,"22/6/1945", 1, literature.getModule(),literature);
		Module english = new Module("english",students, lecturers,literature);
		modules.add(english);
		students.add(john);
		lecturers.add(jim);
		
		assertEquals("Jim McGuinness65",jim.getUsername());
	}
		
	}

