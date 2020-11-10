package com.company.oop_tasks.Collection;

import java.util.*;

public class StudentMani {
    public static void main(String[] args) {


        Student student = new Student("Bill");
        Student student1 = new Student("Stiff");
        Student student2 = new Student("Nicky");
        Student student3 = new Student("Mikel");
        Student student4 = new Student("Andy");
        Student student5 = new Student("Andrey");
        Student student6 = new Student("Luna");
        Student student7 = new Student("Lana");
        Student student8 = new Student("Lina");
        Student student9 = new Student("Alexa");

        TreeSet<Student> list = new TreeSet<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);

        System.out.println(list);


        }
    }

