package com.company.oop_tasks.task6;

import com.company.oop_tasks.task8.Animal;

public class Veterinarian {
    private String name;
    private int age;
    public Veterinarian(String name, int age){
        this.name=name;
        this.age=age;
    }

    public void treatAnimal(Animal animal){
        System.out.println(animal);
    }
}
