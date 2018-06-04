package Week3;

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

        Scanner s = new Scanner(System.in);
        String input = s.nextLine().toLowerCase();
        char[] data = converteerNaarArray(input);

        int a = 0, e= 0, i= 0, o= 0, u= 0;

       //

        for (char datum : data) {
            if (datum == 'a') {
                a++;
            } else if (datum == 'e') {
                e++;
            }else if (datum == 'i') {
                i++;
            }
            else if (datum == 'o') {
                o++;
            }
            else if (datum == 'u') {
                u++;
            }


        }
        System.out.println("A: " + a);
        System.out.println("E: " + e);
        System.out.println("I: " + i);
        System.out.println("O: " + o);
        System.out.println("U: " + u);

    }

        public static char [] converteerNaarArray(String in) {

        in.length();char[] out = new char[in.length()];
        for (int i = 0; i < out.length; i++) {
            char ch = in.charAt(i);

        }

        return out;


    }
}
