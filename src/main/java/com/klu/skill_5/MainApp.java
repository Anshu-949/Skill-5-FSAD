package com.klu.skill_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext obj =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Student s = obj.getBean(Student.class);

        s.display();
    }
}