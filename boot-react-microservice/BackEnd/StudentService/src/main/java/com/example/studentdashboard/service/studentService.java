package com.example.studentdashboard.service;

import java.util.List;

import com.example.studentdashboard.entity.Student;

public interface studentService {

	
	public List<Student> getStudents();

	public void saveStudent(Student student);

	public Student getStudent(int id);

	public void deleteStudent(int id);

	public List<Student> searchStudents(String theSearchName);  

}
