package com.sathya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import com.sathya.model.Student;
import com.sathya.repo.StudentRepo;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentRepo repo;

	@Override
	public Student saveStudent(Student student) {
		int total=0;
		double percentage=0.0;
		String result=null;
		String grade=null;
		total=student.getHibernate()+student.getSpring()+student.getSpringboot();
		percentage=total/3;
		if(percentage>=70)
		{
			grade="A grade";
		}
		else if(percentage>=60)
		{
			grade="B grade";
		}
		else if(percentage>=50)
		{
			grade="C grade";
		}
		else
		{
			grade="D grade";
		}
		if(student.getHibernate()>=35 && student.getSpring()>=35 && student.getSpringboot()>=35)
		{
			result="pass";
		}
		else
		{
			result="fail";
		}
		student.setTotal(total);
		student.setPercentage(percentage);
		student.setGrade(grade);
		student.setResult(result);
		repo.save(student);
		return student;
		
	}
	@Override
	public List<Student> getAllStudents() {
		List<Student> student= repo.findAll();
		return student;
	}
	@Override
	public void deleteStudent(int rollno) {
		repo.deleteById(rollno);

	}

	@Override
	public Student updateStudent(Student student) {
		int total=0;
		double percentage=0.0;
		String result=null;
		String grade=null;
		total=student.getHibernate()+student.getSpring()+student.getSpringboot();
		percentage=total/3;
		if(percentage>=70)
		{
			grade="A grade";
		}
		else if(percentage>=60)
		{
			grade="B grade";
		}
		else if(percentage>=50)
		{
			grade="C grade";
		}
		else
		{
			grade="D grade";
		}
		if(student.getHibernate()>=35 && student.getSpring()>=35 && student.getSpringboot()>=35)
		{
			result="pass";
		}
		else
		{
			result="fail";
		}
		student.setTotal(total);
		student.setPercentage(percentage);
		student.setGrade(grade);
		student.setResult(result);
		repo.save(student);
		return student;
		
		
	}

	

	@Override
	public Student getStudent(int rollno) {
		Student s2=repo.findById(rollno).get();
		return s2;
	}

	

}
