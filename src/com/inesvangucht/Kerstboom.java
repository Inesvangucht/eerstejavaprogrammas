package com.inesvangucht;

public class Kerstboom {
    public static void main(String[] args) {


        String ster = "*";
        int aantal = 8;




        for (int teller = 1; teller <= aantal; teller++) {
            System.out.println(ster);
            ster = ster + "*";
        }

    }
}
