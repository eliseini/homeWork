package com.company.oop_tasks.task8;

public class Horse extends Animal {
    String run;
    public Horse(String food, String location,String run) {
        super(food, location);
        this.run="Быстро скачет";
    }

    @Override
    public void makeNoise() {
        System.out.println("тыгыдык");
    }

    public void eat() {
        System.out.println("хрустит");
    }

    public void sleep() {
        System.out.println("ZZZZzzz");
    }
}
