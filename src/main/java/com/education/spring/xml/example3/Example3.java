package com.education.spring.xml.example3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JacksonGibsonESP on 17.02.2019.
 */
public class Example3 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example3/Beans.xml");

        A a = (A) context.getBean("a");
        a.setString("asdf");
        System.out.println(a.toString());

        a = (A) context.getBean("a");
        System.out.println(a.toString());

        C c = context.getBean(C.class);
        c.setString("zxcv");
        System.out.println(c.toString());

        c = context.getBean(C.class);
        System.out.println(c.toString());
    }
}
