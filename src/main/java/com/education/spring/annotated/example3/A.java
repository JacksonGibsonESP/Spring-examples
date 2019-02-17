package com.education.spring.annotated.example3;

/**
 * Created by JacksonGibsonESP on 17.02.2019.
 */
public class A {
    private B b;
    private String string;

    public A(B b) {
        this.b = b;
    }

    public void setString(String arg) {
        string = arg;
    }

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                ", string='" + string + '\'' +
                '}';
    }
}
