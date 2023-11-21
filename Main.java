import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        System.out.println(dragon.state());
        System.out.println(); // blank line
        int attackAmt = dragon.attack();
        System.out.println(); // blank line
        dragon.takeDamage(20);
        System.out.println(); // blank line
        dragon.powerUp(1);
        System.out.println(); // blank line
        dragon.powerUp(2);
        System.out.println(); // blank line
        dragon.powerUp(2);
        System.out.println(); // blank line
        dragon.powerUp(2);
        System.out.println(); // blank line
        int attackAmt2 = dragon.attack();
        System.out.println(); // blank line
        System.out.println(dragon.state());
        System.out.println(); // blank line
        System.out.println(dragon.state());
        System.out.println(); // blank line
        dragon.takeDamage(70);
        System.out.println(); // blank line
        dragon.powerUp(2);
        System.out.println(); // blank line
        int attackAmt3 = dragon.attack();
        System.out.println(); // blank line
        dragon.powerUp(2);
        System.out.println(); // blank line
        System.out.println(dragon.state());
        System.out.println(); // blank line
        int attackAmt4 = dragon.attack();
        System.out.println(); // blank line
        System.out.println(dragon.state());
        System.out.println(); // blank line
        dragon.takeDamage(65);
        System.out.println(); // blank line
        dragon.takeDamage(40);
        System.out.println(); // blank line
        dragon.takeDamage(10);
        System.out.println(); // blank line
        System.out.println(dragon.state());
        System.out.println(); // blank line
        System.out.println(dragon.getStrength());
        System.out.println(); // blank line
        System.out.println(dragon.getHealth());
        System.out.println(); // blank line
        System.out.println(dragon.getLevel());
        System.out.println(); // blank line
        System.out.println(dragon.isDead());
        System.out.println(); // blank line
    }
}

