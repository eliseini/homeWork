package com.company.oop_tasks.Collection;

import java.util.*;

public class Stop {
    public static void main(String[] args) {
        ArrayList<String> numbers = new ArrayList<>();
        System.out.println("введите число: ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String num = sc.next();
            if (!num.equals("#stop")) {
                numbers.add(num);
            }else{
                break;
            }

        }
        System.out.println(numbers);

        Set<String> numbers2= new HashSet<>();
        numbers2.addAll(numbers);

        Iterator<String> numbers2Iterator= numbers2.iterator();
        while (numbers2Iterator.hasNext()){
            System.out.print(" "+numbers2Iterator.next());
        }

    }
}
