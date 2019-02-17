package com.education.spring.annotated.example1.beans;

import org.springframework.stereotype.Component;

/**
 * Created by JacksonGibsonESP on 16.02.2019.
 */
@Component
public class B {
    public String getName() {
        return "Hello, it's bean B!";
    }
}
