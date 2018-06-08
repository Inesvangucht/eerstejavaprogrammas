package Animals;

public class Dog extends Animal {


    String[] tricks = {"sits" , "rolls over" , "plays dead", "jumps", "spins around", "stands on two legs"};
    int rand = (int) ((tricks.length ) * Math.random());
    String trick = tricks[rand];





    public Dog (String name) {
        super(name);
    }

    public void perform () {

        System.out.println(this.name + " " + trick + ".\n");
    }

    public void bite () {

    }

    @Override
    public void sound() {
        System.out.println(this.name + "barks. Woooofff woooooofff!!!\n");
    }



}
