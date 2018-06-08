package be.vdab.beehive;

public abstract class Bee {

    /**
     * Super class: hieronder vallen de andere soorten, in dit geval de andere bijen.
     */


    String name;
//    int health;


    public String getName() {
        return this.name;
    }
    public void setName() {
        this.name = name;
    }


    public Bee(String name) {
        this.name = name;
    }


    public void doFly () {
            System.out.println(this.name + " flies around.");
        }

    //    public boolean canFly() {
//        return this.health >= 30;
//    }


}
