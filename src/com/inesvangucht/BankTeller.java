package com.inesvangucht;

public class BankTeller {
    public static void main(String[] args) {
        double startkapitaal = 100000;
        double termijn = 10;
        double rente = 1.035;
        double kapitaal = startkapitaal;

        for (int teller = 1; teller <= termijn; teller++) {
            System.out.println("kapitaal na " + teller + "jaar is € " + (kapitaal = kapitaal * rente) +".");

        }
    }
}
