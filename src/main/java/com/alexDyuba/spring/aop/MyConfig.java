package com.alexDyuba.spring.aop;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configurable
@ComponentScan("com.alexDyuba.spring")
@EnableAspectJAutoProxy
public class MyConfig {
}
