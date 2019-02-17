package com.education.spring.annotated.example1;
/**
 * Created by JacksonGibsonESP on 16.02.2019.
 */

import com.education.spring.annotated.example1.beans.A;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.education.spring.annotated.example1");
        context.refresh();

        A a = (A) context.getBean("a");
        a.doStuff();
    }
}
