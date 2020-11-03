package com.company.oop_tasks.task6;

public class main {

    public static void main(String[] args){

        Student[] mass=new Student[2];
        mass[0]=new Student("Egor", "Grinchenko", 1,1);
        System.out.println(mass[0]);
        System.out.println("Стипендия "+mass[0].getScholarship(1) + "грн.");

        mass[1]=new Aspirant("Alex", "Adisson", 1, 1,"IT Industry");
        System.out.println("\n"+ mass[1]);
        System.out.println("\n"+ mass[1].getScholarship(1)+ "грн.");
    }
}
