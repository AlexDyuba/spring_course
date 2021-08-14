package com.alexDyuba.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    @Pointcut("execution(void *(..))")
    private void allMethods(){}

    @Pointcut("execution(void com.alexDyuba.spring.Library.getBook())")
    private void getMethodsAboutLib(){}

    @Pointcut("allMethods() && !getMethodsAboutLib()")
    private void allMethodsExceptionLibGetBook(){}

    @Before("allMethodsExceptionLibGetBook()")
    public void beforeGetBookAdvice() {
        System.out.println("hi hi it is combo pointcut");
    }
}
