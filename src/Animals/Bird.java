package Animals;

public class Bird extends Animal {

    public Bird (String name) {
        super(name);
    }

    public void fly() {
        System.out.println(this.name + " flies around.\n");
        this.sound();
    }

    @Override
    public void sound() {
        System.out.println(this.name + " chilps. Tjiieeeppp tjieeeep!!\n");
    }

}
