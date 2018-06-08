package Animals;

public class Cat extends Animal {

    public int lives;

    public Cat(String name, int lives) {
        super(name);
        this.lives = 9;
    }

    public void scratch (Cat target) {
        System.out.println(this.getName() + " scratches " + target.name + ".");
        target.lives -= 1;
        System.out.println(target.name + " loses one live and has now " + target.lives + " lives.\n");
    }




    @Override
    public void sound() {
        System.out.println(this.name + " spins. Prrrrrrrrrrrr!!!\n");
    }




}
