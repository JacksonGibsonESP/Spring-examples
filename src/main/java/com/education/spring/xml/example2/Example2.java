package com.education.spring.xml.example2;
/**
 * Created by JacksonGibsonESP on 16.02.2019.
 */

import com.education.spring.xml.example1.beans.B;
import com.education.spring.xml.example2.beans.A;
import com.education.spring.xml.example2.beans.annotated.C;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Example2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("example2/Beans.xml");

        A a = (A) context.getBean("a");
        a.doStuff();

        B b = (B) context.getBean("b");
        System.out.println(b.getName());

        C c = (C) context.getBean("c");
        System.out.println(c.getName());
    }
}
