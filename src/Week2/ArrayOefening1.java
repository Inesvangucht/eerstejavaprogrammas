package Week2;

public class ArrayOefening1 {
    public static void main(String[] args) {


        int[] j = {1, 2 , 5, 7, 9, -6, 12};


        for (int teller = 0; teller < j.length; teller++) {

            System.out.println(j[teller]);

        }




        String[] namen = {"Janice", "Jim", "Jill", "Jody", "James"};

        for (int count = 0; count < namen.length; count++) {

            System.out.println(namen[count]);
        }

        // sneller met ander soort 'for loop' sneller als je 'iter' gebruikt

        for (String naam : namen) {
            System.out.println(naam);
        }

    }

}
