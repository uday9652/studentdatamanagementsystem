package com.sathya.service;

import java.util.List;

import com.sathya.model.Student;

public interface StudentService {
	public Student saveStudent(Student student);
	public Student updateStudent(Student student);
	public void deleteStudent(int rollno);
	public Student getStudent(int rollno);
	public  List<Student> getAllStudents();
	

}
