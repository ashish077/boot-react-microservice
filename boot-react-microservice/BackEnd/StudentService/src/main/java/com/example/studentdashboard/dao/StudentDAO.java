package com.example.studentdashboard.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.studentdashboard.entity.Student;


public interface StudentDAO {

	
	public List<Student> getStudents();
	
	public void saveStudent(Student student);
	
	public Student getStudent(int id);
	
	public void deleteStudent(int id);
	
	public List<Student> searchStudent(String theSearchName);
	
}
