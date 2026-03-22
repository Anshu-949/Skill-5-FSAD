package com.klu.skill_5;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Certification {

    @Value("C101")
    private String id;

    @Value("Java Full Stack")
    private String name;

    @Value("2026")
    private String dateOfCompletion;

    public String getDetails() {
        return id + " " + name + " " + dateOfCompletion;
    }
}