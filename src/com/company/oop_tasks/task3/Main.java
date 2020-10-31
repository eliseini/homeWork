package com.company.oop_tasks.task3;

public class Main {
    public static void main(String []args){
Person person = new Person("Stif", "Jeymson", 23);
        System.out.println(person);
        person.move();
        person.talk();
Person person1=new Person();
person1.setName("Dima");
person1.setSurName("Polishyuk");
person1.setAge(28);
       System.out.println("\n"+person1);
       person1.move();
       person1.talk();
    }

}
