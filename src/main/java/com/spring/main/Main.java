package com.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.examples.HelloSpring;
import com.spring.examples.config.ApplicationConfig;

public class Main {
    public static void main(String[] args) {
	    ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	    HelloSpring helloSpringBean = context.getBean("helloSpringBean", HelloSpring.class);
	    helloSpringBean.greet();
    }
}