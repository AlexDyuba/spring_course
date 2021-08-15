package com.alexDyuba.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        Book book = context.getBean("book", Book.class);
        Lib lib = context.getBean("lib", Lib.class);
        lib.addBook("AlexDyuba", book);
        context.close();
    }
}
