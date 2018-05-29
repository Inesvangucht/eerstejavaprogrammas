package com.inesvangucht;

public class Vierkant {
    public static void main(String[] args) {



        /*for (int teller = 0; teller <= 9; teller++)
        {
            System.out.print(teller + " ");

        }
*/
        int getal = 1;
        int teller = 1;

        while (getal < 101) {
            if ((getal % 10) == 0)
            {
                System.out.println(getal + " ");
            }
            else System.out.print(getal + " ");
            getal = getal + 1;
        }

    }
}
