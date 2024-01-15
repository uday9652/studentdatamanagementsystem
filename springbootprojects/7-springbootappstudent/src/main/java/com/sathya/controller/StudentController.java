package com.sathya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sathya.model.Student;
import com.sathya.service.StudentServiceImp;

@Controller
public class StudentController {
	@Autowired
	private  StudentServiceImp service;
	
	@RequestMapping("/")
	public String homepage()
	{
		return "home";
			
	}
	@RequestMapping("/addstudent")
	public String addstudent()
	{
		return "addstudentform";
		
	}
	@RequestMapping("/register")
	public String register(Student student)
	{
		service.saveStudent(student);
		
		return "success";
		
	}
	@RequestMapping("/viewstudents")
	public String viewstudents(ModelMap model)
	{
		model.put("service", service.getAllStudents());
		return "viewform";
		
	}
	@RequestMapping("/delete/{rollno}")
	public String delete(@PathVariable int rollno) 
	{
		service.deleteStudent(rollno);
		return "redirect:/viewstudents";
		
	}
	@RequestMapping("/edit/{rollno}")
	public String edit(@PathVariable int rollno,ModelMap model) 
	{
		model.put("command", service.getStudent(rollno));
		return "editform";
		
	}
	@RequestMapping("/editandsave")
	public String editandsave(Student  student) 
	{
		service.updateStudent(student);
		return "redirect:/viewstudents";
		
	}
	
	
	
	
	
	

}
