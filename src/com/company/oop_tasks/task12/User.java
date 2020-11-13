package com.company.oop_tasks.task12;

public class User {
    private String login;
    private int password;
   public User(String login, int password){

       this.login=login;
       this.password=password;
   }
Basket basket=new Basket(new String[]{"Iphone"});

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password=" + password +
                ", basket=" + basket +
                '}';
    }
}
