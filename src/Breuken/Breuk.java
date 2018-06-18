package Breuken;

import static java.lang.Math.*;

public class Breuk {


    private int teller;
    private int noemer;




    /**
     * Calculates the "greatest common factor" (GCF) or "greatest common divisor" (GCD) of two integers (Z).
     * @param teller First integer.
     * @param noemer Second integer.
     * @return The greatest common factor of the two specified integers.
     */

    public Breuk (int teller, int noemer) {
        this.teller = teller;

        if (noemer == 0) {
            throw new IllegalArgumentException("Noemer mag niet 0 zijn!");
        }
        this.noemer = noemer;

    }

    public static int grootstGemeneDeler(int teller, int noemer) {
        if (teller == 0 || noemer == 0) {
            return 1;
        }

        teller = abs(teller);
        noemer = abs(noemer);
        if(teller < noemer) {
            return grootstGemeneDeler(noemer, teller);
        }

        int delta = teller % noemer;
        if(delta == 0) {
            return noemer;
        } else {
            return grootstGemeneDeler(noemer, delta);
        }
    }



}
