package com.education.spring.annotated.example2;
/**
 * Created by JacksonGibsonESP on 16.02.2019.
 */

import com.education.spring.annotated.example2.beans.A;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.education.spring.annotated.example2");
        context.refresh();

        A a = (A) context.getBean("a");
        a.doStuff();
    }
}
