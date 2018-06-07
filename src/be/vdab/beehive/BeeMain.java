package be.vdab.beehive;

public class BeeMain {
    public static void main(String[] args) {

        Bee maya = new Bee ("Maya");

        maya.doFly();


        Worker benny = new Worker("Benny", 80, 10);

        benny.doFly();

    }





}
