package com.education.spring.xml.example3;

/**
 * Created by JacksonGibsonESP on 17.02.2019.
 */
public class B {
    private int number;
    private String string;

    public B(int number, String string) {
        this.number = number;
        this.string = string;
    }

    @Override
    public String toString() {
        return "B{" +
                "number=" + number +
                ", string='" + string + '\'' +
                '}';
    }
}
