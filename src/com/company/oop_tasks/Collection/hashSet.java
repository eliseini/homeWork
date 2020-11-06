package com.company.oop_tasks.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class hashSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(5);
        numbers.add(12);
        numbers.add(3);
        numbers.add(333);
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
        System.out.println("Выберите: \n 1.Распечатать \n 2.Удалить и распечатать все элементы в set");
        double choose = sc.nextDouble();
        if(choose==1){
            System.out.println(numbers);
        }else if(choose==2){
            numbers.removeAll(numbers);
            Set<Integer> numbers1 = new HashSet<>();
            numbers1.addAll(numbers);
            Iterator<Integer> numbersIterator= numbers.iterator();
            while(numbersIterator.hasNext()){
                System.out.println(numbersIterator.next());
            }
        }
    }
}
