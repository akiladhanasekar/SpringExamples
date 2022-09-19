package com.example.demo;

import org.springframework.data.annotation.Id;

public class Employee {
    @Id
    public String id;
    public String rollno;
    public String name;
    public String age;

    public Employee() {
    }

    public Employee(String rollno, String name, String age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format(
                "Employee[id=%s, rollno='%s', name='%s',age='%s']",
                id, rollno, name,age);
    }
}
