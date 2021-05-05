package com.learn.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;

@Entity
public class FullTimeEmployee extends Employee{
	private BigDecimal salary;
	
	public FullTimeEmployee(BigDecimal salary,String name) {
		super(name);
		this.salary = salary;
	}
	
	public FullTimeEmployee() {
		super();
	}
	public FullTimeEmployee(BigDecimal salary) {
		super();
		this.salary = salary;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [salary=" + salary + ", getId()=" + getId() + ", getName()=" + getName() + "]";
	}
	
}
