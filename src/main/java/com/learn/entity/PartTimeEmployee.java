package com.learn.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class PartTimeEmployee extends Employee{
	private BigDecimal hourlyWage;

	public PartTimeEmployee() {
	}
	
	public PartTimeEmployee(BigDecimal hourlyWage) {
		super();
		this.hourlyWage = hourlyWage;
	}
	
	public PartTimeEmployee(BigDecimal hourlyWage, String name) {
		super(name);
		this.hourlyWage = hourlyWage;
	}

	public BigDecimal getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(BigDecimal hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	@Override
	public String toString() {
		return "PartTimeEmployee ["+" Id="+getId()+" Name="+getName()+ " hourlyWage=" + hourlyWage + "]";
	}
	
}
