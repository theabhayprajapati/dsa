package OOPs.game;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Player player1 = new Player("Abhay", "sword", 100);
        System.out.println(player1.getName() + " has " + player1.getHealth() + " health");

    }
}