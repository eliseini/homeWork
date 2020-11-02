package com.company.oop_tasks.task5;

public class NumberAB {
    public static void main(String[] args) {
        numbersAB(5,7);
    }

        public static int numbersAB ( int a, int b){
            if(a<=0 || b<=0){
                return 0;
            }

        if (a < b) {
                return numbersAB(a, b);
            }
            return numbersAB(b, a);
        }
    }

