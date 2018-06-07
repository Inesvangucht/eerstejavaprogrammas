package be.vdab.beehive;

public class Soldier extends Bee{

    int hitpoints = 100;
    int strength = 10;
    int armour = 5;
    int attack = 10;
    int critical;

    public Soldier (String name) {
        super(name);
    }



    public void strongAttack(Soldier target) {

       target.hitpoints -= (this.strength * 1.5) - target.armour;
       this.hitpoints -= (target.strength * 0.5) - this.armour;

    }

    public void quickAttack() {

    }

    public boolean isDead() {
        return hitpoints <= 0;
    }



}
