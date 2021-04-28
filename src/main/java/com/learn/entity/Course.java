package com.learn.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Course {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String name;

	@OneToMany(mappedBy="course",fetch = FetchType.EAGER)
	private List<Review> reviews = new ArrayList<>();

	public Course() {
	}

	public Course(String name) {
		this.name = name;
	}
	
	public Course(String name, List<Review> reviews) {
		super();
		this.name = name;
		this.reviews = reviews;
	}

	public List<Review> getReviews() {
		return reviews;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}

	public void addReview(Review review) {
		this.reviews.add(review);
	}

	public void removeReview(Review review) {
		this.reviews.remove(review);
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", reviews=" + reviews + "]";
	}

}
