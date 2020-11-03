package com.company.oop_tasks.arrayList;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
//        ArrayList<String> color=new ArrayList<>();
//        color.add("Black");
//        color.add("White");
//        color.add("Green");
//        color.add(2,"Q");
//        Iterator<String> iterator=color.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println(color);

        //foreach
//        int [] mass = new int[]{10,52,65,88,77,15};
//        for(int element:mass){
//            System.out.println(element);
//        }


        //Homework
//3
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 10 чисeл: ");
        for (int i = 0; i < 10; i++) {
            numbers.add(1 + (int) (Math.random() * 100));

        }

        System.out.println(numbers);

//8
        Collections.sort(numbers);
        System.out.println(numbers);

//4
        System.out.println("Выберите элемент который умножиться на 10: ");
        int x = sc.nextInt();
        int y = numbers.get(x) * 10;
        numbers.set(x, y);
        System.out.println(numbers);
//5
        System.out.println("Какой элемент удалить из списка?: ");
        x = sc.nextInt();
        numbers.remove(x);
        System.out.println(numbers);
//6
        System.out.println("Введите число для проверки наличия в ArrayList: ");
        x = sc.nextInt();
        System.out.println(numbers.contains(x));
//7
//        ArrayList<String> numbers = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число: ");
//
//        while (true) {
//            String num = sc.next();
//            if (!num.equals("#stop")) {
//                numbers.add(num);
//            } else {
//                break;
//            }
//        }
//        System.out.println(numbers);

    }
    }



