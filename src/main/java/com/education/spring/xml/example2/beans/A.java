package com.education.spring.xml.example2.beans;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

/**
 * Created by JacksonGibsonESP on 16.02.2019.
 */
public class A {
    private Mark firstB;
    private Mark secondB;
    private B thirdB;

    public A(Mark firstB,
            Mark secondB) {
        this.firstB = firstB;
        this.secondB = secondB;
    }

    @Autowired
    public void setBean(B b) {
        thirdB = b;
    }

//    @Autowired
    public void setArr(Mark[] arg) {
        System.out.println("Array of beans injection START");
        Arrays.stream(arg).map(Mark::getName).forEach(System.out::println);
        System.out.println("Array of beans injection END");
    }

    public String getName() {
        return "Hello, it's bean A";
    }

    public void doStuff() {
        System.out.println(firstB.getName());
        System.out.println(secondB.getName());
        System.out.println(thirdB.getName());
    }
}
