package OOPs.game;

/**
 * Player2
 */
public class Player2 extends Player {
    private int health;
    private boolean armour;

    // constructor
    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    // override damagebygun1
    @Override
    public void damageByGun1() {
        if (armour) {
            this.health -= 20;
            if (this.health <= 0)
                this.health = 0;
            System.out.println("armour is on so ; got damaged by gun1" + " and now has " + this.health + " health");

        } else {
            this.health -= 30;
            if (this.health <= 0)
                this.health = 0;
            System.out.println("armour is off so ; got damaged by gun1" + " and now has " + this.health + " health");
        }
        if (this.health == 0) {
            System.out.println("Player " + getName() + " is dead");
        }
    }

    // override gun 2
    @Override
    public void damageByGun2() {
        if (armour) {
            this.health -= 40;
            if (this.health <= 0)
                this.health = 0;
            System.out.println("armour is on so ; got damaged by gun2" + " and now has " + this.health + " health");

        } else {
            this.health -= 50;
            if (this.health <= 0)
                this.health = 0;
            System.out.println("armour is off so ; got damaged by gun2" + " and now has " + this.health + " health");
        }
        if (this.health == 0) {
            System.out.println("Player " + getName() + " is dead");
        }
    }
}