package com.inesvangucht;

public class Mosselmaanden {
    public static void main(String[] args) {
        String maand = "jan";

        switch (maand) {
            case "sep":
                System.out.println("Te klein.");
                break;


            case "okt":
            case "nov":
            case "dec":

                System.out.println("Superlekker!");
                break;

            case "jan":
            case "feb":
            case "maa":
            case "apr":

                System.out.println("Einde seizoen.");
                break;


            default:
                System.out.println("Afblijven!!");

        }
    }
}
