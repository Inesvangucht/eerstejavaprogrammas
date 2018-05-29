package com.inesvangucht;

public class HelloWorld {

    public static void main(String[] args) {

       /*String myname = "Inés";
        float dagloon = 100;
        double aantalDagen = 20;
        int  aantalKinderen = 1;
        double perKind = 50;
        double treinAbonnement = 150;
        double brutoloon = dagloon * aantalDagen;
        double kindergeld = aantalKinderen * perKind;
        boolean bedrijfswagen = true;
        double nettoloon = brutoloon + kindergeld;

        if (bedrijfswagen == false){
            nettoloon = nettoloon + treinAbonnement;
            System.out.println("Het nettoloon bedraagt: " + nettoloon);
            }




        System.out.println("Hello World " + myname);*/

       int aantal = 5;
       double calPerServ = 300;
       short cookiesPerBag = 40;
       short servPerBag = 10;
       double cookiesPerServ = cookiesPerBag / servPerBag;
       double calPerCooky = calPerServ / cookiesPerBag;

        System.out.println("Je hebt " + aantal * calPerCooky + " caloriën binnen." );


    }
}
