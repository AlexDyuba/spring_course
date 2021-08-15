package com.alexDyuba.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book implements MethodForPublication {
    @Value("33")
    private int pages;
    @Value("2000")
    private int years;
    @Value("Dostaevski")
    private String author;
    @Override
    public void read() {
        System.out.println("I am reading BOOK!!!");
        System.out.println("_________________________________");
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
