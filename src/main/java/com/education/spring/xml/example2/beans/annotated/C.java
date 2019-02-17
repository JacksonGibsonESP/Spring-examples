package com.education.spring.xml.example2.beans.annotated;

import org.springframework.stereotype.Component;

/**
 * Created by JacksonGibsonESP on 17.02.2019.
 */
@Component
public class C {
    public String getName() {
        return "Hello, it's bean C!";
    }
}
