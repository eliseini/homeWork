package com.company.oop_tasks.task6;

public class Student {
   private String firstName;
    private String lastName;
    private int group;
    protected double averageMark;
    private int scholarship;

    public Student(String firstName, String lastName, int group, double averageMark){
        this.firstName=firstName;
        this.lastName=lastName;
        this.group=1+(int)(Math.random()*100);
        this.averageMark=1+(int)(Math.random()*6);
        }
    public Student(){}
   public int getScholarship(int scholarship){
    if(averageMark>=5){
        return 100;
    }else{
        return 80;
    }

}


    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group=" + group +
                ", averageMark=" + averageMark +
                '}';
    }
}

