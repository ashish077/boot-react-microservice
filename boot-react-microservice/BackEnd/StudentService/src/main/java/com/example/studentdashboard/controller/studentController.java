package com.example.studentdashboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentdashboard.service.studentService;
import com.example.studentdashboard.entity.*;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins="*")
public class studentController{

	@Autowired
	private studentService studentservice;
	
	@GetMapping("/showstudents")
	
	public List<?> showStudents(Model model)
	{
		List<Student> students=studentservice.getStudents();
		
		
		return students;
	}
}
