package com.example.studentdashboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentdashboard.dao.StudentDAO;
import com.example.studentdashboard.entity.Student;
@Service
public class StudentServiceImpl implements studentService {
    
	@Autowired
	 StudentDAO studentdao;
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		
		return studentdao.getStudents();
	}

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> searchStudents(String theSearchName) {
		// TODO Auto-generated method stub
		return null;
	}

}
