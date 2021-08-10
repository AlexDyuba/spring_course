package com.alexDyuba.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPet {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person = context.getBean("myPerson", Person.class);
        person.callYourPet();
        context.close();
    }
}
