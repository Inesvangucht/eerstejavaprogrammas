package be.vdab.beehive;


//verwijzing naar Bee -----
public class Worker extends Bee{

    //buiten de static, hier bepalen workers hebben een capacity en een load

    int capacity;
    int load;

    public Worker (String name, int initialCapacity, int initialLoad) {
        super(name);
        System.out.println("Constructor");
        capacity = initialCapacity;
        load = initialLoad;
    }

    //niet static, static is een globale functie. steunt niet op context

    public void gatherNectar() {
        for (int i=0; i <10 && capacity > load; i++) {
            //visit flower
            System.out.println("Visit next flower.");
            load +=5;
        }
    }

}
