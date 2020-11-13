package com.company.oop_tasks.task12;

public class User extends Basket{
    private String login;
    private int password;
   public User(String []purchasedGoods, String login, int password){
       super(purchasedGoods);
       this.login=login;
       this.password=password;

   }
}
