package com.education.spring.annotated.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by JacksonGibsonESP on 17.02.2019.
 */
public class Example3 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        context.scan("com.education.spring.annotated.example3");
//        context.refresh();

        A a = (A) context.getBean("a");
        a.setString("asdf");
        System.out.println(a.toString());

        a = (A) context.getBean("a");
        System.out.println(a.toString());

//        C c = context.getBean(C.class);
//        c.setString("zxcv");
//        System.out.println(c.toString());
//
//        c = context.getBean(C.class);
//        System.out.println(c.toString());
    }
}
