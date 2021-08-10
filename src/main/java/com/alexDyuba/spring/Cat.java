package com.alexDyuba.spring;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("May - may");
    }
}
