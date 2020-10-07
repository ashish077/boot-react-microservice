package com.example.studentdashboard.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.studentdashboard.entity.Student;
@Repository
public class StudentDAOImpl implements StudentDAO {

	// define field for entitymanager	
		private EntityManager entityManager;
			
		// set up constructor injection
		@Autowired
		public StudentDAOImpl(EntityManager theEntityManager) {
			entityManager = theEntityManager;
		}
		
	@Override
	public List<Student> getStudents() {
		Session session=entityManager.unwrap(Session.class);
		Query<Student> thequery=session.createQuery("from Student order by id",Student.class);
		List<Student> list=thequery.getResultList();
		list.forEach(System.out::println);
		return list;
	}

	@Override
	public void saveStudent(Student student) {
		// TODO Auto-generated method stub
//		Session session=sessionfactory.getCurrentSession();
//		
//		session.saveOrUpdate(student);
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
	public List<Student> searchStudent(String theSearchName) {
		// TODO Auto-generated method stub
//		Query query = null;
//		Session session=sessionfactory.getCurrentSession();
//        if(theSearchName !=null || theSearchName.trim().length()!=0)
//        {
//        	 query=session.createQuery("from Student where lower(firstName) like :theName or lower(lastName) like :theName",Student.class);
//        	
//        	 query.setParameter("theName","%"+ theSearchName.toLowerCase() + "%" );
//        }
//        	else {
//    			// theSearchName is empty ... so just get all customers
//    			query =session.createQuery("from Student", Student.class);			
//    		}
//    		
//    		// execute query and get result list
//    		List<Student> student = query.getResultList();
//    				
//    		// return the results		
//    		return student;	
		return null;
    		
	}
                
		
	

}
