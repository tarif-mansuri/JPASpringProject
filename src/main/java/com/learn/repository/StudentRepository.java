package com.learn.repository;

import com.learn.entity.Passport;
import com.learn.entity.Student;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class StudentRepository {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EntityManager em;

    public Student findById(Long id){
        return em.find(Student.class,id);
    }
    
    public Student save(Student student) {
    	if(student.getId()==null) {
    		em.persist(student);
    	}else {
    		em.merge(student);
    	}
    	return student;
    }
    
    public void deleteById(Long id) {
    	Student student = findById(id);
    	em.remove(student);
    }
    
    public void saveStudentWithPassport() {
    	Passport passport = new Passport("ZZ1234");
    	em.persist(passport);
    	Student student = new Student("Mike");
    	student.setPassport(passport);
    	em.persist(student);
    }
    
    public void playWithEntityManager() {
    	Student student1 = new Student("Student name");
    	em.persist(student1);
    	//some extra code
    }
}
