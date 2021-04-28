package com.learn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Passport {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable=false)
    private String number;

    public Passport(){}
    public Passport(String number){
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public String getnumber() {
        return number;
    }

    public void setnumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", number='" + number + '\'' +
                '}';
    }
}
