package com.learn.repository;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.learn.entity.Course;
import com.learn.entity.Review;

import java.util.List;

import javax.persistence.EntityManager;

@Repository
@Transactional
public class CourseRepository {
	private Logger logger  = LoggerFactory.getLogger(this.getClass());

    @Autowired
    EntityManager em;

    public Course findById(Long id){
        Course c = em.find(Course.class,id);
        logger.info("Review:{}",c.getReviews());
        return c;
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
    	Course course1 = new Course("Course name");
    	em.persist(course1);
    	em.flush();
    	em.detach(course1);
    	
    	Course course2 = new Course("Course name 2");
    	em.persist(course2);
    	course2.setName("Updated name");
    	//em.persist(course1);
    	//some extra code
    }
//	public void addHardcodedReviewsForCourse() {
//		//get course 10003
//		Course course = findById(10003l);
//		logger.info("Course Reviews {}",course.getReviews());
//		//Create Review
//		Review review1 = new Review("5","Great hands on stuff");
//		Review review2 = new Review("3","Average Course");
//		//Setting the relation ship
//		course.addReview(review1);
//		review1.setCourse(course);
//		course.addReview(review2);
//		review2.setCourse(course);
//		//save it to the database
//		em.persist(review1);
//		em.persist(review2);
//	}
//	public void addReviewsForCourse(Long courseId, List<Review> reviews) {
//		//get course 10003
//		Course course = findById(courseId);
//		logger.info("Course Reviews {}",course.getReviews());
//		for(Review review: reviews) {
//			course.setReview(review);
//			review.setCourse(course);
//			em.persist(review);
//		}
//	}
}
