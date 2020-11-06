package com.company.oop_tasks.war;


public class Main {
    public static void main(String[] args) {
        Warrior unit1 = new Warrior( 100);
        Warrior unit2 = new Warrior(100);


        Warrior[] unit = new Warrior[2];
        unit[0] = unit1;
        unit[1] = unit2;

        while (unit1.hitPoint>0 || unit2.hitPoint>0) {
            int receivedDamage = 0 + (int) (Math.random() * 2);
            if (receivedDamage == 0) {
                if(unit1.hitPoint<=0){
                    System.out.println("Поздравляю победил Юнит 2!");
                    break;
                }else {
                    System.out.println("\nЮнит 2 нанес удар Юниту 1.");
                   unit1.hitPoint -= 20;
                    System.out.println("Юнит 1 получил урон 20hp - осталось " + unit1.hitPoint + " " + "hp");

                }} else if (unit2.hitPoint<=0) {
                System.out.println("Поздравляю победил Юнит 1!");
                break;
            }else {
                System.out.println("\nЮнит 1 нанес удар Юниту 2.");
               unit2.hitPoint -= 20;
                System.out.println("Юнит 2 получил урон 20hp - осталось "  + unit2.hitPoint + " hp ");

            }

        }


    }
}



