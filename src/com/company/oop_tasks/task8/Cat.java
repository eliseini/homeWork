package com.company.oop_tasks.task8;

public class Cat extends Animal {
    String name;
    public Cat(String food,String location, String name){

        super(food,location);
        this.name="Charlie";
    }
    @Override
    public void makeNoise(){
        System.out.println("Ших-Ших");
    }
    public void eat(){
        System.out.println("грызет");
    }
    public void sleep(){
        System.out.println("сопит");
    }
}

