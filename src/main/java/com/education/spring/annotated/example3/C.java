package com.education.spring.annotated.example3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by JacksonGibsonESP on 17.02.2019.
 */
@Component
public class C {
    private A a;
    private String string;

    @Autowired
    public C(A a) {
        this.a = a;
    }

    public void setString(String arg) {
        string = arg;
    }

    @Override
    public String toString() {
        return "C{" +
                "a=" + a +
                ", string='" + string + '\'' +
                '}';
    }
}
