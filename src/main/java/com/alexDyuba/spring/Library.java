package com.alexDyuba.spring;

import org.springframework.stereotype.Component;

@Component
public class Library extends AbstractLib {

    @Override
    public void getBook() {
        System.out.println("we get book");
    }

    public void getMagazine() {
        System.out.println("we have magazine");
    }

    public void returnBook() {
        System.out.println("we return book");
    }

    public void returnMagazine() {
        System.out.println("we return magazine");
    }
}
