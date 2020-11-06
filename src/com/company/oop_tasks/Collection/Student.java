package com.company.oop_tasks.Collection;

import java.util.*;


public class Student implements Comparable {
    public static void main(String[] args) {


        Set<String> student = new TreeSet<>();
        student.add("Cat");
        student.add("Dog");
        student.add("Horse");
        student.add("Cow");
        student.add("Mouse");
        student.add("Birds");
        student.add("Wolf");
        student.add("Tiger");
        student.add("Elephant");
        student.add("Fox");
        System.out.println(student);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

}