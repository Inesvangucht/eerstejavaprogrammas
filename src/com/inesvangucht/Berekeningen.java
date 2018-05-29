package com.inesvangucht;

public class Berekeningen {
    public static void main(String[] args) {

        double straal = 10;
        double x = 4;
        double y = 2 * x + Math.sin(x / 3);
        double a = 16;
        double g = 6.67e-11;
        double m1 = 4;
        double m2 = 8;

        double omtrek = Math.PI * straal;
        double oppervlakte = 2 * Math.PI * straal;
        double formule2 = (a + 3 * Math.sqrt(x));
        double f = g * ((m1 * m2)/Math.pow(straal,2));


        System.out.println(omtrek);
        System.out.println(oppervlakte);
        System.out.println(y);
        System.out.println("De uitkomst is " + formule2 + ".");
        System.out.println(g);
        System.out.println(f);


    }
}
