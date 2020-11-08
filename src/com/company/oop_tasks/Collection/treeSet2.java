package com.company.oop_tasks.Collection;

import java.util.*;

public class treeSet2 {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        for (int i = 0; i <= 100; i++) {
//8-9
            int num=(1+(int)(Math.random()*500));
            numbers.add(num);
        }
        System.out.println(numbers);
        NavigableSet<Integer> numbers1 = numbers.descendingSet();
        System.out.println(numbers1);
        NavigableSet<Integer> numbers2 = numbers.subSet(20, true,75,false);
        System.out.println(numbers2);
    }
}
