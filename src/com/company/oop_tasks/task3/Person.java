package com.company.oop_tasks.task3;

public class Person {
    private String name;
    private String surName;
    private int age;

    public Person(String name, String surName, int age){
        this.name=name;
        this.surName=surName;
        this.age=age;
    }
    public Person(){}

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getSurName(){
        return surName;
    }
    public void setSurName(String surName){
        this.surName=surName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void move(){
        System.out.println("Подошел");
    }
    public void talk(){
        System.out.println(name + " "+ surName+ " говорит");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}

