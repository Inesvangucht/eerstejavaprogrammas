package com.inesvangucht;

public class SomHonderd {
    public static void main(String[] args) {

        int i = 0;
        int totaal = 0;
        while (i <= 100)
        {
            totaal = totaal + i;
            i = i + 1;  // i++ is hier net hetzelfde
        }
        System.out.println(totaal);
    }
}
