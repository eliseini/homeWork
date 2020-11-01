package com.company.oop_tasks.task4;

import java.util.Scanner;

public class Reader {
    String name;
    String surName;
    int theNumberOfYourLibraryCard;
    String faculty;
    String dateBirthday;
    String phoneNumbers;

    public Reader(String name, String surName, int theNumberOfYourLibraryCard, String faculty, String dateBirthday, String phoneNumbers) {
        this.name = name;
        this.surName = surName;
        this.theNumberOfYourLibraryCard = theNumberOfYourLibraryCard;
        this.faculty = faculty;
        this.dateBirthday = dateBirthday;
        this.phoneNumbers = phoneNumbers;
    }

    public Reader() {
    }

    public void takeBook() {
        int takeBook = 3;
        System.out.println("\nПетров В. В. взял " + takeBook + " книг/и/у");
    }

    public void takeBook(String str) {

        String[] objArray = new String[3];
        objArray[0] = new String("Приключения, ");
        objArray[1] = new String("Словарь, ");
        objArray[2] = new String("Энциклопедия");
        System.out.print("\nПетров В. В. взял кнги: ");
        for (int i = 0; i < 3; i++) {

            System.out.print(","+objArray[i]);
        }

    }

    public void returnBook() {
        int returnBook = 3;
        System.out.println("\n\nПетров В. В. вернул " + returnBook + " книг/и/у");
    }

    public void returnBook(String str) {

        String[] objArray = new String[3];
        objArray[0] = new String("Приключения, ");
        objArray[1] = new String("Словарь, ");
        objArray[2] = new String("Энциклопедия");
        System.out.print("\nПетров В. В. взял кнги: ");
        for (int i = 0; i < 3; i++) {

            System.out.print(objArray[i]);
        }
    }

        @Override
        public String toString () {
            return
                    "\n{name = '" + name + '\'' +
                    ", surName = '" + surName + '\'' +
                    ", theNumberOfYourLibraryCard = " + theNumberOfYourLibraryCard +
                    ", faculty = '" + faculty + '\'' +
                    ", dateBirthday = " + dateBirthday +
                    ", phoneNumbers = " + phoneNumbers+"}";
        }
    }

