package Week4;

import java.text.DecimalFormat;

public class Decimaal {

    public static void main(String[] args) {

        double getal = 1507.83;

        //output --> 1.507,83 €


        DecimalFormat euroFormat = new DecimalFormat("#,##0.00 €");

        System.out.println(euroFormat.format(getal));

        String getalFormat = euroFormat.format(getal);
        System.out.println(getalFormat);

//        double origineel = getalFormat;

        /**
         * opzoeken parse
         */





    }

}
