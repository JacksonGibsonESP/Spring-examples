package com.education.spring.annotated.example3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * Created by JacksonGibsonESP on 17.02.2019.
 */
//@Configuration
//@Import(ConfigA.class)
public class Config {
    @Bean
    @Scope("prototype")
    public A a() {
        return new A(b());
    }

    @Bean
    public B b() {
        return new B(25, "qwerty");
    }
}
