package com.company.oop_tasks.Collection;

import java.lang.*;
import java.util.*;

public class arrayDeque {
    public static void main(String[] args) {
        // //10
        //       ArrayDeque<String> color=new ArrayDeque<>();
//        color.add("White");
//        color.add("Black");
//        color.add("Yellow");
//        color.add("Brown");
//        color.add("Blue");
//        System.out.println(color);
//        Iterator<String> iteratorColor= color.iterator();
//        while(iteratorColor.hasNext()){
//            System.out.println(iteratorColor.next());
//        }
//        System.out.println("\n-");
//        for(String colors: color){
//            System.out.println(colors);
//        }
        ////11
//        ArrayDeque<Integer> numbers=new ArrayDeque<>();
//        numbers.add(23);
//        numbers.add(15);
//        numbers.add(46);
//        numbers.add(52);
//        numbers.add(87);
//        System.out.println(numbers);
//        System.out.println(numbers.pollFirst());
//        System.out.println(numbers);
        ////12
//        ArrayDeque<Integer> numbers1 = new ArrayDeque<>();
//        numbers1.add(23);
//        numbers1.add(15);
//        numbers1.add(46);
//        numbers1.add(52);
//        numbers1.add(87);
//        System.out.println(numbers1);
//        System.out.println(numbers1.peekFirst());
//        System.out.println(numbers1);
        //13
        ArrayDeque<Integer> numbers2 = new ArrayDeque<>();
        numbers2.add(23);
        numbers2.add(15);
        numbers2.add(46);
        numbers2.add(52);
        numbers2.add(87);
        System.out.println(numbers2);
        TreeSet<Integer> sortOfNumbers = new TreeSet<>();
        sortOfNumbers.comparator(numbers2);
        Iterator<Integer> iteratorNumbers = numbers2.iterator();
        while (iteratorNumbers.hasNext()) {
          System.out.println(iteratorNumbers.next());

        }
    }
}



