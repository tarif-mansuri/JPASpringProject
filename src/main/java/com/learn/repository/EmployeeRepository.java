package com.learn.repository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.learn.entity.Course;
import com.learn.entity.Employee;
import com.learn.entity.Review;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

@Repository
@Transactional
public class EmployeeRepository {
	private Logger logger  = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EntityManager em;
    
    //insert an Employee
    public void insert(Employee emp) {
    	em.persist(emp);
    }
    //Retrieve all Employee
    public List<Employee> retrieveAllEmployees(){
    	Query query = em.createQuery("select e from Employee e", Employee.class);
    	return query.getResultList();
    }
}
