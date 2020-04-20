package com.tango.spring.bean.autowire.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("school")
public class School {
    private String schoolName;
    private String address;
    private int persons;//学校人数

    public String getSchoolName() {
        return schoolName;
    }

    @Value(value = "xxxx大学")
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    @Value(value = "xx省xx市xx区xx路")
    public void setAddress(String address) {
        this.address = address;
    }

    public int getPersons() {
        return persons;
    }

    @Value(value = "1000")
    public void setPersons(int persons) {
        this.persons = persons;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName='" + schoolName + '\'' +
                ", address='" + address + '\'' +
                ", persons=" + persons +
                '}';
    }
}
