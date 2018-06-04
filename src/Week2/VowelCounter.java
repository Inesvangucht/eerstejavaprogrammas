package Week2;

import java.util.Scanner;

/**
 * OEFENING 1: Vowel Counter
 *  - vraag aan de gebruiker een input text
 *  - String -> conveer naar char []
 *  - tel alle klinkers
 *      A: 7 keer
 *      E: 3 keer
 *      O:
 *      I:
 *      U:
 */

public class VowelCounter {

    public static void main(String[] args) {

       System.out.println("Voer een tekst in.");

        /*Scanner sc = new Scanner(System.in);
        String tekst = sc.next("");

        System.out.println(tekst); */

        //tekst tekens tellen --> aantal
        //aantal bepaalt lengte array


        String tekstTest = "Hallo!! Hoe gaat het!!";  // veranderen naar input
        int aantal = tekstTest.length();
        System.out.println(tekstTest);
        String tekstLow = tekstTest.toLowerCase();
        System.out.println("aantal tekens is " + aantal);

        char[] tekens = new char [aantal];

        char[] tekensLow = tekstLow.toCharArray();


        for (char teken : tekensLow) {
            System.out.print(teken + " / ");
        }

      //  char [] klinkers = {'a', 'e', 'i', 'o', 'u'};

       int a = 0, e= 0, i= 0, o= 0, u= 0;

        //loopt door de array en telt bij int van klinker 1 bij

        //for (int teller = 0; teller <= aantal; teller++) { }
        for (int t1 = 0; t1 < tekstLow.length();t1++)
            while (tekensLow[t1] == 'a') {
            a++;
            }

        System.out.println("is" +a);

            }
}
