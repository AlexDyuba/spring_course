package com.alexDyuba.spring;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Lib {
    Book book;
    Magazine magazine;
    @Value("Alex Dyuba")
    String person;

    public void getBook() {
        System.out.println("I get Book");
        System.out.println("______________________________");
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void getMagazine() {
        System.out.println("I get Magazine");
        System.out.println("______________________________");
    }

    public void setMagazine(Magazine magazine) {
        this.magazine = magazine;
    }

    public void addBook(String person, Book book) {
        System.out.println("I add Book");
        System.out.println("______________________________");
    }

    public void addMagazine() {
        System.out.println("I add Magazine");
        System.out.println("______________________________");
    }
}
