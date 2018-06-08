package Animals;

public abstract class Animal {

    /**
     * Hoogste class
     */

    protected String name;

    public String getName () {
        return this.name;
    }

    public void setName () {
        this.name = name;
    }


    /**
     * Constructor
     */

    public Animal (String name) {
        this.name = name;
    }


    public abstract void sound();


}
