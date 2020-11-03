package com.company.oop_tasks.arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class scArrayListStop {
    public static void main(String []args){
        ArrayList<String> colorList =new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите цвет: ");
      while(true){
          String color=sc.next();
          if(!color.equals("#stop")){
              colorList.add(color);
          }else{
              break;
          }
        }
        System.out.println(colorList);

    }
}
