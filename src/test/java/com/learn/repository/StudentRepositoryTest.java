package com.learn.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.learn.JpaProjectApplication;
import com.learn.entity.Student;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = JpaProjectApplication.class)
public class StudentRepositoryTest {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	StudentRepository repo;
	
	@Autowired
	EntityManager em;
	
//	@Test
//	@Transactional
//	public void retrieveStudentAndPassportDetails() {
//		Student student = em.find(Student.class, 20001L);
//		logger.info("Student-> {}",student);
//		logger.info("Passport-> {}",student.getPassport());
//	}

}
