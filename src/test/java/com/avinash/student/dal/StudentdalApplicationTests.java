package com.avinash.student.dal;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.avinash.student.dal.entities.Student;
import com.avinash.student.dal.repos.StudentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentdalApplicationTests {
	@Autowired
	private StudentRepository studentRepository;
	
	@Test
	public void testCreateStudent() {
		Student student = new Student();
		student.setName("Avinash");
		student.setCourse("Java web services");
		student.setFee(30d);
		studentRepository.save(student);
	}
	
	@Test
	public void testFindStudentById() {
		Optional<Student> student = studentRepository.findById(1l);
		System.out.println(student);
	}
	
	@Test
	public void testUpdateStudent() {
		Optional<Student> student = studentRepository.findById(1l);
		Student student2 = student.get();
		student2.setFee(40d);
		studentRepository.save(student2);
	}
	
	@Test
	public void testDeleteStudent() {
		studentRepository.deleteById(1L);
	}
}
