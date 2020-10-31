package com.company.oop_tasks.task4;

import java.util.Scanner;

public class Reader {
    String name;
    String surName;
    int theNumberOfYourLibraryCard;
    String faculty;
    char dateBirthday;
    double phoneNumbers;

    public Reader(String name, String surName, int theNumberOfYourLibraryCard, String faculty, char dateBirthday, double phoneNumbers) {
        this.name = name;
        this.surName = surName;
        this.theNumberOfYourLibraryCard = theNumberOfYourLibraryCard;
        this.dateBirthday = dateBirthday;
        this.phoneNumbers = phoneNumbers;
    }
    public Reader(){}

    public void takeBook() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сколько книг хотите взять: ");
        int quantityBook = sc.nextInt();
        System.out.println("Петров В. В. взял " + quantityBook + "книги");
    }

public String takeBook(String book){
        Scanner sc =new Scanner(System.in);
        book= sc.nextLine();
        if(book.equals("все")){

        }
        return
}

    @Override
    public String toString() {
        return "Reader{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", theNumberOfYourLibraryCard=" + theNumberOfYourLibraryCard +
                ", faculty='" + faculty + '\'' +
                ", dateBirthday=" + dateBirthday +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
