package Animals;

public class Lion extends Cat {

    private int power ;

    public Lion (String name,  int lives) {
        super(name, lives);
        int power = 50;
    }

    @Override
    public void sound() {
        System.out.println(this.name + " roars.  Rooooaaaaaarrrrrrr!!!\n");
    }


}
