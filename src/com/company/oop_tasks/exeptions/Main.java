package com.company.oop_tasks.exeptions;

import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
try {
    int massSize = sc.nextInt();
    int[] mass = new int[massSize];
    for (int i = 0; i < mass.length; i++) {
        mass[i] = 1 + (int) (Math.random() * 100);
        System.out.println(mass[i]);
    }
    System.out.println("Введите индекс массива: ");
    for (int i = 0; i < mass.length; i++) {
       mass[sc.nextInt()]=mass[i];
        System.out.println(mass[i]);
    }


} catch(InputMismatchException e) {

                System.out.println("Вы ввели неверный формат для int");
        }
catch (ArrayIndexOutOfBoundsException e){
    System.out.println("Вы вышли за предел размера массива");
}


    }
    }


