package com.inesvangucht;

import java.util.Scanner;

public class Stringsmaken {
    public static void main(String[] args) {
        /*String naam = "Jimi Hendrix";

        System.out.println("Geef een getal in.");
        Scanner scanner = new Scanner(System.in );
       int i = scanner.nextInt();

        System.out.println(i * 2);*/

        int min = 4;
        int max = 10;

        int r = min + (int) (Math.random() * (max -  min));
        System.out.println(r);
        System.out.println(Math.random());


    }
}
