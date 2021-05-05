package com.learn;

import com.learn.entity.Course;
import com.learn.entity.FullTimeEmployee;
import com.learn.entity.PartTimeEmployee;
import com.learn.entity.Review;
import com.learn.repository.CourseRepository;
import com.learn.repository.EmployeeRepository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaProjectApplication implements CommandLineRunner {
	private Logger  logger= LoggerFactory.getLogger(this.getClass());

	@Autowired
	CourseRepository cr;
	
	@Autowired
	EmployeeRepository empRepo;

	public static void main(String[] args) {
		SpringApplication.run(JpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Course course = cr.findById(10001L);
		//logger.info("Find By Id:{}",course);
//		List<Review> reviews = new ArrayList<>();
//		Review review1 = new Review("5","Great hands on stuff");
//		Review review2 = new Review("3","Average Course");
//		reviews.add(review2);
//		reviews.add(review1);
		//cr.addReviewsForCourse(10002l, reviews);
		//cr.addReviewsForCourse();
		
		//logger.info("Course:{}",course);
		//cr.playWithEntityManager();
		empRepo.insert(new PartTimeEmployee(new BigDecimal(500), "Ans Mansuri"));
		empRepo.insert(new FullTimeEmployee(new BigDecimal(50_000), "Iram Fatima"));
		
		//empRepo.retrieveAllEmployees();
		logger.info("Employee:{}",empRepo.retrieveAllEmployees());
	}
}
