package com.company.oop_tasks.task8;

public class Dog extends Animal{
    String voice;
    public Dog(String food,String location,String voice){
        super(food,location);
        this.voice="ГавГав";
    }

    @Override
    public void makeNoise(){
        System.out.println("Бух-Бах");
    }
    public void eat(){
        System.out.println("Чавкает");
    }
    public void sleep(){
        System.out.println("храпит");
    }
}
