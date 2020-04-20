package com.tango.spring.bean.autowire.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.security.PrivateKey;

@Component("user")
public class User {
    private String name;
    private int age;
    private School school;

    public String getName() {
        return name;
    }

    @Value(value = "tango")
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Value(value = "20")
    public void setAge(int age) {
        this.age = age;
    }

    public School getSchool() {
        return school;
    }

    @Autowired //自动注解  按照类型匹配实例
    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
