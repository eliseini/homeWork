package com.company.oop_tasks.task4;

import java.util.Scanner;

public class Book {
    String nameBook;
    String authorBook;

    public Book(String nameBook, String authorBook){
        Scanner sc = new Scanner(System.in);
        this.nameBook=sc.nextLine();
        this.authorBook=authorBook;
    }

}
