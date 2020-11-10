package com.company.oop_tasks.task4;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Reader reader = new Reader("Boris", "Petrov", 12450, "IT", "25.12.1990", "+77777152468");

        System.out.println(reader);
        reader.takeBook();
        reader.takeBook();

        Reader reader1 = new Reader();

        reader.returnBook();
        reader.returnBook("");

    }


    }


