package com.company.oop_tasks.Collection;

import java.util.*;

public class Stop {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("введите число: ");
        Scanner sc = new Scanner(System.in);
        while (true) {
            String num = sc.next();

            if (!num.equals("#stop")) {
                numbers.add(Integer.parseInt(num));

            } else {
                break;

            }

        }
        System.out.println(numbers);

        Set<Integer> numbers2= new HashSet<>();
        numbers2.addAll(numbers);

        Iterator<Integer> numbers2Iterator= numbers2.iterator();
        while (numbers2Iterator.hasNext()){
            System.out.print(" "+numbers2Iterator.next());
        }

    }
}
