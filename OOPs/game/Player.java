package OOPs.game;

/**
 * Player
 */
public class Player {

    private String name;
    private String weapon;
    private int health;

    public Player(String name, String weapon, int health) {
        this.name = name;
        this.weapon = weapon;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHealth() {
        return health;
    }

    public void damageByGun1() {
        this.health -= 30;
        if (this.health <= 0) {
            health = 0;
        }
        System.out.println(this.name + " got damaged by gun1" + " and now has " + this.health + " health");
        if (this.health == 0) {
            System.out.println("Player " + this.name + " is dead");
        }
    }

    public void damageByGun2() {
        this.health -= 50;
        if (this.health <= 0) {
            health = 0;
        }
        System.out.println(this.name + " got damaged by gun2" + " and now has " + this.health + " health");
        if (this.health == 0) {
            System.out.println("Player " + this.name + " is dead");
        }
    }

}