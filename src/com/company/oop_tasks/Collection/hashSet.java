package com.company.oop_tasks.Collection;

import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(12);
        numbers.add(33);
        numbers.add(23);
//        numbers.add(1+(int)(Math.random()*10));
//        numbers.add(1+(int)(Math.random()*10));
//        numbers.add(1+(int)(Math.random()*10));
//        numbers.add(1+(int)(Math.random()*10));
//        numbers.add(1+(int)(Math.random()*10));
//        numbers.add(1+(int)(Math.random()*10));
//        numbers.add(1+(int)(Math.random()*10));
//        numbers.add(1+(int)(Math.random()*10));
//        numbers.add(1+(int)(Math.random()*10));
        System.out.println(numbers);
        System.out.println("Выберите: \n 1.Распечатать \n 2.Удалить ");
        double choose = sc.nextDouble();
        if(choose==1){
            Set<Integer> numbers1= new TreeSet<>();
            numbers1.addAll(numbers);

            System.out.println(numbers1);

        }else if(choose==2){
            numbers.removeAll(numbers);

        }
    }
}
