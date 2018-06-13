package Week4;

import java.util.Scanner;

public class MegaCalc {
    public static void main(String[] args) {

        /**
         * Deal with exceptions:
         *
         *
         *
         * */

        Scanner s = new Scanner(System.in);


        System.out.print("Geef waarde 1.");
        double getalA = s.nextDouble();

        System.out.print("Geef waarde 2.");
        double getalB = s.nextDouble();


        boolean good = false;
        int counter = 1;
        while(!good && counter <= 3) {
            try {
                System.out.print("Geef bewerking ( poging" + counter + "): ");
                String val = s.next();
                Bewerking keuze = Bewerking.valueOf(val);
                good = true;
            } catch (IllegalArgumentException e) {
                System.out.println("FOUTE INVOER, OPNIEUW!");
                counter++;
            }
        }
        if (counter >= 3) {
            System.out.println("Giving up.");
        }

//        System.out.println(keuze);
//        int resultaat = 0;



//        System.out.println("Het resultaat is " + resultaat );



//        System.out.println("Je koos " + getalA + " en " + getalB + ".\nWat wil je doen met deze getallen?");
//        String bewerking = s.nextLine();
//
//        Bewerking.getMaal(getalA, getalB);







    }
}
