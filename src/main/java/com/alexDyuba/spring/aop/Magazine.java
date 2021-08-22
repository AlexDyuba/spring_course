package com.alexDyuba.spring.aop;

public class Magazine implements MethodForPublication {
    private int pages;
    private int years;
    private String author;
    @Override
    public void read() {
        System.out.println("I am reading MAGAZINE!!!");
        System.out.println("_________________________________");
    }
}
