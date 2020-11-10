package com.company.oop_tasks.task4;

import java.util.Scanner;

public class Reader {
    String name;
    String surName;
    int numberOfLibraryCard;
    String faculty;
    String dateBirthday;
    String phoneNumbers;

    public Reader(String name, String surName, int theNumberOfYourLibraryCard, String faculty, String dateBirthday, String phoneNumbers) {
        this.name = name;
        this.surName = surName;
        this.numberOfLibraryCard = theNumberOfYourLibraryCard;
        this.faculty = faculty;
        this.dateBirthday = dateBirthday;
        this.phoneNumbers = phoneNumbers;
    }

    public Reader() {
    }
    public void takeBook(Scanner sc) {

       while(true) {
           sc = new Scanner(System.in);
           String nameBook= sc.next();
           if(!nameBook.equals("#stop")) {

           }
       }
    }
    public void takeBook() {
        int takeBook = 3;
        System.out.println("\n" + name+" " +surName+ " взял " + takeBook + " книги");
    }

    public void takeBook(String str) {
       // int index=sc.nextInt();
        //String[] objArray = new String[index];
//        objArray[0] = new String("Приключения, ");
//        objArray[1] = new String("Словарь, ");
//        objArray[2] = new String("Энциклопедия");
//        System.out.print("\n" + name+" " +surName+ " взял кнги: ");
//        for (int i = 0; i < 3; i++) {
//
//            System.out.print(objArray[i]);
//        }

    }

    public void returnBook() {
        int returnBook = 3;
        System.out.println("\n\n" + name+" " +surName+ " вернул " + returnBook + " книги");
    }

    public void returnBook(String str) {

        String[] objArray = new String[3];
        objArray[0] = new String("Приключения, ");
        objArray[1] = new String("Словарь, ");
        objArray[2] = new String("Энциклопедия");
        System.out.print("\n" + name+" " +surName+ " вернул кнги: ");
        for (int i = 0; i < 3; i++) {

            System.out.print(objArray[i]);
        }
    }

        @Override
        public String toString () {
            return
                    "\n{name = '" + name + '\'' +
                    ", surName = '" + surName + '\'' +
                    ", numberOfLibraryCard = " + numberOfLibraryCard +
                    ", faculty = '" + faculty + '\'' +
                    ", dateBirthday = " + dateBirthday +
                    ", phoneNumbers = " + phoneNumbers+"}";
        }
    }

