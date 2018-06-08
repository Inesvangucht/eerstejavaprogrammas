package Animals;

public class Rabbit extends Animal {

    boolean fluffy;


    public Rabbit (String name) {
        super (name);
    }


    public boolean isFluffy() {
        int fluf = (int)( 2 * Math.random());
        return fluf > 0 ;
    }

    public void fluf() {
        if (isFluffy()) {
            System.out.println(this.name + " is fluffy.\n");
        } else {
            System.out.println(this.name + " is not fluffy.\n");
        }
    }


    @Override
    public void sound() {
        System.out.println(this.name + " makes a funny noise. Mieeeeeeep!!!\nSo cute!\n");
    }

}
