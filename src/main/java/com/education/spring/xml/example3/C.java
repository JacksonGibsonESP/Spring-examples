package com.education.spring.xml.example3;

/**
 * Created by JacksonGibsonESP on 17.02.2019.
 */
public class C {
    private A a;
    private String string;

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
