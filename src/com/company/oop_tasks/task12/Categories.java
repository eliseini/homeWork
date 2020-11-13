package com.company.oop_tasks.task12;

import java.util.Arrays;

public class Categories {
    private String name;
    private String [] product;

    public Categories(String name, String [] product){
        this.name=name;
        this.product=product;

        Categories phone=new Categories("SmartPhone", new String[]{"Iphone"});
        Categories phone1=new Categories("TV", new String[]{"LG210"});
        Categories phone2=new Categories("NoteBook", new String[]{"MacBook"});
    }

    @Override
    public String toString() {
        return "Categories{" +
                "name='" + name + '\'' +
                ", product=" + Arrays.toString(product) +
                '}';
    }
}
