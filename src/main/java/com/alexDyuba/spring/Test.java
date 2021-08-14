package com.alexDyuba.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Library library = context.getBean("library", Library.class);
        library.getMagazine();
        library.getBook();
        library.returnMagazine();
        context.close();
    }
}
