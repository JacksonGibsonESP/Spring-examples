package com.education.spring.xml.example1.beans;

/**
 * Created by JacksonGibsonESP on 16.02.2019.
 */
public class A {

    private B b;

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
