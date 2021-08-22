package com.alexDyuba.spring.aspect;

import com.alexDyuba.spring.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("execution(void add*(..))")
    private void allAddMethods() {
    }

    @Before("allAddMethods()")
    public void beforeGetBookAdvice(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        Object[] info = joinPoint.getArgs();
        System.out.println("hi hi it is combo pointcut");
        System.out.println("getDeclaringType: = " + signature.getDeclaringType());
        System.out.println("getName: = " + signature.getName());
        System.out.println("getClass: = " + signature.getClass());
        if (signature.getName().equals("addBook")) {
            for (Object i : info) {
                if (i instanceof Book) {
                    Book myBook = (Book) i;
                    System.out.println(myBook.getAuthor());
                    System.out.println(myBook.getPages());
                    System.out.println(myBook.getYears());
                } else if (i instanceof String) {
                    System.out.println("Person add" + i);
                }
            }
        }
    }
}
