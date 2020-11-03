package com.company.oop_tasks.task8;

import com.company.oop_tasks.task6.Veterinarian;

public class main {
    public static void main(String []args){
        Veterinarian veterinarian=new Veterinarian("Ben", 29);
Animal [] animals=new Animal[3];
animals[0]=new Dog("собачий корм","вальер", "");
        animals[1]=new Cat("кошачий корм","в доме", "Charlie");
        animals[2]=new Horse("сено","загон", "60 км/ч");

        for (Animal animal: animals) {
            veterinarian.treatAnimal(animal);

        }


    }
}
