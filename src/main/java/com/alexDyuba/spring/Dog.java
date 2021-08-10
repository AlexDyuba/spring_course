package com.alexDyuba.spring;

public class Dog implements Pet {

    public Dog() {
        System.out.println("hello i am existing");
    }

    private void init() {
        System.out.println("object is created");
    }

    private void destroy() {
        System.out.println("object is deleted");
    }

    @Override
    public void say() {
        System.out.println("Bow - wow");
    }
}
