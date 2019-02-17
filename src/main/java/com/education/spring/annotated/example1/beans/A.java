package com.education.spring.annotated.example1.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by JacksonGibsonESP on 16.02.2019.
 */
@Component
public class A {

    private B b;

    @Autowired
    public A(B b) {
        this.b = b;
    }

    public String getName() {
        return "Hello, it's bean A";
    }

    public void doStuff() {
        System.out.println(b.getName());
    }
}
