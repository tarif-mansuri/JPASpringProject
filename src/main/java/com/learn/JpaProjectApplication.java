package com.learn;

import com.learn.entity.Course;
import com.learn.repository.CourseRepository;
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

	public static void main(String[] args) {
		SpringApplication.run(JpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Course course = cr.findById(10002L);
		cr.addReviewsForCourse();
		//logger.info("Course:{}",course);
	}
}
