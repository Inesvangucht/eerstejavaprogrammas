package com.inesvangucht;

public class Fibonacci {
    public static void main(String[] args) {
        // ... 0 1 1 2 3 5 8 13 21

        int n = 20;  //we moeten 20 keer iets doen, dus loop

        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);

        for (int i = 1; i <= n; i++) {
            int som = a + b;
            System.out.println(som);
            a = b;
            b = som;
        }


    }
}
