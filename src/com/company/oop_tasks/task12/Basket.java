package com.company.oop_tasks.task12;

import java.util.Arrays;

public class Basket {
    private String [] purchasedGoods;

    public Basket(String []purchasedGoods){
        this.purchasedGoods=purchasedGoods;
    }

    @Override
    public String toString() {
        return "Basket{" +
                "purchasedGoods=" + Arrays.toString(purchasedGoods) +
                '}';
    }
}
