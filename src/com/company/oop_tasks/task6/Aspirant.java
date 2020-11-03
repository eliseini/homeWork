package com.company.oop_tasks.task6;

public class Aspirant extends Student {
    String scienceWork;

    Aspirant(String firstName, String lastName, int group, double averageMark, String scienceWork) {
        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;

    }

    public Aspirant() {
    }
    @Override
    public int getScholarship(int scholarship) {
        if (averageMark >= 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
