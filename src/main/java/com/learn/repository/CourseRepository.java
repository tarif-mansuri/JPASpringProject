package com.learn.repository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.entity.Course;

import javax.persistence.EntityManager;

@Repository
public class CourseRepository {
	private Logger logger  = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EntityManager em;

    public Course findById(Long id){
        return em.find(Course.class,id);
    }
    public Course save(Course course) {
    	if(course.getId()==null) {
    		em.persist(course);
    	}else {
    		em.merge(course);
    	}
    	return course;
    }
    
    public void deleteById(Long id) {
    	Course course = findById(id);
    	em.remove(course);
    }
    
    public void playWithEntityManager() {
//    	Course course1 = new Course("Course name");
//    	em.persist(course1);
    	//some extra code
    }
	public void addReviewsForCourse() {
		//get course 10003
		Course course = findById(10003l);
		logger.info("Course Reviews {}",course.getReviews());
		//Add two reviews to it
		//save it to the database
		
		
	}
}
