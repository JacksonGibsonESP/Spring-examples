package com.education.spring.xml.example1;

import com.education.spring.xml.example1.beans.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by JacksonGibsonESP on 16.02.2019.
 */
public class Example1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example1/Beans.xml");

        A a = (A) context.getBean("a");
        a.doStuff();
    }
}
