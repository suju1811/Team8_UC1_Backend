package com.studentinfo.springserver;

import com.studentinfo.springserver.model.student.Student;
import com.studentinfo.springserver.model.student.StudentDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringserverApplicationTests {

	@Autowired
	private StudentDao studentDao;
	@Test
	void addStudentTest(){
		Student student = new Student();
		student.setStudent_First_Name("Sayali");
		student.setStudent_Last_Name("Sawant");
		studentDao.save(student);
	}
	//@Test
	void getAllStudents(){
		List<Student> students = studentDao.getAllStudent();
		System.out.println(students);
	}
}
