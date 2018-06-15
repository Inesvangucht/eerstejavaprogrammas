package Week4;

import java.util.ArrayList;
import java.util.Date;

public class OefeningArrayList {

    public static void main(String[] args) {

        /**
         * Tussen < > als de lijst uitsluitend uit 1 type object bestaat.
         */

        ArrayList<String> namen = new ArrayList();
        namen.add ("Jimi");
        namen.add ("Janis");
        namen.add ("Amy");
        namen.add ("Kurt");
        namen.add ("Jim");

        for (int i = 0; i < namen.size(); i++ ) {
            System.out.println(namen.get(i).toUpperCase());
        }

        System.out.println("\n");

        namen.remove(4);
        namen.remove(1);
        namen.remove("Jimi");

        for (int i = 0; i < namen.size(); i++ ) {
            System.out.println(namen.get(i).toUpperCase());
        }


        Date datum = new Date();
        datum.setYear(2000);
        System.out.println(datum);



    }

}
