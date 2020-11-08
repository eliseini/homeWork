package com.company.oop_tasks.Collection;

import java.util.*;

public class treeSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> randomNumbers = new TreeSet<>();
//7
        while (true) {
            String num = sc.next();

            if (!num.equals("#stop")) {
                randomNumbers.add(Integer.parseInt(num));

            } else {
                break;

            }
        }
            System.out.println(randomNumbers);

            SortedSet<Integer> sevenDownNumbers = randomNumbers.headSet(7);
            System.out.println(sevenDownNumbers);

    }
}
