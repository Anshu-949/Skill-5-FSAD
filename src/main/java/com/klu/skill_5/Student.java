package com.klu.skill_5;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Value("101")
    private int id;

    @Value("Anshu")
    private String name;

    @Value("Male")
    private String gender;

    @Autowired
    private Certification certification;

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Certification: " + certification.getDetails());
    }
}