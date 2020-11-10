package com.company.oop_tasks.Collection;

import java.util.*;


public class Student implements Comparable<Student> {
    private String name;

    public Student(String name) {
        this.name=name;
    }

    @Override
    public int compareTo(Student o) {
        int result = this.name.compareTo(o.name);


        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
