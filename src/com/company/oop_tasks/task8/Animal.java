package com.company.oop_tasks.task8;

public class Animal {
    String food;
    String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }
    public Animal(){}

    public void makeNoise() {
        System.out.println("Dahh-Bahhh");
    }

    public void eat() {
        System.out.println("Ест");
    }

    public void sleep() {
        System.out.println("Zzzzzz");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
