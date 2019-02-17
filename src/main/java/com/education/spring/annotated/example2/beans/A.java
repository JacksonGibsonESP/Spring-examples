package com.education.spring.annotated.example2.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Created by JacksonGibsonESP on 16.02.2019.
 */
@Component
public class A {
    private Mark firstB;
    private Mark secondB;

    @Autowired
    public A(@Qualifier("B1") Mark firstB,
            @Qualifier("B2") Mark secondB) {
        this.firstB = firstB;
        this.secondB = secondB;
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

    public void  doStuff() {
        System.out.println(firstB.getName());
        System.out.println(secondB.getName());
    }
}
