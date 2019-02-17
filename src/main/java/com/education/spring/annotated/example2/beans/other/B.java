package com.education.spring.annotated.example2.beans.other;

import com.education.spring.annotated.example2.beans.Mark;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by JacksonGibsonESP on 16.02.2019.
 */
@Component("B2")
@Order(1)
public class B implements Mark {
    public String getName() {
        return "Hello, it's bean B2!";
    }
}
